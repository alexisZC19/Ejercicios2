 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: de acuerdo a la edad	  *
 * 				muestra si debe tributar  *
 * 				impuestos o si su ingreso *
 * 				es mayor a 500.			  *
 *****************************************/

package ejercicios;

import java.util.Scanner;

public class ejercicio_11 {
    public static void main(String[] args) {
    	//creamos un objeto scanner
        Scanner input = new Scanner(System.in);
        //pedimos edad
        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();
        //pedimos el ingreso mensual
        System.out.print("Ingrese sus ingresos mensuales: ");
        double ingresos = input.nextDouble();
        //verifica si la edad es menor a 16 y los ingresos menores a 500
        if (edad > 16 && ingresos >= 500) {
            System.out.println("Debe tributar impuestos.");
        } else {
            System.out.println("No debe tributar impuestos.");
        }
    }
}
