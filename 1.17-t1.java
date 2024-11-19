/*1.17. En una empresa cada empleado debe teclear un código identificador de 3 cifras en la entrada. Escribir un programa que muestre por pantalla Ia categoría del empleado teniendo en cuenta que: 
Si el código es divisible por 2, por 3 y por 5, Ia categoría del empleado es “Director General”
Si el código es divisible por 3 y por 5 pero no por 2, Ia categoría del empleado es 'Directivo'. 
Si el código es divisible por 2, pero no por 3 ni por 5, la categoría del empleado es “Staff'.
Si el código no es divisible por 2, ni por 3 ni por 5, la categoría del empleado es ''Seguridad”. 
Recuerde que: Un número X es divisible por otro Y; si X mod Y = 0.
*autor @agenovez
*/
import java.util.Scanner;

public class CategoriaEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el código identificador
        System.out.print("Ingrese el código identificador de 3 cifras: ");
        int codigo = scanner.nextInt();

        // Determinar la categoría del empleado
        if (codigo % 2 == 0 && codigo % 3 == 0 && codigo % 5 == 0) {
            System.out.println("La categoría del empleado es 'Director General'.");
        } else if (codigo % 3 == 0 && codigo % 5 == 0 && codigo % 2 != 0) {
            System.out.println("La categoría del empleado es 'Directivo'.");
        } else if (codigo % 2 == 0 && codigo % 3 != 0 && codigo % 5 != 0) {
            System.out.println("La categoría del empleado es 'Staff'.");
        } else {
            System.out.println("La categoría del empleado es 'Seguridad'.");
        }

        scanner.close();
    }
}
