package ud4.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        double[] temperaturas = new double[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = sc.nextDouble();
        }
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println(temperaturas[i]);
        }
        System.out.println("Número de temperaturas almacenada: " + temperaturas.length);
        
        int[] a = {3,8,7,1,5,6};
        int temp;
           
        for (int i = 0; i < a.length / 2 ; i++) {
            temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }      
        
    }
}
