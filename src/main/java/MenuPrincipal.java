import java.util.Scanner;
/**
 * Clase encargada de mostrar y gestionar el menú principal del portafolio en consola.
 * Permite navegar entre secciones como Sobre mí, Habilidades, Estudios, Experiencia, etc.
 */
public class MenuPrincipal {
    private Portafolio portafolio;  // Datos del portafolio a mostrar en el menú
    private Scanner sc = new Scanner(System.in);  // Lector de entradas por consola

    // Mapeo de las variables para la asignacion de colores ANSI
    public static final String ROJO = "\u001B[31m";
    public static final String AZUL = "\u001B[36m";
    public static final String VERDE = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLANCO = "\u001B[1;37m";
    public static final String RESET = "\u001B[0m";

    /**
     * Crea el menú principal usando la información del portafolio.
     * objeto con los datos personales, estudios, habilidades, etc.
     */
    public MenuPrincipal(Portafolio portafolio) {
        this.portafolio = portafolio;
    }

    /**
     * Muestra el menú principal en consola y gestiona la navegación del usuario.
     * Repite el menú hasta que el usuario elija salir.
     */
    public void mostrarMenu() {
        // Cabecera del menú (título y presentación)
        System.out.println("|====================================================|");
        System.out.println(AZUL+"|     PRESENTACIÓN PERSONAL - " + portafolio.getNombre()+"          |"+RESET);
        System.out.println("|====================================================|");
        System.out.println( AZUL+"|     "+portafolio.getTitulo()+"       |"+RESET);
        System.out.println("|====================================================|");

        // Ciclo principal del menú: se repite hasta que el usuario elija "Salir"
        int opcion;
        do {
            System.out.println(BLANCO+"\n1. Sobre mí    2. Habilidades    3. Estudios");
            System.out.println("4. Experiencias    5. Proyectos Auto  6. Experiencia Pokemon");
            System.out.println("7. Salir");
            System.out.print("\n→ Opción: "+RESET);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> sobreMi();
                case 2 -> mostrarHabilidades();
                case 3 -> mostrarEstudios();
                case 4 -> mostrarExperiencia();
                case 5 -> mostrarProyectosAutomatizacion();
                case 6 -> System.out.println(ApiService.obtenerPokemonAleatorio());
                case 7 -> System.out.println(YELLOW+"\n¡Gracias por visitar mi portafolio! 🚀\n"+RESET);
                default -> System.out.println(ROJO+"Opción inválida. Escoje un numero del menu"+RESET);
            }
        } while (opcion != 7);
    }

    //Imprime la sección "Sobre mí" con información básica del portafolio.
    private void sobreMi() {
        System.out.println(ROJO+"\n=== SOBRE MÍ ==="+RESET);
        System.out.println("--------------------");
        System.out.println(AZUL+"Mi Nombre es "+ portafolio.getNombre()+"," + "tengo " + portafolio.getEdad() + " años"+"."+RESET);
        System.out.println(AZUL+"Y trabajo como " + portafolio.getTitulo()+RESET);
        System.out.println(YELLOW +"Paso a paso avanzando en el mundo de la programación, la automatización y las APIs."+RESET);
        System.out.println(YELLOW +"Mejorando cada dia en Salesforce y Digital Experience."+RESET);
        System.out.println(VERDE +"\nGracias por estar aqui, puedes saber mas de mi y mis procesos con las demas opciones, tambien te invito" +
                " a participar en la pequeña experienca API de pokemon"+RESET);
    }

    // Imprime la lista de habilidades registradas en el portafolio.
    private void mostrarHabilidades() {
        System.out.println(ROJO+"\n=== MIS HABILIDADES ==="+RESET);
        for (String skill : portafolio.getHabilidades()) {
            System.out.println("✓ " + AZUL+skill+RESET);
        }
    }

    // Imprime estudios y certificaciones del portafolio.
    private void mostrarEstudios() {
        System.out.println(ROJO+"\n=== ESTUDIOS Y CERTIFICACIONES ==="+RESET);
        for (Estudio e : portafolio.getEstudios()) {
            System.out.println(e);
        }
    }

    // Imprime la experiencia laboral del portafolio.
    private void mostrarExperiencia(){
        System.out.println(ROJO+"\n=== EXPERIENCIAS LABORALES ==="+RESET);
        for (Experiencia ex : portafolio.getExperiencias()){
            System.out.println(ex);
        }
    }

    // Imprime los proyectos de automatización del portafolio.
    private void mostrarProyectosAutomatizacion() {
        System.out.println(ROJO+"\n=== PROYECTOS DE AUTOMATIZACIÓN ==="+RESET);
        var proyectos = portafolio.getProyectos();
        for (int i = 0; i < proyectos.size(); i++) {
            System.out.println((i+1) + ". " + proyectos.get(i).toString());
        }

    }




}