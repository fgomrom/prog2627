/**
 * Módulo de Gestión de Inventario y Comercio Espacial.
 * Simula la compra de ítems, actualización de oro y estado de carga.
 * 
 * @author Profesor de Programación (PROG) / Alumno
 * @version 1.0
 */
public class GestionInventario {

    public static void main(String[] args) {

        // ==========================================
        // 1. DECLARACIÓN DE VARIABLES E INICIALIZACIÓN (CE 1d)
        // ==========================================

        // Cantidad inicial de pociones en la mochila
        int cantidadPociones = 2;

        // Precio individual de cada poción de salud (créditos)
        double precioPocion = 15.50;

        // Oro total disponible en el monedero del explorador
        double oroDisponible = 100.0;

        // Capacidad máxima de la mochila
        final int CAPACIDAD_MAXIMA = 10;

        // Estado del inventario (¿Mochila llena?)
        boolean mochilaLlena = false;


        // ==========================================
        // 2. ESTADO INICIAL
        // ==========================================

        System.out.println("==================================================");
        System.out.println("         TIENDA ESTELAR - ESTADO INICIAL          ");
        System.out.println("==================================================");
        System.out.println("Oro en monedero: " + oroDisponible + " créditos");
        System.out.println("Pociones en mochila: " + cantidadPociones);
        System.out.println("¿Mochila llena?: " + mochilaLlena);
        System.out.println("--------------------------------------------------");


        // ==========================================
        // 3. OPERACIONES DE COMPRA Y MODIFICACIÓN (CE 1e, 1g)
        // ==========================================

        int pocionesAComprar = 3;
        double costeTotal = pocionesAComprar * precioPocion;

        // Descontamos el coste total del oro disponible
        oroDisponible -= costeTotal; // Equivale a: oroDisponible = oroDisponible - costeTotal

        // Incrementamos la cantidad de pociones guardadas
        cantidadPociones += pocionesAComprar; // Equivale a: cantidadPociones = cantidadPociones + pocionesAComprar

        // Actualizamos la variable booleana evaluando si alcanzamos el límite
        mochilaLlena = (cantidadPociones >= CAPACIDAD_MAXIMA);


        // ==========================================
        // 4. ESTADO FINAL TRAS LA COMPRA
        // ==========================================

        System.out.println("¡COMPRA REALIZADA! Has adquirido " + pocionesAComprar + " pociones.");
        System.out.println("Coste de la operación: " + costeTotal + " créditos.");
        System.out.println("--------------------------------------------------");
        System.out.println("Oro restante: " + oroDisponible + " créditos");
        System.out.println("Pociones actuales: " + cantidadPociones);
        System.out.println("¿Mochila llena?: " + mochilaLlena);
        System.out.println("==================================================");
    }
}