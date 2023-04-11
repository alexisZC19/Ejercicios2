 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: Verifica si un numero de  *
 * 				4 cifras es feliz o no.	  *
 *****************************************/
package ejercicios;

import java.util.Scanner;

public class ejercicio_16 {

    public static void main(String[] args) {
    	//Creamos un objeto scanner
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.print("Introduce un número de cuatro dígitos: ");
        numero = entrada.nextInt();

        int digito1 = numero / 1000;
        int digito2 = (numero / 100) % 10;
        int digito3 = (numero / 10) % 10;
        int digito4 = numero % 10;

        // Comprobamos si el número es feliz
        if (digito1 > digito2 && (digito1 * 10 + digito2) > (digito3 * 10 + digito4)) {
            // Comprobamos si el número es creciente
            if (digito1 > digito2 && digito2 > digito3 && digito3 > digito4) {
                System.out.println("El número es muy feliz");
            } else {
                System.out.println("El número es feliz pero no creciente");
            }
        } else {
            System.out.println("El número es infeliz");
        }
    }

}
