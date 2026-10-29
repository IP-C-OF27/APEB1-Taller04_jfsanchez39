
import java.util.Scanner;

/**
 * Ejercicio 10: "El programa debe calcular el área del polígono. La figura se 
 * compone de un cuadrado perfecto (A), tres triángulos rectángulos iguales 
 * (B, C, E), cuya base mide lo mismo que uno de los lados del cuadrado, y un 
 * rectángulo (D) cuyo ancho mide lo mismo que uno de los lados del cuadrado, 
 * mientras que la altura mide lo mismo que la altura de los triángulos. 
 * Se pide que haga un programa que calcule el área total.

Porcultura general, sabemos que el área de un rectángulo se calcula 
* multiplicando su base por su altura; el área de un triángulo rectángulo se 
* calcula multiplicando su base por su altura, y luego dividiendo el resultado 
* entre dos; finalmente, el área de un cuadrado se calcula elevando al cuadrado
* la medida de uno de sus lados"
 * @author Joaquín Sánchez
 * @version 1.0
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double areaCuadrado, areaTrian, alturaTrian, areaRectan, baseTrian, 
        areaTotal;
        System.out.println("Ingresar los valores solicitados");
        System.out.print("Altura del Triangulo, Base del Triangulo: ");
        alturaTrian = tcl.nextDouble();
        baseTrian = tcl.nextDouble();
        areaTrian = baseTrian * alturaTrian / 2;
        areaRectan = baseTrian * alturaTrian;
        areaCuadrado = baseTrian * baseTrian;
        areaTotal = (3*areaTrian) + areaRectan + areaCuadrado;
        System.out.println("El area total es: " + areaTotal);
    }
}
/***
 * EVIDENCIA DEL RUN:
run:
Deme la base: 10
Deme la altura: 15
Area: 75.0
BUILD SUCCESSFUL (total time: 10 seconds)
 */