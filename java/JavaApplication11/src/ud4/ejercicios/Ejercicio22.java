/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud4.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Fran Gómez
 */
public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una palabra:");
        String palabra = sc.nextLine();

        System.out.println("Palabra: " + palabra);

        System.out.println("Longitud: " + palabra.length());

        System.out.println("Primer caracter: " + palabra.charAt(0));

        System.out.println("Primer caracter: " + 
                palabra.charAt(palabra.length() - 1));
        
        if (palabra.length() > 10) 
            System.out.println("Tiene más de 10");
        else
            System.out.println("No tiene más de 10");
    }

}
