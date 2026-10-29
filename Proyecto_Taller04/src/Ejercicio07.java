
import java.util.Scanner;

/**
 * Ejercicio 07: ""Generar un algoritmo que permita calcular y mostrar el valor
a cancelar de una planilla de luz. Se debe ingresar el valor de costo por
kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario
tiene edad mayor a 65 años, se debe descontar el 10%."
 * @author Joaquín Sánchez
 * @version 1.0
 */

public class Ejercicio07 {
    public static void main(String[] args) {
      Scanner tcl = new Scanner(System.in);
       double costoPlanilla, costokporhora, numkpormes, edad;
        System.out.print("Ingrese el costo de k/h: ");
        costokporhora = tcl.nextDouble();
        System.out.println("Ingrese el valor de kilovatios consumidos en el mes: ");
        numkpormes = tcl.nextDouble();
        System.out.println("Ingrese su edad: ");
        edad = tcl.nextDouble();
        costoPlanilla = (costokporhora * numkpormes);
        if (edad >= 65)
            costoPlanilla = (costoPlanilla * 0.9);
        System.out.print("El costo de la planilla de luz es: "+ costoPlanilla);
    }
}
/***
 * EVIDENCIA DEL RUN:
run:
Ingrese el costo de k/h: 0,10
Ingrese el valor de kilovatios consumidos en el mes: 
4000
Ingrese su edad: 
67
El costo de la planilla de luz es: 360.0 BUILD SUCCESSFUL (total time: 21 seconds)
 */