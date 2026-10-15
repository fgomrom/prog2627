
import java.util.Scanner;

/**
 * Módulo de cálculo de combustible para el lanzamiento de cohetes.
 * Prueba Práctica Evaluativa - UD1
 * 
 * @author Solucionario Docente
 * @version 1.0
 */
public class CalculadoraCombustible {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        System.out.println(edad);

        // --- 1. CONSTANTES (CE 1f) ---
        // Consumo base por kilómetro y reserva obligatoria
        final double CONSUMO_POR_KM = 14.75;
        final int  RESERVA_SEGURIDAD = 500;
        

        // --- 2. VARIABLES Y TIPOS DE DATOS (CE 1d, 1e) ---
        // Distancia objetivo en km
        int distanciaKm = 5200;
        double precioLitro = 4.87;
        // Precio del litro en euros

        // --- 3. OPERADORES Y CÁLCULOS (CE 1g) ---
        // Cálculo con precisión decimal de los litros y costes
        double litrosTotalesExactos = (distanciaKm * CONSUMO_POR_KM) + RESERVA_SEGURIDAD;
        double costeTotalExacto = litrosTotalesExactos * precioLitro;


        // --- 4. CASTING EXPLÍCITO (CE 1h) ---
        // Truncado explícito de double a int para presupuestos
        int litrostotalesreales = (int) litrosTotalesExactos;
        int costeTotalReales = (int) costeTotalExacto;
        double distanciadecimales = distanciaKm;
    }
}

