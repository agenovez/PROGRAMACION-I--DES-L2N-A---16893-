/*Diseñe un programa que lea los 2500000 votos otorgados a los 3 candidatos a gobernador e imprima el número del candidato ganador y su cantidad de votos.
*autor agenovez
*/



import java.util.Scanner;

public class EleccionGobernador {
    public static void main(String[] args) {
        // Declarar variables para los votos de cada candidato
        int candidato1, candidato2, candidato3;
        int ganador = 0, votosMaximos = 0;

        Scanner scanner = new Scanner(System.in);

        // Ingresar los votos para cada candidato
        System.out.print("Ingrese el número de votos para el Candidato 1: ");
        candidato1 = scanner.nextInt();

        System.out.print("Ingrese el número de votos para el Candidato 2: ");
        candidato2 = scanner.nextInt();

        System.out.print("Ingrese el número de votos para el Candidato 3: ");
        candidato3 = scanner.nextInt();

        // Determinar el ganador comparando los votos
        if (candidato1 > candidato2 && candidato1 > candidato3) {
            ganador = 1;
            votosMaximos = candidato1;
        } else if (candidato2 > candidato1 && candidato2 > candidato3) {
            ganador = 2;
            votosMaximos = candidato2;
        } else if (candidato3 > candidato1 && candidato3 > candidato2) {
            ganador = 3;
            votosMaximos = candidato3;
        }

        // Mostrar el número del ganador y la cantidad de votos
        if (ganador != 0) {
            System.out.println("El candidato ganador es el Candidato " + ganador);
            System.out.println("Número de votos: " + votosMaximos);
        } else {
            System.out.println("Hubo un empate entre los candidatos.");
        }

        scanner.close();
    }
}
