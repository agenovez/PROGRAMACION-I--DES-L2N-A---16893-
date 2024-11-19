/*Diseñe un programa que calcule e imprima el pago de 102 trabajadores que laboren en la Compañía GACNIAN. Los datos que se leerán serán los siguientes 
• Las horas trabajadas 
• El sueldo por hora 
• El tipo de trabajador (1: Obrero, 2: Empleado) 
Para calcular los pagos considerar lo siguiente
• Los obreros pagan el 10 % de impuesto. 
• Los empleados pagan el 10% de impuesto. 
• Los trabajadores (obreros y empleados) que reciban un pago menor de 1000 no pagan impuesto 
• Al final se deberá imprimir el total a pagar a los obreros y a los empleados .
*autor @agenovez
*/
import java.util.Scanner;

public class PagosEmpresaGACNIAN {
    public static void main(String[] args) {
        // Declaración de variables
        double horasTrabajadas, salarioPorHora, tipoTrabajador;
        double pagoBruto, pagoNeto;
        double totalPagosTrabajadores = 0;
        double totalPagosEmpleados = 0;

        Scanner scanner = new Scanner(System.in);

        // Bucle para procesar 102 trabajadores
        for (int i = 1; i <= 102; i++) {
            // Leer horas trabajadas, salario por hora y tipo de trabajador
            System.out.println("Ingrese las horas trabajadas para el trabajador " + i + ":");
            horasTrabajadas = scanner.nextDouble();

            System.out.println("Ingrese el salario por hora para el trabajador " + i + ":");
            salarioPorHora = scanner.nextDouble();

            System.out.println("Ingrese el tipo de trabajador (1: Trabajador, 2: Empleado) para el trabajador " + i + ":");
            tipoTrabajador = scanner.nextDouble();

            // Calcular pago bruto
            pagoBruto = horasTrabajadas * salarioPorHora;

            // Calcular pago neto con las condiciones de impuestos
            if (pagoBruto < 1000) {
                pagoNeto = pagoBruto; // No hay impuestos para pagos menores a 1000
            } else {
                pagoNeto = pagoBruto * 0.90; // Impuesto del 10% para pagos de 1000 o más
            }

            // Agregar el pago neto al total correspondiente según el tipo de trabajador
            if (tipoTrabajador == 1) {
                totalPagosTrabajadores += pagoNeto;
            } else if (tipoTrabajador == 2) {
                totalPagosEmpleados += pagoNeto;
            }
        }

        // Mostrar los pagos totales para trabajadores y empleados
        System.out.println("Pago total para Trabajadores: " + totalPagosTrabajadores);
        System.out.println("Pago total para Empleados: " + totalPagosEmpleados);

        scanner.close();
    }
}
