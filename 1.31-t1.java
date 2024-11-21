/*Hacer un programa que imprima el nombre de un artículo clave, precio original y su precio con descuento. 
El descuento lo hace en base a la clave, si la clave es 01 el descuento es del 10% y si la clave es 02 
el descuento es del 20% (solo existen dos claves).
*autor agenovez
*/
import java.util.Scanner;

public class PrecioConDescuento {
    public static void main(String[] args) {
        // Declaración de variables
        String nombreArticulo;
        int clave;
        double precioOriginal, descuento = 0, precioFinal;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el nombre del artículo: ");
        nombreArticulo = scanner.nextLine();

        System.out.print("Ingrese el precio original del artículo: ");
        precioOriginal = scanner.nextDouble();

        System.out.print("Ingrese la clave del descuento (01 o 02): ");
        clave = scanner.nextInt();

        // Determinación del descuento según la clave
        if (clave == 1) {
            descuento = precioOriginal * 0.10;
        } else if (clave == 2) {
            descuento = precioOriginal * 0.20;
        } else {
            System.out.println("Clave inválida. No se aplicará descuento.");
        }

        // Cálculo del precio final
        precioFinal = precioOriginal - descuento;

        // Mostrar los resultados
        System.out.println("Nombre del artículo: " + nombreArticulo);
        System.out.println("Precio original: USD " + precioOriginal);
        System.out.println("Descuento aplicado: USD " + descuento);
        System.out.println("Precio final: USD " + precioFinal);

        // Cerrar el Scanner
        scanner.close();
    }
}
