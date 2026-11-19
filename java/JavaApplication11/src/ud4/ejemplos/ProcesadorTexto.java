/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud4.ejemplos;

/**
 *
 * @author Fran Gómez
 */
public class ProcesadorTexto {
    public static void main(String[] args) {

        String frase = "  Estoy aprendiendo Java  ";

        // Eliminar espacios exteriores
        String limpia = frase.trim();

        // Convertir a mayúsculas
        String mayusculas = limpia.toUpperCase();

        // Buscar una palabra
        boolean contieneJava = limpia.contains("Java");

        // Obtener una parte de la cadena
        String parte = limpia.substring(0, 5);

        // Sustituir una palabra
        String modificada = limpia.replace("Java", "Python");

        System.out.println("Original: [" + frase + "]");
        System.out.println("Limpia: " + limpia);
        System.out.println("Mayúsculas: " + mayusculas);
        System.out.println("Contiene Java: " + contieneJava);
        System.out.println("Primeros caracteres: " + parte);
        System.out.println("Modificada: " + modificada);
    }

}
