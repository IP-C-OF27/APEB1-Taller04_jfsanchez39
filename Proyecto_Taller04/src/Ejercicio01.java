import java.util.Scanner;
/**
 * Ejercicio 01: "Generar un algoritmo que permite calcular y presentar el área de
 * un triángulo. Los datos deben ser pedidos al usuario."
 * @author Joaquín Sánchez
 * @version 1.0
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double base, altura, area;
        System.out.print("Deme la base: ");
        base = tcl.nextDouble();
        System.out.print("Deme la altura: ");
        altura = tcl.nextDouble();
        area = (base*altura)/2;
        System.out.println("El área del triángulo es: " + area);
    }
}
/***
 * EVIDENCIA DEL RUN:
run:
Deme la base: 7
Deme la altura: 8
El �rea del tri�ngulo es: 28
BUILD SUCCESSFUL (total time: 12 seconds)
 */