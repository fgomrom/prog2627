package ud4.ejemplos;

public class NewClass {
    public static  boolean esPar (int num){
        if (num % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
    
    public static  boolean esImpar (int num){
        if (num % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        for (int i = 1 ; i <= 10; i++) {
            if ((esPar (i))){
                System.out.println("los numeros pares son: " + i);
            }
        }
    }
}
