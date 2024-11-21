/*El gobierno del estado de Bolívar desea reforestar un bosque que mide un determinado número de hectáreas. 
Si la superficie del terreno excede a 1 millón de metros cuadrados, entonces decidirá sembrar de la siguiente manera, 
en el 70% de la superficie sembrará araguaney, en el 20% sembrará samán, en el 10% sembrará ceiba. 
Si la superficie del terreno es menor o igual a un millón de metros cuadrados, entonces decidirá sembrar de la siguiente manera 
se sembrara en el 50% el árbol araguaney, en el 30% samán y en el 20% ceiba. 
El gobierno desea saber el número de araguaneyes, samanes y ceibas que tendrá que sembrar en el bosque, s
i se sabe que en 10 metros cuadrados caben 8 araguaneyes, en 15 metros cuadrados caben 15 samanes y en 18 metros cuadrados caben 10 ceibas. 
También se sabe que una hectárea equivale a 10.000 metros cuadrados.
* autor @agenovez
*/

import java.util.Scanner;

public class ReforestacionBolivar {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos de entrada
        Scanner sc = new Scanner(System.in);

        // Declaración de variables
        double hectareas, metrosCuadrados;
        double araguaneyArea, samanArea, ceibaArea;
        int numAraguaney, numSaman, numCeiba;

        // Entrada: Solicitar al usuario las hectáreas del terreno
        System.out.println("Ingrese el número de hectáreas del terreno:");
        hectareas = sc.nextDouble();

        // Convertir hectáreas a metros cuadrados
        metrosCuadrados = hectareas * 10000;

        // Decidir la distribución según la superficie
        if (metrosCuadrados > 1000000) {
            // Si es mayor a 1 millón de m²
            araguaneyArea = metrosCuadrados * 0.7;
            samanArea = metrosCuadrados * 0.2;
            ceibaArea = metrosCuadrados * 0.1;
        } else {
            // Si es menor o igual a 1 millón de m²
            araguaneyArea = metrosCuadrados * 0.5;
            samanArea = metrosCuadrados * 0.3;
            ceibaArea = metrosCuadrados * 0.2;
        }

        // Calcular la cantidad de árboles que caben en cada área
        numAraguaney = (int) (araguaneyArea / 10) * 8;
        numSaman = (int) (samanArea / 15) * 15;
        numCeiba = (int) (ceibaArea / 18) * 10;

        // Salida: Mostrar la cantidad de árboles a sembrar
        System.out.println("Cantidad de árboles a sembrar:");
        System.out.println("Araguaney: " + numAraguaney);
        System.out.println("Samán: " + numSaman);
        System.out.println("Ceiba: " + numCeiba);

        // Cerrar el Scanner
        sc.close();
    }
}
