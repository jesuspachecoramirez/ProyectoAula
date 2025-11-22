public class Proyecto {
    private String nombre;
    private String url;

    public static final String AZUL = "\u001B[36m";

    public static final String VERDE = "\u001B[32m";
    public static final String RESET = "\u001B[0m";

    public Proyecto(String nombre, String url) {
        this.nombre = nombre;
        this.url = url;
    }



    @Override
    public String toString() {
        return "• " +AZUL+ nombre+RESET + " → " + VERDE + url+ RESET;
    }


}