/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud4.ejercicios;

/**
 *
 * @author Fran Gómez
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        int[] a = {3,8,7,1,5,6};
        int temp;
           
        for (int i = 0; i < a.length / 2 ; i++) {
            temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        } 
    }
}
