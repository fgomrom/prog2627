/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud4.ejemplos;

/**
 *
 * @author Fran Gómez
 */
public class AnalizadorTexto {
    public static void main(String[] args) {

        String texto = "Java 2026 es genial";

        int vocales = 0;
        int digitos = 0;
        int espacios = 0;
        int palabras = 0;

        boolean dentroPalabra = false;

        String textoMinusculas = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {

            char c = texto.charAt(i);

            // Contar vocales
            if (c == 'a' || c == 'e' || c == 'i'
                    || c == 'o' || c == 'u') {
                vocales++;
            }

            // Contar dígitos
            if (Character.isDigit(c)) {
                digitos++;
            }

            // Contar espacios y palabras
            if (c == ' ') {
                espacios++;
                dentroPalabra = false;
            } else if (!dentroPalabra) {
                palabras++;
                dentroPalabra = true;
            }
        }

        System.out.println("Texto: " + texto);
        System.out.println("Caracteres: " + texto.length());
        System.out.println("Vocales: " + vocales);
        System.out.println("Dígitos: " + digitos);
        System.out.println("Espacios: " + espacios);
        System.out.println("Palabras: " + palabras);
    }

}
