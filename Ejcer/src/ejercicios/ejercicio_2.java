 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: realiza la operacion de   *
 * 				(x+y)/(a*b)
 *                                        *
 *****************************************/


package ejercicios;

import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para obtener la entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        // Pedimos al usuario que introduzca el valor de x
        System.out.print("Introduce el valor de x: ");
        double x = sc.nextDouble();
        
        // Pedimos al usuario que introduzca el valor de y
        System.out.print("Introduce el valor de y: ");
        double y = sc.nextDouble();
        
        // Pedimos al usuario que introduzca el valor de a
        System.out.print("Introduce el valor de a: ");
        double a = sc.nextDouble();
        
        // Pedimos al usuario que introduzca el valor de b
        System.out.print("Introduce el valor de b: ");
        double b = sc.nextDouble();
        
        // Realizamos la operación aritmética (x + y) / (a * b)
        double resultado = (x + y) / (a * b);
        
        // Mostramos el resultado por pantalla
        System.out.println("El resultado es: " + resultado);
        
        // Cerramos el objeto Scanner para liberar recursos
        sc.close();
    }
}