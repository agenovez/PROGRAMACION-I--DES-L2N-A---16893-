/*Leer por cada alumno de Cálculo su número de control y su calificación en cada una de las 5 unidades de la materia. 
Al final escriba el número de control del alumno que obtuvo mayor promedio. 
Suponga que los alumnos tienen diferentes promedios.
*autor @agenovez
*
*/

import java.util.Scanner;

public class EncontrarEstudianteConMayorPromedio {
    public static void main(String[] args) {
        // Inicializar las variables
        double mayorPromedio = 0;
        int numeroDeEstudianteConMayorPromedio = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de estudiantes:");
        int numeroDeEstudiantes = scanner.nextInt();

        // Iterar por cada estudiante
        for (int i = 1; i <= numeroDeEstudiantes; i++) {
            System.out.println("Ingrese el número del estudiante " + i + ":");
            int numeroDeEstudiante = scanner.nextInt();

            double sumaDeCalificaciones = 0;

            // Leer las 5 unidades
            for (int j = 1; j <= 5; j++) {
                System.out.println("Ingrese la calificación de la unidad " + j + ":");
                double calificacion = scanner.nextDouble();
                sumaDeCalificaciones += calificacion;
            }

            // Calcular el promedio
            double promedio = sumaDeCalificaciones / 5;

            // Actualizar el mayor promedio si es necesario
            if (promedio > mayorPromedio) {
                mayorPromedio = promedio;
                numeroDeEstudianteConMayorPromedio = numeroDeEstudiante;
            }
        }

        // Mostrar el resultado
        System.out.println("El número del estudiante con el mayor promedio es: " + numeroDeEstudianteConMayorPromedio);
        System.out.println("El mayor promedio es: " + mayorPromedio);

        scanner.close();
    }
}
