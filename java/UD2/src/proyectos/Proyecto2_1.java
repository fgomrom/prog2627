package proyectos;

import java.util.Scanner;

public class Proyecto2_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        //Bucle mientras sea distinto de la opcion 0, se sigue ejecutando
        do {
            //Pedimos que elija una opcion del menu
            System.out.println("Ingrese la opcion de accion");
            System.out.println("Opcion 0 = Salir");
            System.out.println("Opcion 1 = Explorar");
            System.out.println("Opcion 2 = Inventario");
            System.out.println("Opcion 3 = Hackear ordenador");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Explorar Clase");
                    System.out.println("Estas explorando la sala, ¿Has encontrado la llave? (1(si)/2(no))");
                    int llave = sc.nextInt();
                    //Mediante el 1 y 2 que es si y no,  sabremos si tenemos la llave 
                    if (llave == 1) {
                        System.out.println("Has encontrado la llave, puedes abrir la puerta");
                    } else if (llave == 2) {
                        System.out.println("Sigue buscando la llave");
                    }
                    else {System.out.println("No has seleccionado ninguna opcion correcta");}
                    break;
                case 2:
                    System.out.println("------Mostrando inventario------");
                    System.out.println("-Tienes espada larga x1");
                    System.out.println("-Tienes 300 de oro");
                    System.out.println("-Tienes Pociones de vida x3");
                    break;
                case 3:
                    System.out.println("Estas hackeando el ordenador");
                    //Hace un incremental para que no cuente de 1 en 1, si no 
                    //de 10 en 10 porque el resto debe dar 0
                    for (int i = 0; i <= 100; i += 1) {
                        if (i % 10 != 0) {
                            continue;
                        }
                                    
                        System.out.println("Hackeo en proceso: " + i + "%");
                        if (i == 50) {
                            System.out.println("Acelerando el hackeo...");
                        }            
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("has elegido una opción no valida");
                    break;
            }
        } while (opcion != 0);
    }
}
