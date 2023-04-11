 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: realiza la operación de	  *
 *				acuerdo a el numero de	  *
 *				muñecas y payasos el peso *
 *				del paquete.              *
 *****************************************/

package ejercicios;

import java.util.Scanner;


public class ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        
        // Pedir al usuario el número de payasos y muñecas vendidos
        System.out.print("Ingrese el número de payasos vendidos: ");
        int numPayasos = scanner.nextInt();
        
        System.out.print("Ingrese el número de muñecas vendidas: ");
        int numMunecas = scanner.nextInt();
        
        // Calcular el peso total de los payasos y muñecas vendidos
        double pesoTotal = numPayasos * 112 + numMunecas * 75;
        
        // Mostrar el peso total al usuario
        System.out.println("El peso total del paquete es: " + pesoTotal + " g");
        
        scanner.close(); // Cerrar el objeto Scanner para liberar recursos
    }
}
