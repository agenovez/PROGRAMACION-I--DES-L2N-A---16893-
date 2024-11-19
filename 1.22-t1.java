/*En un almacén se hace un 20% de descuento a los clientes cuya compra supere los usd 1.000 . ¿Cuál será Ia cantidad que pagara una persona por su compra? 
* autor @agenovez
*/

import java.util.Scanner;

public class CalcularDescuento {
    public static void main(String[] args) {
        // Declaración de variables
        double totalCompra, descuento = 0, totalAPagar;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el total de la compra en USD: ");
        totalCompra = scanner.nextDouble();

        // Cálculo del descuento y total a pagar
        if (totalCompra > 1000) {
            descuento = totalCompra * 0.20;
        }
        totalAPagar = totalCompra - descuento;

        // Salida de resultados
        System.out.printf("El descuento aplicado es: USD %.2f%n", descuento);
        System.out.printf("El total a pagar es: USD %.2f%n", totalAPagar);

        // Cierre del scanner
        scanner.close();
    }
}
