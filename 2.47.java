/* Modificar el pseudocódigo y programa anterior 2.46.java de tal forma que no permita que la cantidad con la que paga el cliente sea menor a lo que debe pagar.
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

            // Validar que el cliente pague al menos el total
            do {
                System.out.print("Ingrese la cantidad con la que paga el cliente: ");
                pagoCliente = scanner.nextDouble();

                if (pagoCliente < totalPagar) {
                    System.out.println("El cliente no ha pagado lo suficiente. Falta: " + (totalPagar - pagoCliente));
                }
            } while (pagoCliente < totalPagar);

            // Calcular y mostrar el cambio
            cambio = pagoCliente - totalPagar;
            System.out.println("El cambio a devolver es: " + cambio);

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
