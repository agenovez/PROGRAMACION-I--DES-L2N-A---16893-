/*Diseñar un pseudocódigo y programa en java que convierte un número del sistema decimal a: 
• Sistema binario 
• Sistema decimal 
• Sistema hexadecimal. 
* autor @agenovez
*/
import java.util.Scanner;

public class ConvertirNumeros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número en sistema decimal
        System.out.print("Ingrese un número en sistema decimal: ");
        int numeroDecimal = scanner.nextInt();

        // Convertir el número a los diferentes sistemas
        String numeroBinario = Integer.toBinaryString(numeroDecimal);
        String numeroOctal = Integer.toOctalString(numeroDecimal);
        String numeroHexadecimal = Integer.toHexString(numeroDecimal).toUpperCase();

        // Mostrar los resultados
        System.out.println("Número en sistema binario: " + numeroBinario);
        System.out.println("Número en sistema octal: " + numeroOctal);
        System.out.println("Número en sistema hexadecimal: " + numeroHexadecimal);

        // Cerrar el Scanner
        scanner.close();
    }
}
