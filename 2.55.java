/*La empresa Automovilística premia anualmente a sus mejores vendedores de acuerdo a las siguientes condiciones:
- de 100 carros hasta 300 tiene una comisión de 3%, 
- de más de 300 carros hasta 500 tiene una comisión de 4%, 
- de más de 500 carros hasta 700 tiene una comisión de 5% 
- y de más de 700 carros una comisión de 6%.
Diseñar un programa que lea las ventas de 100 vendedores y que escriba la comisión anual que le corresponda a cada vendedor. 
Nadie vende más de 1.000 carros al año.
*autor agenovez
*/

import java.util.Scanner;

public class CalcularComisionesAnuales {
    public static void main(String[] args) {
        // Declarar variables
        int ventas;
        double tasaComision, comision;

        Scanner scanner = new Scanner(System.in);

        // Bucle para procesar 100 vendedores
        for (int i = 1; i <= 100; i++) {
            // Solicitar el número de autos vendidos por el vendedor
            System.out.print("Ingrese el número de autos vendidos por el vendedor " + i + ": ");
            ventas = scanner.nextInt();

            // Determinar la tasa de comisión en función de las ventas
            if (ventas >= 100 && ventas <= 300) {
                tasaComision = 0.03;
            } else if (ventas > 300 && ventas <= 500) {
                tasaComision = 0.04;
            } else if (ventas > 500 && ventas <= 700) {
                tasaComision = 0.05;
            } else if (ventas > 700 && ventas <= 1000) {
                tasaComision = 0.06;
            } else {
                tasaComision = 0; // Sin comisión para ventas menores a 100 o inválidas
            }

            // Calcular la comisión
            comision = ventas * tasaComision;

            // Mostrar la comisión para el vendedor
            System.out.printf("La comisión anual para el vendedor %d es: %.2f%n", i, comision);
        }

        scanner.close();
    }
}
