 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: extraer los K dígitos más *
 * 				a la izquierda de N.	  *
 *****************************************/

package ejercicios;

import java.util.Scanner;

public class ejercicio_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero positivo: ");
        int n = sc.nextInt();
        System.out.print("Introduzca la cantidad de dígitos a extraer: ");
        int k = sc.nextInt();
        int digitos = extraerDigitos(n, k);
        System.out.println("Los " + k + " dígitos más a la izquierda de " + n + " son: " + digitos);
        sc.close();
    }

    // Función para extraer los K dígitos más a la izquierda de N
    public static int extraerDigitos(int n, int k) {
        int divisor = (int)Math.pow(10, (int)(Math.log10(n)) - k + 1);
        return n / divisor;
    }
}
