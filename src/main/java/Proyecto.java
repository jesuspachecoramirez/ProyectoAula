
/**
 * Representa un proyecto dentro del portafolio.
 * Contiene el nombre del proyecto y su URL asociada.
 */
public class Proyecto {
    private String nombre; // Nombre del proyecto
    private String url; // Enlace del proyecto (GitHub)

    public static final String AZUL = "\u001B[36m";
    public static final String VERDE = "\u001B[32m";
    public static final String RESET = "\u001B[0m";

    // Crea un nuevo proyecto con su nombre y URL.
    public Proyecto(String nombre, String url) {
        this.nombre = nombre;
        this.url = url;
    }



    //Devuelve una representación en texto del proyecto,formateada con colores para consola.
    @Override
    public String toString() {
        return "• " +AZUL+ nombre+RESET + " → " + VERDE + url+ RESET;
    }


}