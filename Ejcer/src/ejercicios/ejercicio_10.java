 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: realiza la operación de	  *
 *				division entre dos numeros* 
 *				si el resultado es cero   *
 *				entonces marca error.     *
 *****************************************/

 package ejercicios;

import java.util.Scanner;

public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// creamos un objeto scanner
        
        System.out.print("Ingrese el dividendo: ");// pedimos el dividendo
        double dividendo = input.nextDouble();
        
        System.out.print("Ingrese el divisor: ");//pedimos el divisor
        double divisor = input.nextDouble();
        // valua si el divisor es igual a cero
        if (divisor == 0) {
            System.out.println("Error: el divisor no puede ser cero.");
        } else {
            double resultado = dividendo / divisor;
            System.out.println("El resultado de la división es: " + resultado);
        }
    }
}