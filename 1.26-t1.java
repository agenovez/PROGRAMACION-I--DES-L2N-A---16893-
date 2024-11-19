/*Un alumno desea realizar varias conversiones del sistema inglés de mediciones al sistema métrico decimal. Haga un programa que realice la conversión de metros pies y de pies a metros.
*autor @agenovez
*/
import java.util.Scanner;

public class ConversionMedidas {
    public static void main(String[] args) {
        // Declaración de variables
        int opcion;
        double metros, pies;

        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Menú de opciones
        System.out.println("Seleccione la conversión que desea realizar:");
        System.out.println("1. Convertir metros a pies");
        System.out.println("2. Convertir pies a metros");
        System.out.print("Ingrese su opción: ");
        opcion = scanner.nextInt();

        // Procesamiento según la opción seleccionada
        switch (opcion) {
            case 1:
                // Conversión de metros a pies
                System.out.print("Ingrese la cantidad en metros: ");
                metros = scanner.nextDouble();
                pies = metros * 3.28084;
                System.out.printf("%.2f metros equivalen a %.2f pies.%n", metros, pies);
                break;
            case 2:
                // Conversión de pies a metros
                System.out.print("Ingrese la cantidad en pies: ");
                pies = scanner.nextDouble();
                metros = pies / 3.28084;
                System.out.printf("%.2f pies equivalen a %.2f metros.%n", pies, metros);
                break;
            default:
                System.out.println("Opción no válida. Inténtelo de nuevo.");
                break;
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
