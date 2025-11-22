public class Experiencia {

    private String empresa, cargo;
    private int añoInicio, añoFin;

    public static final String AZUL = "\u001B[36m";

    public static final String VERDE = "\u001B[32m";
    public static final String RESET = "\u001B[0m";

    public Experiencia(String empresa, String cargo, int añoInicio, int añoFin){
        this.empresa = empresa;
        this.cargo = cargo;
        this.añoInicio= añoInicio;
        this.añoFin= añoFin;
    }

    @Override
    public String toString() {
        String fin = (añoFin == 0) ? "Actual" : String.valueOf(añoFin);
        return "• " +AZUL+ empresa+RESET + " - " + VERDE +cargo + " (" + añoInicio + " - " + fin + ")"+RESET;
    }

}
