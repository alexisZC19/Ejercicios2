 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: encontrar el número cuya  *
 * 				sumatoria de dígitos fue  *
 * 				mayor y la cantidad de    *
 * 				números cuya sumatoria de *
 * 				dígitos fue menor que 10  *
 *****************************************/

package ejercicios;

import java.util.Scanner;

public class ejercicio_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de números que desea ingresar: ");
        int cantidadNumeros = sc.nextInt();
        int mayorSumaDigitos = -1;
        int numeroMayorSumaDigitos = -1;
        int cantidadMenor10 = 0;
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Introduzca el número " + (i + 1) + ": ");
            int numero = sc.nextInt();
            int sumaDigitos = calcularSumaDigitos(numero);
            if (sumaDigitos > mayorSumaDigitos) {
                mayorSumaDigitos = sumaDigitos;
                numeroMayorSumaDigitos = numero;
            }
            if (sumaDigitos < 10) {
                cantidadMenor10++;
            }
        }
        System.out.println("El número con la mayor sumatoria de dígitos es: " + numeroMayorSumaDigitos);
        System.out.println("La cantidad de números cuya sumatoria de dígitos fue menor que 10 es: " + cantidadMenor10);
        sc.close();
    }

    // Función para calcular la sumatoria de los dígitos de un número
    public static int calcularSumaDigitos(int n) {
        int suma = 0;
        while (n != 0) {
            suma += n % 10;
            n /= 10;
        }
        return suma;
    }
}
