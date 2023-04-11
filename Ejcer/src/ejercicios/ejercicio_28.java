 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: Determina si un punto     * 
 * 				(x,y) esta en el 		  *
 * 				rectangulo.				  *
 *****************************************/

package ejercicios;

import java.util.Scanner;

public class ejercicio_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la coordenada X del punto: ");
        double x = sc.nextDouble();
        System.out.print("Introduzca la coordenada Y del punto: ");
        double y = sc.nextDouble();
        System.out.print("Introduzca la coordenada X del vértice superior izquierdo del rectángulo: ");
        double rectX = sc.nextDouble();
        System.out.print("Introduzca la coordenada Y del vértice superior izquierdo del rectángulo: ");
        double rectY = sc.nextDouble();
        System.out.print("Introduzca la altura del rectángulo: ");
        double rectAltura = sc.nextDouble();
        System.out.print("Introduzca el ancho del rectángulo: ");
        double rectAncho = sc.nextDouble();
        boolean estaDentro = puntoEstaDentroRectangulo(x, y, rectX, rectY, rectAltura, rectAncho);
        if (estaDentro) {
            System.out.println("El punto está dentro del rectángulo");
        } else {
            System.out.println("El punto está fuera del rectángulo");
        }
        sc.close();
    }

    // Función para determinar si un punto está dentro de un rectángulo
    public static boolean puntoEstaDentroRectangulo(double x, double y, double rectX, double rectY, double rectAltura, double rectAncho) {
        return x >= rectX && x <= rectX + rectAncho && y >= rectY && y <= rectY + rectAltura;
    }
}