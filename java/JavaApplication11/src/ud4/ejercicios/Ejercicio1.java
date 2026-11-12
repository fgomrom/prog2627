package ud4.ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numero = {1,2,3,4,5};
        imprimeArray(numero);
        numero[2] = 25;
        imprimeArray(numero);
    }
    
    public static void imprimeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
