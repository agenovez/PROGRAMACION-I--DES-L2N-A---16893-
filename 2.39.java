/*Un negocio de copias tiene un límite de producción diaria de 10.000 copias si el tipo de impresión es offset y de 50.000 si el tipo es estándar. 
Si hay una solicitud de un el empleado tiene que verificar que las copias pendientes hasta el momento y las copias solicitadas no excedan del límite de producción. 
Si el límite de producción se excediera el trabajo solicitado no podría ser aceptado. 
El empleado necesita llevar un buen control de las copias solicitadas hasta el momento para decidir en forma rápida si los trabajos que se soliciten en el día se deben aceptar o no.
*/
import java.util.Scanner;

public class ControlDeCopias {
    public static void main(String[] args) {
        // Declaración de variables
        String tipoImpresion;
        int limiteProduccion;
        int copiasPendientes = 0;
        int copiasSolicitadas;
        String continuar;

        Scanner scanner = new Scanner(System.in);

        // Bucle para procesar solicitudes durante el día
        while (true) {
            // Mostrar opciones al usuario
            System.out.println("Tipo de impresión (offset o estandar):");
            tipoImpresion = scanner.nextLine();

            // Validar tipo de impresión
            if (tipoImpresion.equalsIgnoreCase("offset")) {
                limiteProduccion = 10000;
            } else if (tipoImpresion.equalsIgnoreCase("estandar")) {
                limiteProduccion = 50000;
            } else {
                System.out.println("Tipo de impresión no válido. Intente nuevamente.");
                continue;
            }

            // Solicitar la cantidad de copias
            System.out.println("Ingrese la cantidad de copias solicitadas:");
            copiasSolicitadas = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            // Verificar si se puede aceptar la solicitud
            if ((copiasPendientes + copiasSolicitadas) <= limiteProduccion) {
                copiasPendientes += copiasSolicitadas;
                System.out.println("Solicitud aceptada. Copias pendientes actuales: " + copiasPendientes);
            } else {
                System.out.println("Solicitud rechazada. Excede el límite de producción.");
            }

            // Preguntar si desea procesar otra solicitud
            System.out.println("¿Desea procesar otra solicitud? (si/no):");
            continuar = scanner.nextLine();

            if (continuar.equalsIgnoreCase("no")) {
                System.out.println("Fin del día. Copias pendientes totales: " + copiasPendientes);
                break;
            }
        }

        scanner.close();
    }
}

