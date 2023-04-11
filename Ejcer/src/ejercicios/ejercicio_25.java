 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: Verifica si un numero es  *
 *  			mayor o menor y para 	  *
 *  			cuando el numero es 0	  *
 *****************************************/

package ejercicios;

import java.util.Scanner;

public class ejercicio_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        do {
            System.out.print("Ingrese un número (0 para finalizar): ");
            numero = sc.nextInt();
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor && numero != 0) {
                menor = numero;
            }
        } while (numero != 0);
        if (mayor != Integer.MIN_VALUE) {
            System.out.println("El mayor número ingresado es: " + mayor);
        }
        if (menor != Integer.MAX_VALUE) {
            System.out.println("El menor número ingresado es: " + menor);
        }
    }
}
