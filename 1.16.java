//1.16. Calcular el salario neto de un trabajador de una empresa cuyo trabajo se paga por horas. Introducir por teclado el número de horas y el precio de Ia hora. El cálculo se realiza del siguiente modo: 
//Las primeras 35 horas de cada semana se pagan a la tarifa normal (suponer 4 semanas al mes).
//Las horas extras se pagan un 50% más que las normales.
//Los impuestos a deducir a los trabajadores varían en función su sueldo mensual (considerando las horas extras trabajadas): 
//Si el sueldo es menor de USD 600 está libre de impuestos. 
//Si el sueldo está entre USD  600 y USD 1000, se cobra el 20% de impuestos.
//Si el sueldo es mayor de USD 1000 se cobra el 30% de impuestos. 
import java.util.Scanner;

public class CalcularSalarioNeto {

    public static void main(String[] args) {
        // Declaración de constantes
        final int HORAS_NORMALES_POR_SEMANA = 35;
        final int SEMANAS_POR_MES = 4;
        final double FACTOR_EXTRA = 1.5;

        // Variables
        double horasTrabajadas, precioHora, sueldoBruto, sueldoNeto, impuestos;
        double horasNormales, horasExtras;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de horas trabajadas en el mes: ");
        horasTrabajadas = scanner.nextDouble();

        System.out.print("Ingrese el precio por hora trabajada: ");
        precioHora = scanner.nextDouble();

        // Cálculo de horas normales y extras
        horasNormales = HORAS_NORMALES_POR_SEMANA * SEMANAS_POR_MES;

        if (horasTrabajadas <= horasNormales) {
            sueldoBruto = horasTrabajadas * precioHora;
        } else {
            horasExtras = horasTrabajadas - horasNormales;
            sueldoBruto = (horasNormales * precioHora) + (horasExtras * precioHora * FACTOR_EXTRA);
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
        System.out.println("Sueldo bruto: USD " + sueldoBruto);
        System.out.println("Impuestos: USD " + impuestos);
        System.out.println("Sueldo neto: USD " + sueldoNeto);

        scanner.close();
    }
}
