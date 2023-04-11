 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: realiza la operación de	  *
 *				√(x + y * z)^5			  *
 *****************************************/

package ejercicios;

import java.lang.Math;

public class ejercicio_3 {
    public static void main(String[] args) {
        // Definimos las variables x, y, y z
        double x = 2;
        double y = 3;
        double z = 4;
        
        // Calculamos el resultado usando la función sqrt y pow de la clase Math
        double resultado = Math.pow(Math.sqrt(x + y * z), 5);
        
        // Imprimimos el resultado en la consola
        System.out.println(resultado);
    }
}
