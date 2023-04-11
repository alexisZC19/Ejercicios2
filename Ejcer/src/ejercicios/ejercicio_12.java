 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: verifica si un numero	  *
 * 				es capicua o no.			  *
 *****************************************/

package ejercicios;

import java.util.Scanner;

public class ejercicio_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese un número de cuatro dígitos: ");
        int numero = input.nextInt();
        
        int d1 = numero / 1000;
        int d2 = (numero / 100) % 10;
        int d3 = (numero / 10) % 10;
        int d4 = numero % 10;
        
        if (d1 == d4 && d2 == d3) {
            System.out.println("Capicúa");
        } else {
            System.out.println("No lo es");
        }
    }
}
