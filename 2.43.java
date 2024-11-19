/*Diseñe un programa que lea las calificaciones obtenidas en las 5 unidades por cada uno de los 40 alumnos y escriba la cantidad de ellos que no tienen derecho al examen de nivelación.
* autor @agenovez
*/

import java.util.Scanner;

public class ContarEstudiantesNoElegibles {
    public static void main(String[] args) {
        // Inicializar variables
        int contadorNoElegibles = 0;
        final int umbralAprobacion = 60; // Límite de calificación para aprobar
        final int numeroDeEstudiantes = 40; // Total de estudiantes

        Scanner scanner = new Scanner(System.in);

        // Iterar por cada estudiante
        for (int i = 1; i <= numeroDeEstudiantes; i++) {
            System.out.println("Procesando calificaciones para el estudiante " + i);
            double sumaDeCalificaciones = 0;

            // Leer las calificaciones de las 5 unidades
            for (int j = 1; j <= 5; j++) {
                System.out.print("Ingrese la calificación para la unidad " + j + ": ");
                double calificacion = scanner.nextDouble();
                sumaDeCalificaciones += calificacion;
            }

            // Calcular el promedio
            double promedio = sumaDeCalificaciones / 5;

            // Verificar si el estudiante no es elegible
            if (promedio < umbralAprobacion) {
                contadorNoElegibles++;
            }
        }

        // Mostrar el resultado
        System.out.println("El número de estudiantes no elegibles es: " + contadorNoElegibles);

        scanner.close();
    }
}
