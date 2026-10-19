
import java.util.Scanner;

/**
 *
 * @author Fran Gómez
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero");
        int num = sc.nextInt();
        num = Math.abs(num);
        int contador = 1;
        while (contador <= num) {
            System.out.println(contador);
            contador = contador + 1; 
        }
    }
}
