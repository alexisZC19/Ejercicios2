 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: Verifica si un numero es  *
 *  			primo o no. 			  *
 *****************************************/

package ejercicios;

import java.util.Scanner;

public class ejercicio_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        boolean esPrimo = true;
        
        // Pedir al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero: ");
        n = scanner.nextInt();
        
        // Verificar si el número es primo o no
        if (n <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        
        // Mostrar el resultado
        if (esPrimo) {
            System.out.println(n + " es primo.");
        } else {
            System.out.println(n + " no es primo.");
        }
    }
}
