 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: el usuario ingresa su 	  *
 * 				numero de horas de trabajo*
 * 				y el coste y regresa el   *
 *              valor de la paga total    *
 *                                        *
 *****************************************/

package ejercicios;

import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para obtener la entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        // Pedimos al usuario que introduzca el número de horas trabajadas
        System.out.print("Introduce el número de horas trabajadas: ");
        double horasTrabajadas = sc.nextDouble();
        
        // Pedimos al usuario que introduzca el coste por hora
        System.out.print("Introduce el coste por hora: ");
        double costePorHora = sc.nextDouble();
        
        // Calculamos la paga total multiplicando las horas trabajadas por el coste por hora
        double pagaTotal = horasTrabajadas * costePorHora;
        
        // Mostramos la paga total por pantalla
        System.out.println("La paga total es: " + pagaTotal);
        
        // Cerramos el objeto Scanner para liberar recursos
        sc.close();
    }
}