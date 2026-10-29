
import java.util.Scanner;

/**
 * Ejercicio 08: "Se debe generar una solución que permita calcular y mostrar
 * el valor total a pagar mensual de servicios digitales de una persona.
 * Los servicios digitales son: netflix, youtube premium, dropbox, spotify.
 * Si la persona es menor a 30 años se descuenta el 20% del total mensual."
 * @author Joaquín Sánchez
 * @version 1.0
 */

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costoNetflix, costoYoutube, costoDropbox, costoSpotify, costoTotal;
        int edad;
        System.out.print("Ingrese el costo mensual de cada aplicación: ");
        costoNetflix = tcl.nextDouble();
        costoYoutube = tcl.nextDouble();
        costoDropbox = tcl.nextDouble();
        costoSpotify = tcl.nextDouble();
        System.out.print("Ingrese su edad: ");
        edad = tcl.nextInt();
        costoTotal = (costoNetflix + costoYoutube + costoDropbox + costoSpotify);
        if (edad <=30)
            costoTotal = costoTotal * 0.8;
        System.out.println("El precio total a pagar mensualmente es: "+ costoTotal);                
    }
}

/***
 * EVIDENCIA DEL RUN:
run:
Ingrese el costo mensual de cada aplicaci�n: 5,99 7,99 9,99 6,99
Ingrese su edad: 23
El precio total a pagar mensualmente es: 24.768
BUILD SUCCESSFUL (total time: 48 seconds)
 */