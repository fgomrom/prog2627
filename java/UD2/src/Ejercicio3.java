
import java.util.Scanner;

/**
 *
 * @author Fran Gómez
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        String usuario = "Fran";
        final String USUARIO_CORRECTO = "Fran";
        // Si el usuario introducido coincide con USUARIO_CORRECTO
        // le damos la bienvenida, en otro caso, continua el programa
        if (usuario == USUARIO_CORRECTO) {
            System.out.println("¡Bienvenido " + usuario + "!");
        } else {
            System.out.println("Usuario Incorrecto");
        }
        // Si no se cumple, decimos que "Usuario Incorrecto"
        System.out.println("Fin2");
    }
}
