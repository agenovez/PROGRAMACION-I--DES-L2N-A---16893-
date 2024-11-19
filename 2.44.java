/*Suponga que tiene usted una tienda y desea registrar las ventas en su computadora. 
Diseñe un programa que lea por cada cliente, el monto total de su compra. 
Al final del día escriba la cantidad total de ventas y el número de clientes atendidos.
*author agenovez
*/

import java.util.Scanner;

public class RegistroVentasDiarias {
    public static void main(String[] args) {
        // Inicializar variables
        double ventasTotales = 0;
        int conteoClientes = 0;
        String continuar;

        Scanner scanner = new Scanner(System.in);

        // Bucle para procesar las ventas de los clientes
        do {
            System.out.print("Ingrese el monto de la compra del cliente: ");
            double montoCompra = scanner.nextDouble();

            // Sumar el monto de la compra a las ventas totales
            ventasTotales += montoCompra;

            // Incrementar el contador de clientes
            conteoClientes++;

            // Preguntar si hay más clientes
            System.out.print("¿Hay más clientes? (si/no): ");
            continuar = scanner.next().toLowerCase();

        } while (continuar.equals("si"));

        // Mostrar el resultado
        System.out.println("Ventas totales del día: " + ventasTotales);
        System.out.println("Número total de clientes: " + conteoClientes);

        scanner.close();
    }
}
