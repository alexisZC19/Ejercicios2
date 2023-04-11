 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: pide dos numeros enteros  *
 *  			al usuario y obtiene c y r*
 *                                        *
 *****************************************/
package ejercicios;
import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del usuario
        
        // Solicitar al usuario dos números enteros
        System.out.print("Ingrese un número entero: ");
        int n = scanner.nextInt();
        
        System.out.print("Ingrese otro número entero: ");
        int m = scanner.nextInt();
        
        // Calcular el cociente y el resto de la división entera
        int c = n / m; // Operador de división entera
        int r = n % m; // Operador de módulo
        
        // Mostrar el mensaje al usuario con los valores correspondientes
        System.out.printf("%d entre %d da un cociente %d y un resto %d", n, m, c, r);
        
        scanner.close(); // Cerrar el objeto Scanner para liberar recursos
    }
}