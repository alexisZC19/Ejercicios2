 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: Muestra los numeros 	  *
 * 				impares hasta el valor    *
 * 				ingresado 1 por 1.		  *
 *****************************************/

package ejercicios;

import java.util.Scanner;

public class ejercicio_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        // Pedir al usuario que ingrese un número positivo
        do {
            System.out.print("Ingrese un número entero positivo: ");
            n = scanner.nextInt();
        } while (n <= 0);
        
        // Mostrar todos los números impares desde 1 hasta n
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}
