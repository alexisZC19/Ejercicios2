 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: Calcula el numero de dias * 
 * 				transcurridos hasta el mes* 
 * 				elegido.				  *
 *****************************************/

package ejercicios;

import java.util.Scanner;

public class ejercicio_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el mes (1-12): ");
        int mes = sc.nextInt();
        int diasTranscurridos = calcularDiasTranscurridos(mes);
        System.out.println("El número de días transcurridos hasta el primer día del mes " + mes + " es: " + diasTranscurridos);
        sc.close();
    }

    // Función para calcular el número de días transcurridos desde el comienzo del año hasta el primer día del mes
    public static int calcularDiasTranscurridos(int mes) {
        int[] diasPorMes = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        return diasPorMes[mes-1];
    }
}
