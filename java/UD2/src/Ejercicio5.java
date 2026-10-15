
import java.util.Scanner;

/**
 *
 * @author Fran Gómez
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introuzca número a: ");
        int a = sc.nextInt();
        System.out.println("Introuzca número b: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("a es mayor");
        } 
        if (a < b) {
            System.out.println("b es mayor");
        } 
        if (a == b) {
            System.out.println("Iguales");
        }
    }
}
