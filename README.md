# Portafolio Profesional Interactivo - Jesús Pacheco

![Java](https://img.shields.io/badge/Java-17%2B-blue?logo=openjdk)
![Swing](https://img.shields.io/badge/Swing-GUI-brightgreen)
![PokeAPI](https://img.shields.io/badge/PokeAPI-Random%20Pokémon-ff69b4)
![License](https://img.shields.io/badge/License-MIT-yellow)

**Un portafolio personal interactivo desarrollado 100% en Java con programación orientada a objetos y consumo real de APIs.**

## Características

- Totalmente orientado a objetos
- Clases separadas en archivos individuales
- Consumo real de **PokeAPI**
- Pokémon aleatorio en cada ejecución
- Muestra nombre, tipos e imagen oficial
- Código limpio, comentado y profesional

## Tecnologías utilizadas

- Java 17+
- PokeAPI (API pública REST)

## Dependencias
<!-- Agrega esto a tu pom.xml si usas Maven -->
<dependency>
    <groupId>org.json</groupId>
    <artifactId>json</artifactId>
    <version>20231013</version>
</dependency>

## Estructura del proyecto
src/main/java/
PresentacionPersonal.java     → Main (punto de entrada)
Portafolio.java               → Datos personales encapsulados
Estudio.java                  → Clase para estudios/certificaciones
Experiencia.java              → Clase para experiencia laboral
MenuPrincipal.java            → Lógica del menú interactivo
Proyecto.java                 → Clase para Proyectos y Github 
ApiService.java               → Consumo de PokeAPI + Pokémon aleatorio

## Cómo ejecutarlo

### Desde IntelliJ / Eclipse / NetBeans
1. Abre el proyecto
2. Ejecuta la clase `PresentacionPersonal.java`

### Desde terminal bash
javac *.java
java PresentacionPersonal

### Con Maven
mvn compile
mvn exec:java -Dexec.mainClass="PresentacionPersonal"

