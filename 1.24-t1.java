/*Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 horas o menos se le paga USD 16 por hora. 
Si trabaja más de 40 horas se le paga USD 16 por cada una de las primeras 40 horas y USD 20 por cada hora extra. 
* autor @agenovez
*/

import java.util.Scanner;

public class CalcularSalarioSemanal {
    public static void main(String[] args) {
        // Declaración de variables
        double horasTrabajadas, salarioTotal, horasExtra;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de horas trabajadas en la semana: ");
        horasTrabajadas = scanner.nextDouble();

        // Cálculo del salario semanal
        if (horasTrabajadas <= 40) {
            salarioTotal = horasTrabajadas * 16;
        } else {
            horasExtra = horasTrabajadas - 40;
            salarioTotal = (40 * 16) + (horasExtra * 20);
        }

        // Salida del resultado
        System.out.printf("El salario semanal del obrero es: USD %.2f%n", salarioTotal);

        // Cerrar el Scanner
        scanner.close();
    }
}

