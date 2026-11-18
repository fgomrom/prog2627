package ud4.ejercicios;

public class Ejercicio13 {
    public static void main(String[] args) {
        int[] numeros = {12, 5, 8, 21, 4, 16, 9};
        int numero = 21;
        boolean encontrado = false;
        int posicion = -1;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numero == numeros[i]) {
                encontrado = true;
                posicion = i;
            }
        }
        
        System.out.println("Encontrado: " + encontrado);
        System.out.println("Posición: " + posicion);
    }
}
