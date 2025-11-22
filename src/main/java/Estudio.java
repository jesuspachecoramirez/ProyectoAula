
/**
 * Representa un estudio o certificación dentro del portafolio.
 * Guarda el título obtenido, la institución y el rango de años.
 */
public class Estudio {
    private String titulo, institucion; // Nombre del estudio y la institución donde se realizó
    private int añoInicio, añoFin;  // Año inicial y final (0 significa que aún está en curso)

    public static final String AZUL = "\u001B[36m";
    public static final String VERDE = "\u001B[32m";
    public static final String RESET = "\u001B[0m";


    // Crea un nuevo registro de estudio.
    public Estudio(String titulo, String institucion, int añoInicio, int añoFin) {
        this.titulo = titulo;
        this.institucion = institucion;
        this.añoInicio = añoInicio;
        this.añoFin = añoFin;
    }


    /* Devuelve una representación en texto de los estudios,formateada con colores para consola.
    Si añoFin es 0, se muestra como "Actual"*/
    @Override
    public String toString() {
        String fin = (añoFin == 0) ? "Actual" : String.valueOf(añoFin);
        return "• " +AZUL+ titulo + RESET+" - " + VERDE + institucion + " (" + añoInicio + " - " + fin + ")"+RESET;
    }

}
