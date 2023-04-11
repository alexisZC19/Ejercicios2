 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: de acuerso al numero      *
 * 				ingresado imprime el mes. *
 *****************************************/

package ejercicios;

import java.util.Scanner;

public class ejercicio_15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroMes;

        System.out.print("Introduce un número del 1 al 12: ");
        numeroMes = entrada.nextInt();

        // Utilizamos un switch para imprimir el nombre del mes correspondiente
        switch (numeroMes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Número inválido. Debe ser del 1 al 12.");
                break;
        }
    }

}
