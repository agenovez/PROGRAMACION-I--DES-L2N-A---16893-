/*1.19. La compañía que gestiona la autopista ha decidido cambiar las tarifas de peaje. 
Estas tarifas dependen del tipo de vehículo (camión o automóvil) que desee utilizar la autopista así como el número de pasajeros que lleven y de la hora del dia: 
en las horas de alta congestión los automóviles con tres pasajeros más no pagan peaje pero los camiones pagan 50 dólares; 
en las horas menos congestionadas el peaje para los automóviles es de 25 dólares y para los camiones es de 30 dólares independientemente del nÚmero de pasajeros. 
Escriba un programa que leyendo el tipo de vehículo, tipo de hora (si la hora es de alta congestión o no) y el número de pasajeros, calcule la tarifa que le debe cobrar a un vehículo.
*autor @agenovez
*/

import java.util.Scanner;

public class CalcularTarifaPeaje {
    public static void main(String[] args) {
        // Declaración de variables
        char tipoVehiculo;
        char tipoHora;
        int numPasajeros;
        double tarifa = 0;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tipo de vehículo (C para Camión, A para Automóvil): ");
        tipoVehiculo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Ingrese el tipo de hora (A para alta congestión, B para baja congestión): ");
        tipoHora = scanner.next().toUpperCase().charAt(0);

        System.out.print("Ingrese el número de pasajeros en el vehículo: ");
        numPasajeros = scanner.nextInt();

        // Cálculo de la tarifa
        if (tipoHora == 'A') { // Hora de alta congestión
            if (tipoVehiculo == 'A') { // Automóvil
                if (numPasajeros >= 3) {
                    tarifa = 0; // Automóviles con 3 o más pasajeros no pagan
                } else {
                    tarifa = 25; // Automóviles con menos de 3 pasajeros
                }
            } else if (tipoVehiculo == 'C') { // Camión
                tarifa = 50; // Camiones siempre pagan 50 dólares
            } else {
                System.out.println("Tipo de vehículo no válido.");
                return;
            }
        } else if (tipoHora == 'B') { // Hora de baja congestión
            if (tipoVehiculo == 'A') { // Automóvil
                tarifa = 25; // Automóviles pagan tarifa fija
            } else if (tipoVehiculo == 'C') { // Camión
                tarifa = 30; // Camiones pagan tarifa fija
            } else {
                System.out.println("Tipo de vehículo no válido.");
                return;
            }
        } else {
            System.out.println("Tipo de hora no válido.");
            return;
        }

        // Salida de la tarifa
        System.out.printf("La tarifa a pagar es: USD %.2f%n", tarifa);

        scanner.close();
    }
}
