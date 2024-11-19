/*1.16. Calcular el salario neto de un trabajador de una empresa cuyo trabajo se paga por horas. Introducir por teclado el número de horas y el precio de Ia hora. El cálculo se realiza del siguiente modo: 
Las primeras 35 horas de cada semana se pagan a la tarifa normal (suponer 4 semanas al mes).
Las horas extras se pagan un 50% más que las normales.
Los impuestos a deducir a los trabajadores varían en función su sueldo mensual (considerando las horas extras trabajadas): 
Si el sueldo es menor de USD 600 está libre de impuestos. 
Si el sueldo está entre USD  600 y USD 1000, se cobra el 20% de impuestos.
Si el sueldo es mayor de USD 1000 se cobra el 30% de impuestos. 
*autor @agenovez
*/

import java.util.Scanner;

public class CalcularSalarioNeto {
    public static void main(String[] args) {
        // Declaración de variables
        double horasTrabajadas, precioHora, horasNormales = 35, horasExtras, sueldoBruto, sueldoNeto, impuestos;
        final double PRECIO_EXTRA_FACTOR = 1.5;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de horas trabajadas en el mes: ");
        horasTrabajadas = scanner.nextDouble();

        System.out.print("Ingrese el precio por hora trabajada: ");
        precioHora = scanner.nextDouble();

        // Cálculo del sueldo bruto
        if (horasTrabajadas <= horasNormales * 4) {
            sueldoBruto = horasTrabajadas * precioHora;
        } else {
            horasExtras = horasTrabajadas - (horasNormales * 4);
            sueldoBruto = (horasNormales * 4 * precioHora) + (horasExtras * precioHora * PRECIO_EXTRA_FACTOR);
        }

        // Cálculo de impuestos
        if (sueldoBruto < 600) {
            impuestos = 0;
        } else if (sueldoBruto >= 600 && sueldoBruto <= 1000) {
            impuestos = sueldoBruto * 0.2;
        } else {
            impuestos = sueldoBruto * 0.3;
        }

        // Cálculo del sueldo neto
        sueldoNeto = sueldoBruto - impuestos;

        // Salida de resultados
        System.out.printf("Sueldo bruto: USD %.2f%n", sueldoBruto);
        System.out.printf("Impuestos: USD %.2f%n", impuestos);
        System.out.printf("Sueldo neto: USD %.2f%n", sueldoNeto);

        scanner.close();
    }
}
