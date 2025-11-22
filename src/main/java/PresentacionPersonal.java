



/**
 * Clase principal del programa de presentación personal.
 * Crea el portafolio y lanza el menú de navegación en consola.
 */


public class PresentacionPersonal {
    public static void main(String[] args) {
        // Se crea el portafolio con los datos base
        Portafolio miPortafolio = new Portafolio();

        // Se inicializa el menú usando el portafolio
        MenuPrincipal menu = new MenuPrincipal(miPortafolio);

        // Se ejecuta el menú en consola
        menu.mostrarMenu();
    }
}

