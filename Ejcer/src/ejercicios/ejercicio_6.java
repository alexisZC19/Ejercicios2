 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: el usuario ingresa su 	  *
 * 				numero de 4 digitos y se  *
 * 				devuelve el numero al     *
 * 				reverso.				  *		
 *                                        *
 *****************************************/

package ejercicios;

import java.util.Scanner;

public class ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        
        // Pedir al usuario que ingrese un número de cuatro dígitos
        System.out.print("Ingrese un número de cuatro dígitos: ");
        int numero = scanner.nextInt();
        
        // Convertir el número a una cadena y revertir la cadena
        String cadena = Integer.toString(numero);
        String cadenaRevertida = new StringBuilder(cadena).reverse().toString();
        
        // Convertir la cadena revertida a un número entero
        int numeroRevertido = Integer.parseInt(cadenaRevertida);
        
        // Mostrar el número revertido al usuario
        System.out.println("El número revertido es: " + numeroRevertido);
        
        scanner.close(); // Cerrar el objeto Scanner para liberar recursos
    }
}
