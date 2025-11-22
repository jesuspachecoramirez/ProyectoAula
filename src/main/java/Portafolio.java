import java.util.ArrayList;


public class Portafolio {
    private String nombre = "Jesus Pacheco";
    private String titulo = "Desarrollador Backend | RPA | Salesforce";
    private int edad = 36;
    private String[] habilidades = {"Java", "Python", "Selenium", "RestAssured", "Apex", "Git", "Postman", "Azure", "Metodologías ágiles"};

    private ArrayList<Estudio> estudios = new ArrayList<>();
    private ArrayList<Proyecto> proyectos = new ArrayList<>();

    private ArrayList<Experiencia>experiencias = new ArrayList<>();

    public Portafolio() {
        cargarEstudios();
        cargarProyectos();
        cargarExperiencia();
    }

    private void cargarEstudios() {
        estudios.add(new Estudio("Tecnico en Sistemas", "SENA", 2017, 2019));
        estudios.add(new Estudio("Desarrollo Web", "Universidad del Bosque", 2020, 2021));
        estudios.add(new Estudio("Automatizacion y QA", "Sofka U", 2022, 2022));
        estudios.add(new Estudio("Tecnologia en Desarrollo Web", "ITM", 2025,0));
    }

    private void cargarProyectos() {
        proyectos.add(new Proyecto("Automatizacion Carrera", "https://github.com/jesuspachecoramirez/Reto-Carros.git"));
        proyectos.add(new Proyecto("Juego de Preguntas", "https://github.com/jesuspachecoramirez/Reto-Preguntas.git"));
        proyectos.add(new Proyecto("Juego de Ping Pong", "https://github.com/jesuspachecoramirez/juegoPinPon.git"));
        proyectos.add(new Proyecto("Automatizacion con Rest Assured", "https://github.com/jesuspachecoramirez/Reto_Assured.git"));
        proyectos.add(new Proyecto("Automatizacion con ScreenPlay", "https://github.com/jesuspachecoramirez/RetoScreenplayWEB.git"));
        proyectos.add(new Proyecto("Automatizacion con ScreenPlay y Serenity", "https://github.com/jesuspachecoramirez/Reto_Screenplay.git"));
        proyectos.add(new Proyecto("Automatizacion con POM", "https://github.com/jesuspachecoramirez/Reto_Pom_Factory.git"));
        proyectos.add(new Proyecto("Automatizacion con Page Factory", "https://github.com/jesuspachecoramirez/Reto_Pom_Factory2.git"));
        proyectos.add(new Proyecto("Automatizacion con Rest Assured 2","https://github.com/jesuspachecoramirez/Reto_Assured2.git"));


    }

    private void cargarExperiencia(){
        experiencias.add(new Experiencia("Instituto de Investigacion Maritima", "Auxiliar de Sistemas", 2018,2019));
        experiencias.add(new Experiencia("Analista de Calidad", "Sofka", 2022, 2023));
        experiencias.add(new Experiencia("Desarrollador RPA", "Savant-BPO", 2023, 2023));
        experiencias.add(new Experiencia("Desarrollador Salesforce", "Savant-BPO", 2023, 0));
        experiencias.add(new Experiencia("Lider Técnico", "Savant", 2024, 0));
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getTitulo() { return titulo; }
    public int getEdad() { return edad; }
    public String[] getHabilidades() { return habilidades; }
    public ArrayList<Estudio> getEstudios() { return estudios; }
    public ArrayList<Proyecto> getProyectos() { return proyectos; }
    public ArrayList<Experiencia> getExperiencias(){return experiencias;}
}
