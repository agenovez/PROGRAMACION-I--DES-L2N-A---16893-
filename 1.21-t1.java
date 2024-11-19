/*Determinar si un alumno aprueba o reprueba un curso. sabiendo que aprobará si su promedio de tres calificaciones es mayor o igual a 70; reprueba en caso contrario. 
*autor @agenovez
*/

import java.util.Scanner;

public class DeterminarAprobacion {
    public static void main(String[] args) {
        // Declaración de variables
        double calificacion1, calificacion2, calificacion3, promedio;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera calificación: ");
        calificacion1 = scanner.nextDouble();

        System.out.print("Ingrese la segunda calificación: ");
        calificacion2 = scanner.nextDouble();

        System.out.print("Ingrese la tercera calificación: ");
        calificacion3 = scanner.nextDouble();

        // Cálculo del promedio
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;

        // Determinación si aprueba o reprueba
        if (promedio >= 70) {
            System.out.printf("El alumno aprueba el curso con un promedio de: %.2f%n", promedio);
        } else {
            System.out.printf("El alumno reprueba el curso con un promedio de: %.2f%n", promedio);
        }

        // Cierre del scanner
        scanner.close();
    }
}
