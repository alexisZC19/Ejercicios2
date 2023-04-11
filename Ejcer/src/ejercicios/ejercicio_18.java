 /*****************************************
 * Autor: Zavaleta Cruz Jonathan Alexis   *
 * Fecha Creación: 10/03/23               *
 * Fecha Actualización:	10/03/23          *
 * Descripción: Toma la hora del sistema  *
 *  			y verifica los segundos   *
 *  			transcurridos en el dia.  *
 *****************************************/

package ejercicios;

import java.time.LocalTime; // importamos la clase LocalTime de la librería java.time para trabajar con la hora actual

public class ejercicio_18 {
    public static void main(String[] args) {
        // pedimos la hora actual
        LocalTime horaActual = LocalTime.now();

        // obtenemos la hora, los minutos y los segundos de la hora actual
        int horas = horaActual.getHour();
        int minutos = horaActual.getMinute();
        int segundos = horaActual.getSecond();

        // calculamos el número de segundos transcurridos
        int segundosTranscurridos = horas * 3600 + minutos * 60 + segundos;

        // imprimimos el resultado
        System.out.println("Segundos transcurridos desde el inicio del día: " + segundosTranscurridos);
    }
}
