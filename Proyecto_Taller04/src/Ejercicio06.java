
import java.util.Scanner;

/**
 * Ejercicio 06: "Generar un solución que permita calcular y mostrar el pago 
 * mensual de un préstamo de 1 año de plazo. Se debe ingresar el monto del 
 * préstamo y el interés mensual a cobrar."
 * @author Joaquín Sánchez
 * @version 1.0
 */

public class Ejercicio06 {
    public static void main(String[] args) {
      Scanner tcl = new Scanner(System.in);
      double valorprest, interes, costototal;
        System.out.print("Ingrese el valor del prestamo: ");
        valorprest = tcl.nextDouble();
        System.out.print("Ingrese el valor del interés mensual: ");
        interes = tcl.nextDouble();
        costototal = ((valorprest / 12) + interes);
        System.out.println("El valor mensual a pagar es: "+costototal);  
    }
}
/***
 * EVIDENCIA DEL RUN:
run:
Ingrese el valor del prestamo: 24500
Ingrese el valor del inter�s mensual: 150
El valor mensual a pagar es: 2191.666666666667
BUILD SUCCESSFUL (total time: 10 seconds)
 */