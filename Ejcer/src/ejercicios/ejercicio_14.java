 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: de acuerso a las libras   *
 * 				y estatura obtenemos      *
 * 				peso, IMC y clasificacion.*
 *****************************************/

package ejercicios;

import java.util.Scanner;

public class ejercicio_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el peso en libras y la estatura en centímetros al usuario
        System.out.print("Ingrese su peso en libras: ");
        double pesoLibras = scanner.nextDouble();
        System.out.print("Ingrese su estatura en centimetros: ");
        double estaturaCentimetros = scanner.nextDouble();

        // Convertir el peso de libras a kilogramos y la estatura de centímetros a metros
        double pesoKilos = pesoLibras * 0.453592;
        double estaturaMetros = estaturaCentimetros / 100.0;

        // Calcular el índice de masa corporal (IMC)
        double imc = pesoKilos / (estaturaMetros * estaturaMetros);

        // Determinar la clasificación del IMC según la OMS
        String clasificacion;
        if (imc < 16) {
            clasificacion = "Criterio de ingreso";
        } else if (imc < 16.9) {
            clasificacion = "Infrapeso";
        } else if (imc < 18.5) {
            clasificacion = "Bajo peso";
        } else if (imc < 25) {
            clasificacion = "Peso normal";
        } else if (imc < 30) {
            clasificacion = "Sobrepeso";
        } else if (imc < 35) {
            clasificacion = "Obesidad premórbida";
        } else if (imc < 40) {
            clasificacion = "Obesidad mórbida";
        } else {
            clasificacion = "Obesidad hipermórbida";
        }

        // Mostrar el peso en kilogramos, el valor del IMC y la clasificación
        System.out.printf("Peso en kilogramos: %.2f kg\n", pesoKilos);
        System.out.printf("IMC: %.2f\n", imc);
        System.out.println("Clasificación: " + clasificacion);

        scanner.close();
    }
}
