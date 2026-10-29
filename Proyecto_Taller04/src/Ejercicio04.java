
import java.util.Scanner;

/**
 * Ejercicio 04: "Generar un algoritmo que permita calcular y mostrar el valor 
 * de la planilla de teléfono de un casa. Se debe ingresar el costo por minutos,
 * el número de minutos consumidos en el mes."
 * @author Joaquín Sánchez
 * @version 1.0
 */

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costoMinutos, minutosMes, valorPlanilla;
        System.out.print("Deme el valor del costo por minuto: ");
        costoMinutos = tcl.nextDouble();
        System.out.print("Deme el valor de los minutos consumidos en el mes: ");
        minutosMes = tcl.nextDouble();
        valorPlanilla = (costoMinutos * minutosMes);
        System.out.println("El valor de la planilla es: "+ valorPlanilla);
              
    }
}

/***
 * EVIDENCIA DEL RUN:
run:
Deme el valor del costo por minuto: 2
Deme el valor de los minutos consumidos en el mes: 799
El valor de la planilla es: 1598.0
BUILD SUCCESSFUL (total time: 11 seconds)
 */