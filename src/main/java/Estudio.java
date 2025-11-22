

public class Estudio {
    private String titulo, institucion;
    private int añoInicio, añoFin;

    public static final String AZUL = "\u001B[36m";

    public static final String VERDE = "\u001B[32m";
    public static final String RESET = "\u001B[0m";


    public Estudio(String titulo, String institucion, int añoInicio, int añoFin) {
        this.titulo = titulo;
        this.institucion = institucion;
        this.añoInicio = añoInicio;
        this.añoFin = añoFin;
    }



    @Override
    public String toString() {
        String fin = (añoFin == 0) ? "Actual" : String.valueOf(añoFin);
        return "• " +AZUL+ titulo + RESET+" - " + VERDE + institucion + " (" + añoInicio + " - " + fin + ")"+RESET;
    }

}
