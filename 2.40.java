/*Calcular la suma siguiente:
100 + 98 …+ 0 en ese orden.
* @author agenovez
*/

public class CalcularSumaDecreciente {
    public static void main(String[] args) {
        // Definición de variables
        int suma = 0;
        int numero = 100;

        // Bucle que realiza la suma decreciente restando 2
        while (numero >= 0) {
            suma += numero;
            numero -= 2;
        }

        // Mostrar el resultado
        System.out.println("La suma de la secuencia es: " + suma);
    }
}
