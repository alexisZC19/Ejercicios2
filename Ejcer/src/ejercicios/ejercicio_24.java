 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: solicitar el ingreso de	  *
 * 				una cantidad indeterminada* 
 * 				de números mayores que 1, * 
 * 				finalizando cuando se 	  *
 * 				reciba un cero.		 	  *
 *****************************************/

package ejercicios;

import java.util.Scanner;

public class ejercicio_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1, cantidadPrimos = 0;
        while (numero != 0) {
            System.out.print("Ingrese un número (0 para finalizar): ");
            numero = sc.nextInt();
            if (esPrimo(numero)) {
                cantidadPrimos++;
            }
        }
        cantidadPrimos--; // Descuenta el número 0
        System.out.println("Cantidad de números primos ingresados: " + cantidadPrimos);
    }

    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
