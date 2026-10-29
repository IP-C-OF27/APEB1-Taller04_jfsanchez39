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
        double costo1, costo2, costo3, costoTotal;
        System.out.print("Ingrese los gastos de cada hijo: ");
        costo1 = tcl.nextDouble();
        costo2 = tcl.nextDouble();
        costo3 = tcl.nextDouble();
        costoTotal = costo1 + costo2 + costo3;
        System.out.println("El gasto total de los hijos es: $" + costoTotal);
    }
}
/***
 * EVIDENCIA DEL RUN:
run:
Ingrese los gastos de cada hijo: 23
65,98
456
El gasto total de los hijos es: $544,98
BUILD SUCCESSFUL (total time: 7 seconds)
 */