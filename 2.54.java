/*Un objeto es dejado caer de una altura de 100m. Diseñe un programa que imprima cada décima de segundo la distancia entre el objeto y el suelo. 
Al final imprima el tiempo necesario en décimas de segundo para que el objeto toque el suelo.
*autor @agenovez
*/
public class ObjetoCayendo {
    public static void main(String[] args) {
        // Declarar constantes y variables
        double altura = 100; // Altura inicial en metros
        double distanciaCaida, distanciaAlSuelo, tiempo = 0;
        final double gravedad = 9.8; // Aceleración debido a la gravedad en m/s^2

        // Bucle hasta que el objeto toque el suelo
        while (altura > 0) {
            // Calcular la distancia caída
            distanciaCaida = 0.5 * gravedad * (tiempo * tiempo);

            // Calcular la distancia restante al suelo
            distanciaAlSuelo = 100 - distanciaCaida;

            // Asegurarse de que la distancia no sea menor a 0
            if (distanciaAlSuelo < 0) {
                distanciaAlSuelo = 0;
            }

            // Imprimir el tiempo y la distancia al suelo
            System.out.printf("Tiempo: %.1f segundos, Distancia al suelo: %.2f metros%n", tiempo, distanciaAlSuelo);

            // Verificar si el objeto ha tocado el suelo
            if (distanciaAlSuelo == 0) {
                System.out.println("El objeto ha tocado el suelo.");
                break;
            }

            // Incrementar el tiempo en 0.1 segundos
            tiempo += 0.1;
        }

        // Imprimir el tiempo total en décimas de segundo
        System.out.printf("Tiempo total requerido para tocar el suelo: %.1f segundos%n", tiempo);
    }
}
