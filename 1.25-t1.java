/*Realizar un programa que solicite dos números enteros, los ordene en forma ascendente y los imprima. 
* autor @agenovez
*/
import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        // Declaración de variables
        int numero1, numero2, temporal;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        numero2 = scanner.nextInt();

        // Ordenamiento ascendente
        if (numero1 > numero2) {
            temporal = numero1;
            numero1 = numero2;
            numero2 = temporal;
        }

        // Salida de los números ordenados
        System.out.println("Los números en orden ascendente son: " + numero1 + " y " + numero2);

        // Cierre del scanner
        scanner.close();
    }
}
