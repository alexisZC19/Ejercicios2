 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: Verifica la cant de numr. *
 * 				pares e impares asi como  *
 * 				sus porcentajes y suma.   *
 *****************************************/

package ejercicios;

import java.util.Scanner;

public class ejercicio_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorNumeros = 0, sumaPares = 0, sumaImpares = 0;
        int numero = 1;
        while (numero != 0) {
            System.out.print("Ingrese un número (0 para finalizar): ");
            numero = sc.nextInt();
            if (numero % 2 == 0) {
                sumaPares += numero;
            } else {
                sumaImpares += numero;
            }
            contadorNumeros++;
        }
        contadorNumeros--; // Descuenta el número 0
        double porcentajePares = (double) sumaPares / contadorNumeros * 100;
        double porcentajeImpares = (double) sumaImpares / contadorNumeros * 100;
        int sumaTotal = sumaPares + sumaImpares;
        System.out.println("Suma de números pares: " + sumaPares);
        System.out.println("Porcentaje de números pares: " + porcentajePares + "%");
        System.out.println("Suma de números impares: " + sumaImpares);
        System.out.println("Porcentaje de números impares: " + porcentajeImpares + "%");
        System.out.println("Suma total: " + sumaTotal);
        System.out.println("Cantidad de números ingresados: " + contadorNumeros);
    }
}
