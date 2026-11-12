//package ud2.ejercicios;
//
//import java.util.Scanner;
//
//public class Ejercicio6 {
//    
//        
//    public static void main(String[] args) {
//
//        // Introducir las notas
//        System.out.print("Introduce la primera nota: ");
//        double nota1 = leerNota();
//
//        System.out.print("Introduce la segunda nota: ");
//        double nota2 = leerNota();
//
//        System.out.print("Introduce la tercera nota: ");
//        double nota3 = leerNota();
//
//        // Calcular la media
//        double media = calcularMedia(nota1,nota2,nota3);
//        
//        // Obtener la nota máxima
//        double maxima = nota1;
//
//        if (nota2 > maxima) {
//            maxima = nota2;
//        }
//
//        if (nota3 > maxima) {
//            maxima = nota3;
//        }
//
//        // Comprobar si está aprobado
//        boolean aprobado = media >= 5;
//
//        // Mostrar resultados
//        System.out.println("\n--- INFORME ACADÉMICO ---");
//        System.out.println("Media: " + media);
//        System.out.println("Nota máxima: " + maxima);
//
//        if (aprobado) {
//            System.out.println("Resultado: APROBADO");
//        } else {
//            System.out.println("Resultado: SUSPENSO");
//        }
//
//    }
//    
//    public static double leerNota() { 
//        Scanner teclado = new Scanner(System.in);
//        return teclado.nextDouble();
//    }
//    
//    /**
//     * 
//     * @param n1
//     * @param n2
//     * @param n3
//     * @return 
//     */
//    public static double raiz(double n1) {
//        return Math.;
//    }
//}
