/*Leer 50 calificaciones de un grupo de alumnos. Calcule y escriba el porcentaje de reprobado, Tomando en cuenta que la calificación mínima aprobatoria es de 70. 
@autor agenovez
*/

import java.util.Scanner;

public class CalcularPorcentajeFallas {
    public static void main(String[] args) {
        // Definir constantes y variables
        final int calificacionesTotales = 50; // Número total de estudiantes
        int cuentaFallas = 0;
        int calificacion;
        double porcentajeFallas;

        Scanner scanner = new Scanner(System.in);

        // Bucle para leer cada calificación
        for (int i = 1; i <= calificacionesTotales; i++) {
            System.out.print("Ingrese calificación para el estudiante " + i + ": ");
            calificacion = scanner.nextInt();

            // Comprobar si la calificación es fallida
            if (calificacion < 70) {
                cuentaFallas++;
            }
        }

        // Calcular porcentaje de fallas
        porcentajeFallas = ((double) cuentaFallas / calificacionesTotales) * 100;

        // Mostrar el resultado
        System.out.println("Porcentaje de estudiantes fallidos: " + porcentajeFallas + "%");

        scanner.close();
    }
}
