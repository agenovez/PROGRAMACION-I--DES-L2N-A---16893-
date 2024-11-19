/*Hacer un programa que realice las operaciones matemáticas básicas: suma, resta, multiplicación y división de dos números enteros. 
*autor @agenovez
*/
import java.util.Scanner;

public class OperacionesMatematicas {
    public static void main(String[] args) {
        // Declaración de variables
        int opcion;
        double numero1, numero2, resultado = 0;
        boolean operacionValida = true;

        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Menú de opciones
        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Ingrese su opción: ");
        opcion = scanner.nextInt();

        // Entrada de los números
        System.out.print("Ingrese el primer número: ");
        numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        numero2 = scanner.nextDouble();

        // Procesamiento según la opción seleccionada
        switch (opcion) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Opción no válida. Inténtelo de nuevo.");
                operacionValida = false;
                break;
        }

        // Salida del resultado si la operación es válida
        if (operacionValida) {
            System.out.printf("El resultado de la operación es: %.2f%n", resultado);
        }

        // Cierre del scanner
        scanner.close();
    }
}
