package ud4.ejercicios;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca nombre completo:");
        String nombre = sc.next();
        String primerApellido = sc.next();
        String segundoApellido = sc.next();
        
        System.out.println("nombre: " + nombre);
        System.out.println("primer apellido: " + primerApellido);
        System.out.println("segundo apellido: " + segundoApellido);
        
        System.out.println("Nombre completo: " + nombre + 
                " " + primerApellido + " " + segundoApellido);
        
        System.out.println("Nombre completo: " + nombre.toUpperCase() + 
                " " + primerApellido.toUpperCase() + " " + segundoApellido.toUpperCase());
        
        System.out.println("Nombre completo: " + nombre + 
                " " + primerApellido + " " + segundoApellido);
    }
}
