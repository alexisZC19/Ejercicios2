 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: mostrar la sumatoria de   *
 * 				los dígitos de varios     *
 *				números ingresados por    *
 *				el usuario, y la sumatoria* 
 *				de todos los números      * 
 *				ingresados.               *
 *****************************************/

package ejercicios;

import java.util.Scanner;

public class ejercicio_32 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, sumaNumeros = 0, sumaDigitos = 0;
        do {
            System.out.print("Ingrese un número (0 para salir): ");
            numero = sc.nextInt();
            if (numero != 0) {
                sumaNumeros += numero;
                int sumaDigitosNumero = calcularSumaDigitos(numero);
                System.out.println("La sumatoria de los dígitos de " + numero + " es: " + sumaDigitosNumero);
                sumaDigitos += sumaDigitosNumero;
            }
        } while (numero != 0);
        System.out.println("La sumatoria de todos los números ingresados es: " + sumaNumeros);
        System.out.println("La sumatoria de todos los dígitos ingresados es: " + sumaDigitos);
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

