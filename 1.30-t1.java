/*Una persona enferma que pesa 70 Kg, se encuentra en reposo y desea saber cuántas calorías consume su cuerpo durante todo el tiempo que realice una misma actividad.
*Las actividades que tiene permitido realizar son únicamente dormir o estar sentado en reposo. 
Los datos que tiene son que estando dormido consume 1.08 calorías por minuto 
y estando sentado en reposo consume 1.66 calorías por minuto. 
* autor @agenovez
*/
import java.util.Scanner;

public class CaloriasConsumo {
    public static void main(String[] args) {
        // Declaración de variables
        double peso = 70; // Peso de la persona
        String actividad;
        int minutos;
        double caloriasPorMinuto = 0, caloriasTotales;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la actividad que está realizando:");
        System.out.println("1. Dormir");
        System.out.println("2. Sentado en reposo");
        actividad = scanner.nextLine();

        System.out.print("Ingrese el tiempo en minutos que realiza la actividad: ");
        minutos = scanner.nextInt();

        // Determinar las calorías por minuto según la actividad
        if (actividad.equals("1")) {
            caloriasPorMinuto = 1.08;
        } else if (actividad.equals("2")) {
            caloriasPorMinuto = 1.66;
        } else {
            System.out.println("Opción no válida. Finalizando el programa.");
            scanner.close();
            return;
        }

        // Calcular las calorías totales consumidas
        caloriasTotales = caloriasPorMinuto * minutos;

        // Mostrar el resultado
        System.out.println("Calorías consumidas durante " + minutos + " minutos: " + caloriasTotales + " calorías.");

        scanner.close();
    }
}
