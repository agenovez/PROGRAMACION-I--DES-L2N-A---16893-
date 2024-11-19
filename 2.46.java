/*Suponga que tiene una tienda y desea registrar sus ventas por medio de una computadora. Diseñe un programa que lea por cada cliente: 
-El monto de la venta
-Calcule e imprima el IVA (15%) 
-Calcule e imprima el total a pagar
-Lea la cantidad con que paga el cliente
-Calcule e imprima el cambio
Al final del día deberá imprimir la cantidad de dinero que debe haber en la caja.
* autor @agenovez
*/

import java.util.Scanner;

public class RegistroDeVentas {
    public static void main(String[] args) {
        // Declaración de variables
        double montoVenta, iva, totalPagar, pagoCliente, cambio, totalCaja = 0;
        String continuar;

        Scanner scanner = new Scanner(System.in);

        // Bucle para procesar ventas de múltiples clientes
        do {
            // Leer el monto de la venta
            System.out.print("Ingrese el monto de la venta: ");
            montoVenta = scanner.nextDouble();

            // Calcular IVA y total a pagar
            iva = montoVenta * 0.15;
            totalPagar = montoVenta + iva;

            // Mostrar IVA y total a pagar
            System.out.println("El IVA es: " + iva);
            System.out.println("El total a pagar es: " + totalPagar);

            // Leer el monto con el que paga el cliente
            System.out.print("Ingrese la cantidad con la que paga el cliente: ");
            pagoCliente = scanner.nextDouble();

            // Calcular y mostrar el cambio
            cambio = pagoCliente - totalPagar;
            if (cambio < 0) {
                System.out.println("El cliente no ha pagado lo suficiente. Falta: " + (-cambio));
            } else {
                System.out.println("El cambio a devolver es: " + cambio);
            }

            // Actualizar la cantidad total en caja
            totalCaja += totalPagar;

            // Preguntar si se desea continuar
            System.out.print("¿Desea registrar otra venta? (s/n): ");
            continuar = scanner.next().toLowerCase();

        } while (continuar.equals("s"));

        // Mostrar el total en caja al final del día
        System.out.println("El total de dinero en la caja al final del día es: " + totalCaja);

        scanner.close();
    }
}
