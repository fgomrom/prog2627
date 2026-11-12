/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectos;

import java.util.Scanner;

/**
 *
 * @author Jose Antonio Pineda David
 * @author  Carlos Márquez Cozar
 */
public class Proyecto_ud2 {

    /**
     * Este proyecto simula un juego de pelea por turno con un malware.
     * La unica opcion para ganarle es conseguir la llave que desbloquea el sistema.
     * En nuestro caso esta en la sala de servidores.
     */
    public static void main(String[] args) {
        //
 /*       Scanner sc = new Scanner(System.in);
        // Declaramos las variables globales.
        int opcion;
        int vida = 100;
        boolean tieneLlave = false; 
        boolean terminalBloqueada = true; // Controla si el jugador a ganado

        //Bucle principal, se repite mientras estas jugando.
        while (terminalBloqueada && vida > 0) {
            //Menu de eleccion para el jugador
            System.out.println("\n--- MENU DE SISTEMA ---");
            System.out.println("1. Explorar sala de servidores");
            System.out.println("2. Revisar inventario");
            System.out.println("3. Hackear puerta principal");
            System.out.println("0. Rendirse y desconectar");
            System.out.print("Selecciona una accion: ");
            
            //Guardamos la opcion introducida
            opcion = sc.nextInt();
            
            // Ejecuta la opcion introducida
            switch (opcion) {
                case 1:
                    System.out.println("\nExplorando sala de servidores... \n"
                            + "Encontraste una llave");
                    tieneLlave = true;
                    break;
                    // Si escogemos esta opcion explora la sala de servidores en la cual encuentra la llave.
                case 2:
                    System.out.println("\nRevisando inventario");
                    System.out.println("vida del sistema :" + vida);

                    if (tieneLlave) {
                        System.out.println("llave de desbloqueo obtenida");
                    } else {
                        System.out.println("Inventario vacio");
                    }
                    break;
                    //Valida si tenemos la llave nos pone que en nuestro inventario si tenemos la llave y la vida que nos queda
                case 3:
                    System.out.println("\nHackeando puerta principal...");
                    int progreso = 0;
                    while(progreso < 100){
                        progreso +=10;
                    }
                //    if (tieneLlave)&&(progreso == 50) {
                        System.out.println("10%...");
                        System.out.println("50%...");
                        System.out.println("90%...");
                        System.out.println("Hackeo completado.");
                        terminalBloqueada = false;
               //     } else {
                        System.out.println("10%...");
                        System.out.println("50%...");
                        System.out.println("90%...");
                        System.out.println("Error del sistema. \n"
                                + "llave no encontrada");

                        System.out.println("El malware ataca");
                        vida = vida - 15;
                        System.out.println("Vida del sistema " + vida);
                    }
                    break;
                    // nos muestra si podemos hackear la llave
                    
                case 0:
                    System.out.println("\nApagando sistema");
                    vida = 0;
                    break;
                    // apaga el sistema ya que te rindes
                default:
                    System.out.println("Comando invalido. El malware ataca.");
                    vida -= 10;
                    // si intentamos acceder con otro caso nos pone que el comadno es invalido.
            }

        }
        // lee lo contrario la variable terminalBloqueada.
        // En nuestro caso es si terminalBloqueada es false seria que la terminal estaria desbloqueada.
        
       
        if (!terminalBloqueada) {
            System.out.println("\nMISION COMPLETADA. El malware ha sido destruido");
        } else {
            System.out.println("\nGAME OVER: El malware a podido contigo");
           
        }*/
    }

}
