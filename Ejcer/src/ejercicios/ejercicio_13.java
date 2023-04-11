 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: Calcula el IMC de una 	  *
 * 				persona y muestra su      *   
 * 				clasificacio. 		      *
 *****************************************/

package ejercicios;

import java.util.Scanner;

public class ejercicio_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso, altura, imc;

        // Pedimos al usuario su peso y altura
        System.out.print("Ingrese su peso en kilogramos: ");
        peso = sc.nextDouble();
        System.out.print("Ingrese su altura en metros: ");
        altura = sc.nextDouble();

        // Calculamos el IMC
        imc = peso / (altura * altura);

        // Mostramos el resultado y la clasificación según la OMS
        System.out.printf("Su IMC es: %.2f\n", imc);
        if (imc < 16) {
            System.out.println("Clasificación: Criterio de ingreso");
        } else if (imc >= 16 && imc <= 16.9) {
            System.out.println("Clasificación: Infrapeso");
        } else if (imc >= 17 && imc <= 18.4) {
            System.out.println("Clasificación: Bajo peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Clasificación: Peso normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Clasificación: Sobrepeso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Clasificación: Obesidad premórbida");
        } else if (imc >= 40 && imc <= 45) {
            System.out.println("Clasificación: Obesidad mórbida");
        } else {
            System.out.println("Clasificación: Obesidad hipermórbida");
        }
    }
}
