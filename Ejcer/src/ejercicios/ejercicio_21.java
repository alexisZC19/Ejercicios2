 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: Calcula el valor aprox.	  *
 * 				de pi mediante una serie. *
 *****************************************/
package ejercicios;

import java.util.Scanner;

public class ejercicio_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        double pi = 0.0;
        
        // Pedir al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero: ");
        n = scanner.nextInt();
        
        // Calcular el valor aproximado de Pi
        for (int i = 0; i <= n; i++) {
            double termino = 4.0 * (-1.0) * ((double) i % 2.0) / (2.0 * (double) i + 1.0);
            pi += termino;
        }
        
        // Mostrar el resultado
        System.out.println("Pi es aproximadamente " + pi);
    }
}
