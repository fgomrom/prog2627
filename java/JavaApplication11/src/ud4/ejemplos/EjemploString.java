package ud4.ejemplos;

import java.util.Scanner;

public class EjemploString {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
//        String nombre = teclado.nextLine();
        
//        System.out.println("Fran".equals(nombre));
        String a = "Fran";
        String b = "Fran";
        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.print("Introduce tu ciudad: ");
        String ciudad = teclado.nextLine();

        System.out.print("Introduce tu edad: ");
        int edad = teclado.nextInt();

//        System.out.println("\n--- FICHA DE USUARIO ---");
//        System.out.println("Nombre: " + nombre);
//        System.out.println("Ciudad: " + ciudad);
//        System.out.println("Edad: " + edad);
//        System.out.println("Caracteres del nombre: " + nombre.length());

        teclado.close();

    }
}
