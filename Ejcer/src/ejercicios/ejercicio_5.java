 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: el usuario ingresa su 	  *
 * 				dos catetos y se muestra  *
 * 				la longitud de la 		  *
 * 				hipotenusa 				  *
 *                                        *
 *****************************************/
package ejercicios;

import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        
        // Pedir al usuario las longitudes de los catetos
        System.out.print("Ingrese la longitud del primer cateto: ");
        double cateto1 = scanner.nextDouble();
        
        System.out.print("Ingrese la longitud del segundo cateto: ");
        double cateto2 = scanner.nextDouble();
        
        // Calcular la longitud de la hipotenusa utilizando el teorema de Pitágoras
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        
        // Mostrar el resultado al usuario
        System.out.printf("La longitud de la hipotenusa es %.2f", hipotenusa);
        
        scanner.close(); // Cerrar el objeto Scanner para liberar recursos
    }
}
