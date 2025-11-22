
/**
 * Representa una experiencia laboral dentro del portafolio.
 * Incluye empresa, cargo desempeñado y rango de años.
 */
public class Experiencia {

    private String empresa, cargo; // Nombre de la empresa y cargo desempeñado
    private int añoInicio, añoFin; // Año de inicio y fin (0 significa que sigue vigente)

    public static final String AZUL = "\u001B[36m";
    public static final String VERDE = "\u001B[32m";
    public static final String RESET = "\u001B[0m";

    // Crea una nueva experiencia laboral.
    public Experiencia(String empresa, String cargo, int añoInicio, int añoFin){
        this.empresa = empresa;
        this.cargo = cargo;
        this.añoInicio= añoInicio;
        this.añoFin= añoFin;
    }
    /* Devuelve una representación en texto de los estudios,formateada con colores para consola.
       Si añoFin es 0, se muestra como "Actual"*/
    @Override
    public String toString() {
        String fin = (añoFin == 0) ? "Actual" : String.valueOf(añoFin);
        return "• " +AZUL+ empresa+RESET + " - " + VERDE +cargo + " (" + añoInicio + " - " + fin + ")"+RESET;
    }

}
