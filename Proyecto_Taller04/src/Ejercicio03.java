
import java.util.Scanner;

/**
 * Ejercicio 03: "Se desea desarrollar un algoritmo que permita mostrar la 
 * tabla de multiplicar de un número ingresado por el usuario; solo en el caso
 * que el valor del número esté entre 2 y 6. No use aún, ciclos repetitivos."
 * @author Joaquín Sánchez
 * @version 1.0
 */

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numero;
        System.out.print("Deme un número del 2 al 6: ");
        numero = tcl.nextInt();
        if (numero >=2 && numero <=6);{
            System.out.println(numero + " * 1= " + numero);
            System.out.println(numero + " * 2= " + (numero * 2));
            System.out.println(numero + " * 3= " + (numero * 3));
            System.out.println(numero + " * 4= " + (numero * 4));
            System.out.println(numero + " * 5= " + (numero * 5));
            System.out.println(numero + " * 6= " + (numero * 6));
            System.out.println(numero + " * 7= " + (numero * 7));
            System.out.println(numero + " * 8= " + (numero * 8));
            System.out.println(numero + " * 9= " + (numero * 9));
            System.out.println(numero + " * 10= " + (numero * 10));
            System.out.println(numero + " * 11= " + (numero * 11));
            System.out.println(numero + " * 12= " + (numero * 12));}
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Deme un n�mero del 2 al 6: 2
2 * 1= 2
2 * 2= 4
2 * 3= 6
2 * 4= 8
2 * 5= 10
2 * 6= 12
2 * 7= 14
2 * 8= 16
2 * 9= 18
2 * 10= 20
2 * 11= 22
2 * 12= 24
BUILD SUCCESSFUL (total time: 2 seconds)
 */