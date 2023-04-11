 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: Calcula el Área y volumen *
 * 				de un cilindro.			  *
 *****************************************/

package ejercicios;

import java.util.Scanner;

public class ejercicio_26 {
    public static void main(String[] args) {
    	//Creamos un objeto Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el radio del círculo: ");
        double radio = sc.nextDouble();
        System.out.print("Introduzca la altura del cilindro: ");
        double altura = sc.nextDouble();
        double area = calcularAreaCirculo(radio);
        double volumen = calcularVolumenCilindro(area, altura);
        System.out.println("El área del círculo es: " + area);
        System.out.println("El volumen del cilindro es: " + volumen);
        sc.close();
    }
  
    // Función para calcular el área de un círculo
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    // Función para calcular el volumen de un cilindro usando la función calcularAreaCirculo
    public static double calcularVolumenCilindro(double areaBase, double altura) {
        return areaBase * altura;
    }
}
