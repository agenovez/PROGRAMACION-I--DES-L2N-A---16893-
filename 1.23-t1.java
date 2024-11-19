/*La fecha del domingo de Pascua corresponde al primer domingo después de la primera luna llena que sigue al equinoccio de primavera. 
Dado un año, los cálculos que permiten conocer esta fecha son (% es division modular): 
A = año % 19, 
B = año % 4, 
C = año % 7, 
D = (19*A+ 24) % 30, 
E = (2*B+4*C+6*D+.5) %7, 
N = (22,D+E) 
Donde N indica el número del día del mes de marzo (o abril si N es superior a 31) correspondiente al domingo de Pascua. 
Escribir un programa que lea un año y muestre el día y el mes en el que se celebró o se celebrará el domingo de Pascua ese año. 
Utilizar una función a la que se le pase como parámetro el año y retome el valor de N. El programa principal realiza el resto del proceso. 
* autor @agenovez
*/
import java.util.Scanner;

public class DomingosDePascua {
    public static void main(String[] args) {
        // Declaración de variables
        int año, A, B, C, D, E, N;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el año: ");
        año = scanner.nextInt();

        // Cálculos
        A = año % 19;
        B = año % 4;
        C = año % 7;
        D = (19 * A + 24) % 30;
        E = (2 * B + 4 * C + 6 * D + 5) % 7;
        N = 22 + D + E;

        // Determinación del mes y salida de resultados
        if (N <= 31) {
            System.out.println("El domingo de Pascua es el " + N + " de marzo del " + año);
        } else {
            System.out.println("El domingo de Pascua es el " + (N - 31) + " de abril del " + año);
        }

        // Cierre del scanner
        scanner.close();
    }
}
