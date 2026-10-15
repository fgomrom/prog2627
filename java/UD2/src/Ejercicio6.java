
import java.util.Scanner;

/**
 *
 * @author Fran Gómez
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introuzca número: ");
        int x = sc.nextInt();
        
        if (x % 2 == 0) {
            System.out.println("Es Par");
        } else {
            System.out.println("Es Impar");
        }
    }
}
