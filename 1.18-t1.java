/*La Dirección General de Tráfico necesita un programa que mida el índice alcohólico; 
dado el tipo de vehículo que conduce un conductor, determine si da positiva en el control de alcoholemia o no. 
La tasa máxima de alcohol según el tipo de vehículo se resume en lo siguiente: 
Si el Vehículo es Camión, el indicador es C y la tasa máxima es 0.3, 
Si el vehículo es autobús, el indicador es A y la tasa máxima es 0.3, 
si el vehículo es Turismo el indicador es T y la tasa máxima es 0.5 
y si es motocicleta el indicador es M y la tasa máxima es 0.3
* autor @agenovez
*/

import java.util.Scanner;

public class ControlAlcoholemia {
    public static void main(String[] args) {
        // Declaración de variables
        char tipoVehiculo;
        double tasaAlcohol;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tipo de vehículo (C para Camión, A para Autobús, T para Turismo, M para Motocicleta): ");
        tipoVehiculo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Ingrese la tasa de alcohol medida (en gramos por litro): ");
        tasaAlcohol = scanner.nextDouble();

        // Determinación del resultado del control
        switch (tipoVehiculo) {
            case 'C': // Camión
            case 'A': // Autobús
                if (tasaAlcohol <= 0.3) {
                    System.out.println("El conductor NO da positivo en el control de alcoholemia.");
                } else {
                    System.out.println("El conductor da POSITIVO en el control de alcoholemia.");
                }
                break;

            case 'T': // Turismo
                if (tasaAlcohol <= 0.5) {
                    System.out.println("El conductor NO da positivo en el control de alcoholemia.");
                } else {
                    System.out.println("El conductor da POSITIVO en el control de alcoholemia.");
                }
                break;

            case 'M': // Motocicleta
                if (tasaAlcohol <= 0.3) {
                    System.out.println("El conductor NO da positivo en el control de alcoholemia.");
                } else {
                    System.out.println("El conductor da POSITIVO en el control de alcoholemia.");
                }
                break;

            default:
                System.out.println("Tipo de vehículo no válido. Inténtelo de nuevo.");
                break;
        }

        scanner.close();
    }
}
