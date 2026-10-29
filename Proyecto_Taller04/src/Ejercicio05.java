
import java.util.Scanner;

/**
 * Ejercicio 05: "Generar un algoritmo que permita calcular y mostrar el costos
 * de una computadora de escritorio. La misma es comprada por partes; CPU, 
 * teclado, pantalla, ratón."
 * @author Joaquín Sánchez
 * @version 1.0
 */

public class Ejercicio05 {
    public static void main(String[] args) {
      Scanner tcl = new Scanner(System.in);
        double CPU, teclado, pantalla, raton, preciototal;
        System.out.print("Dame los precios de cada periférico: ");
        CPU = tcl.nextDouble();
        teclado = tcl.nextDouble();
        pantalla = tcl.nextDouble();
        raton = tcl.nextDouble();
        preciototal = (CPU + teclado + pantalla + raton);
        System.out.print("El valor total de la PC es de: "+ preciototal);  
    }
}
/***
 * EVIDENCIA DEL RUN:
run:
Dame los precios de cada perif�rico: 300
200
10
123
El valor total de la PC es de: 633.0 BUILD SUCCESSFUL (total time: 6 seconds)
 */