 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: mostrar la sumatoria de   *
 * 				los dígitos de un número  *
 * 				 ingresado por el usuario *
 *****************************************/
package ejercicios;



import java.util.Scanner;

public class ejercicio_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Introduzca un número entero positivo (0 para salir): ");
            numero = sc.nextInt();
            if (numero != 0) {
                int sumaDigitos = calcularSumaDigitos(numero);
                System.out.println("La sumatoria de los dígitos de " + numero + " es: " + sumaDigitos);
            }
        } while (numero != 0);
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
