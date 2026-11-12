package ud4.ejemplos;
import java.util.Scanner;

public class EjemploArrays {
    public static void main(String[] args) {
        double[] temperaturas = {18.5, 21.0, 24.5, 19.0, 27.5}; //TODO en dos líneas
        //System.out.println("Temperaturas: " + temperaturas);
        
        for (int i = 0; i <= temperaturas.length - 1; i++) {
            System.out.println("Día " + (i + 1) +" - " + temperaturas[i]);
        }
        
        temperaturas[1] = 22.0;
        //temperaturas[5] = 26.0;
        
        System.out.println(temperaturas[1]);
    }
}
