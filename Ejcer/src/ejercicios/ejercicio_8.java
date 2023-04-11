 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: calcula la velocidad del  *
 * 				usuario de acuerdo a su   *
 * 				distancia recorrida y     *
 *   			tiempo.					  *
 *****************************************/
package ejercicios;

import java.util.Scanner;

public class ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        
        // Pedir al usuario la distancia recorrida y el tiempo que tomó
        System.out.print("Ingrese la distancia recorrida en metros: ");
        double distancia = scanner.nextDouble();
        
        System.out.print("Ingrese el tiempo que tomó en segundos: ");
        double tiempo = scanner.nextDouble();
        
        // Calcular la velocidad
        double velocidad = distancia / tiempo;
        
        // Mostrar la velocidad al usuario
        System.out.println("La velocidad es: " + velocidad + " m/s");
        
        scanner.close(); // Cerrar el objeto Scanner para liberar recursos
    }
}
