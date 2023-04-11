 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: Verifica si un numero dado*
 * 				esta dentro o fuera del   *
 * 				intervalo de x,y          *
 *****************************************/

package ejercicios;

import java.util.Scanner;



public class ejercicio_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Pedir los valores del intervalo
        System.out.print("Ingrese el valor de X: ");
        double x = sc.nextDouble();
        System.out.print("Ingrese el valor de Y: ");
        double y = sc.nextDouble();
        
        // Pedir el valor a comparar
        System.out.print("Ingrese el valor de W: ");
        double w = sc.nextDouble();
        
        // Verificar si W está dentro o fuera del intervalo
        if (w >= x && w <= y) {
            System.out.println(w + " está dentro del intervalo [" + x + ", " + y + "]");
        } else {
            System.out.println(w + " está fuera del intervalo [" + x + ", " + y + "]");
        }
        
        sc.close(); // cerrar el scanner
    }
}
