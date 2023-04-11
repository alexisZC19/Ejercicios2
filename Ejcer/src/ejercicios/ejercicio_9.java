 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: calcula X1 y X2 utilizando*
 * 				la formula general.		  *
 *****************************************/

package ejercicios;

import java.util.Scanner;

public class ejercicio_9 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese los coeficientes de la ecuación de segundo grado
        System.out.print("Ingrese el coeficiente a: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese el coeficiente b: ");
        double b = sc.nextDouble();

        System.out.print("Ingrese el coeficiente c: ");
        double c = sc.nextDouble();

        // Calcular el discriminante
        double discriminante = b * b - 4 * a * c;

        // Calcular las soluciones de la ecuación de segundo grado
        double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

        // Imprimir las soluciones
        System.out.println("Las soluciones son:");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
