
import java.util.Scanner;

/**
 * Ejercicio 02: "Generar un algoritmo que permite ingresar los gastos de tres
 * hijos de un padre de familia; calcular y mostrar el total de gastos de los
 * hijos del padre de familia."
 * @author Joaquín Sánchez
 * @version 1.0
 */

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double gastoHijo1, gastoHijo2, gastoHijo3, gastoTotal;
        System.out.print("Deme los gastos: ");
        gastoHijo1 = tcl.nextDouble();
        gastoHijo2 = tcl.nextDouble();
        gastoHijo3 = tcl.nextDouble();
        gastoTotal = (gastoHijo1+ gastoHijo2 + gastoHijo3);
        System.out.print("Total de gastos es: "+ gastoTotal);
    }
}

/***
 * EVIDENCIA DEL RUN:
 run:
Deme los gastos: 500
244
567
Total de gastos es: 1311.0 BUILD SUCCESSFUL (total time: 9 seconds)
 */