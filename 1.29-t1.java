/*Una fábrica ha sido sometida a un programa de control de contaminación para lo cual se efectúa una revisión de los puntos IMECA 
generados por la fábrica. El programa de control de contaminación consiste en medir los puntos IMECA que emite la fábrica en cinco 
días de una semana y si el promedio es superior a los 170 puntos entonces tendrá la sanción de parar su producción por una semana 
y una multa del 50% de las ganancias diarias cuando no se detiene la producción. Si el promedio obtenido de puntos IMECA 
es de 170 o menor entonces no tendrá ni sanción ni multa. 
El dueño de la fábrica desea saber cuánto dinero perderá después de ser sometido a la revisión. 
*
*/
import java.util.Scanner;

public class ControlContaminacion {
    public static void main(String[] args) {
        // Declaración de variables
        double IMECA1, IMECA2, IMECA3, IMECA4, IMECA5;
        double promedio, gananciaDiaria, multa, dineroPerdido;

        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese los puntos IMECA del día 1: ");
        IMECA1 = scanner.nextDouble();

        System.out.print("Ingrese los puntos IMECA del día 2: ");
        IMECA2 = scanner.nextDouble();

        System.out.print("Ingrese los puntos IMECA del día 3: ");
        IMECA3 = scanner.nextDouble();

        System.out.print("Ingrese los puntos IMECA del día 4: ");
        IMECA4 = scanner.nextDouble();

        System.out.print("Ingrese los puntos IMECA del día 5: ");
        IMECA5 = scanner.nextDouble();

        System.out.print("Ingrese la ganancia diaria de la fábrica en USD: ");
        gananciaDiaria = scanner.nextDouble();

        // Cálculo del promedio de puntos IMECA
        promedio = (IMECA1 + IMECA2 + IMECA3 + IMECA4 + IMECA5) / 5;

        // Verificar si el promedio excede los 170 puntos
        if (promedio > 170) {
            multa = gananciaDiaria * 0.50;
            dineroPerdido = multa * 7; // Sanción de 7 días con multa diaria
            System.out.println("La fábrica tendrá una sanción. El dinero perdido será: USD " + dineroPerdido);
        } else {
            System.out.println("El promedio de puntos IMECA es aceptable. No habrá sanción ni multa.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
