
import java.util.Scanner;

/**
 * Ejercicio 09: "Desarrolle una solución que determine el estado académico de 
 * una persona estudiante en una asignatura universitaria a partir de una
 * calificación de evaluación continua, una calificación de examen final y
 * un porcentaje de asistencia. La regla institucional establece que:

 * La asistencia mínima debe alcanzarse para ser evaluado
 * Existe una nota mínima en el examen final, y
 * La nota final se calcula combinando evaluación continua y examen final.
* La salida debe indicar “Aprobado”, “Supletorio” o “Reprobado”, y mostrar 
* la nota final redondeada a un decimal."
 * @author Joaquín Sánchez
 * @version 1.0
 */

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double califcontinua, califExamen, asistencia, califFinal;
        String estadoEst;
        System.out.println("Ingresar el porcentaje de asistencia del estudiante: ");
        asistencia = tcl.nextDouble();
        if (asistencia >= 70){
            System.out.println("Ingrese la calificación de la evalucación continua del estudiante: ");
            califcontinua = tcl.nextDouble();
            System.out.println("Ingrese la calificación del exámen final del estudiante: ");
            califExamen = tcl.nextDouble();
            califFinal = (califcontinua + califExamen)/2;
            if (califExamen >=7){
                estadoEst = "Aprobado";
                if (califFinal <7)
                    estadoEst = "Supletorio";
        }
            else 
                estadoEst = "Reprobado";
            System.out.println("La calificación final del estudiante es: "+ califFinal);
            System.out.println("El estado del estudiante es: "+ estadoEst);
            }
        else{
            estadoEst = "Reprobado";
            System.out.println("No cumplió con el minimo de asistencias, por lo cual no fue evaluado: ");
            System.out.println("El estado del estudiante es: "+ estadoEst);
            
        } 
            
        
        
        
            
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