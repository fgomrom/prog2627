package ud4.ejercicios;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca primera palabra:");
        String primeraPalabra = sc.nextLine();
        System.out.println("Introduzca segunda palabra:");
        String segundaPalabra = sc.nextLine();
        
        System.out.println("¿Son iguales?" + primeraPalabra.equals(segundaPalabra));
        
        System.out.println("¿Son iguales (ignore case)?" + primeraPalabra.equalsIgnoreCase(segundaPalabra));

        System.out.println("¿misma longitud?" + (primeraPalabra.length() == segundaPalabra.length()));
        
        System.out.println("¿empiezan por el mismo caracter? " + (primeraPalabra.charAt(0) == segundaPalabra.charAt(0)));
    }
}
