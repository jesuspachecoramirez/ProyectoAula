import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Random;
import org.json.JSONObject;
import org.json.JSONArray;

/**
 * Servicio encargado de consumir la PokeAPI.
 * Obtiene un Pokémon aleatorio y extrae información básica como nombre, tipos e imagen.
 */
public class ApiService {
    // Mapeo de las variables para la asignacion de colores ANSI
    public static final String ROJO = "\u001B[31m";
    public static final String AZUL = "\u001B[36m";
    public static final String YELLOW = "\u001B[33m";
    public static final String VERDE = "\u001B[32m";
    public static final String RESET = "\u001B[0m";
    private static final Random random = new Random(); // Generador de IDs aleatorios

    private static final int MAX_POKEMON_ID = 1025; // Hay 1025 Pokémon oficiales en PokeAPI

    //Obtiene un Pokémon aleatorio desde la PokeAPI
    public static String obtenerPokemonAleatorio() {

        // Genera un ID aleatorio entre 1 y MAX_POKEMON_ID
        int id = random.nextInt(MAX_POKEMON_ID) + 1;  // Pokémon del 1 al 1025

        StringBuilder resultado = new StringBuilder();
        resultado.append(ROJO+"=== ¡POKÉMON ALEATORIO DEL DÍA! ===\n\n"+RESET);
        resultado.append(YELLOW +"Buscando en PokeAPI... (ID: ").append(id).append(")\n\n"+RESET);

        try {
            HttpClient client = HttpClient.newHttpClient();

            // 1. Obtener datos básicos del Pokémon
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://pokeapi.co/api/v2/pokemon/" + id))
                    .build();

            // Envía la solicitud y obtiene la respuesta como String JSON
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Si la API no responde OK, se devuelve un mensaje de error
            if (response.statusCode() != 200) {
                return "Error: No se encontró el Pokémon con ID " + id;
            }

            String json = response.body();

            // Extrae datos principales del JSON
            String nombre = extraerNombrePokemon(json);
            String sprite = extraerSprite(json);
            String tipos = extraerTipos(json);

            // Arma el resultado para consola
            resultado.append(VERDE +"Este es tu Pokemon de la suerte\n"+RESET);
            resultado.append("Nombre: ").append(AZUL+nombre+RESET).append("\n");
            resultado.append("Tipos: ").append(AZUL+tipos+RESET).append("\n");
            resultado.append("Imagen:\n").append(AZUL+sprite+RESET).append("\n\n");


        } catch (Exception e) {
            resultado.append("✗ Error al conectar con PokeAPI:\n");
            resultado.append(e.getMessage());
        }

        return resultado.toString();
    }

    // Extrae un valor JSON simple como "name": "pikachu"
    private static String extraerNombrePokemon(String json) {
        JSONObject obj = new JSONObject(json);
        String name = obj.getString("name");
        return name;
    }
    // Extrae un valor JSON con la url de la imagen del pokemon
    private static String extraerSprite(String json) {
        JSONObject obj = new JSONObject(json);
        JSONObject sprites = obj.getJSONObject("sprites");
        JSONObject other = sprites.getJSONObject("other");
        JSONObject home = other.getJSONObject("home");
        String front = home.getString("front_default");
        if (front != null){
            return front;
        }else{
            return sprites.getString("front_default");
        }
    }

    // Extrae los tipos del Pokémon (puede tener 1 o 2)
    private static String extraerTipos(String json) {
        String tipo1 = null;
        String tipo2 = null;
        String type;
        int count = 1;
        JSONObject obj = new JSONObject(json);
        JSONArray typesArray = obj.getJSONArray("types");
        for (int i = 0; i < typesArray.length(); i++){
            JSONObject typeobj = typesArray.getJSONObject(i);
            int slot = typeobj.getInt("slot");
            String typename = typeobj.getJSONObject("type").getString("name");
            if (slot == 1){
                tipo1 = typename;
            } else if (slot == 2) {
                tipo2 = typename;
                count = 2;
            }

        }
        if (count == 1){
            type = tipo1;
        }else{
            type = (tipo1 + "/"+tipo2);
        }
        return type;

    }


}