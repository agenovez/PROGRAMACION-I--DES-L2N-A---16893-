/*Diseñe un pseudocódigo que imprima la fecha en palabras a partir de la representación siguiente:  S,DD,MM, AA.
En donde:
S = Día de la semana, 1 a 7 ( 1 = lunes; 2 = martes; etc..);
DD = Día del mes, 1 a 30 ó 31, según el mes. Fijar el mes de febrero con 28 días;
AA = Dos últimas cifras del año.
* autor @agenovez
*/
import java.util.Scanner;

public class ImprimirFechaEnPalabras {
    public static void main(String[] args) {
        // Definir variables para día, mes y año
        int diaSemana, diaMes, mes, anio;
        String nombreDia = "", nombreMes = "";

        Scanner scanner = new Scanner(System.in);

        // Entrada de los componentes de la fecha
        System.out.print("Ingrese el día de la semana (1 = Lunes, 2 = Martes, ..., 7 = Domingo): ");
        diaSemana = scanner.nextInt();

        System.out.print("Ingrese el día del mes (DD): ");
        diaMes = scanner.nextInt();

        System.out.print("Ingrese el mes (MM): ");
        mes = scanner.nextInt();

        System.out.print("Ingrese los últimos dos dígitos del año (YY): ");
        anio = scanner.nextInt();

        // Determinar el nombre del día de la semana
        switch (diaSemana) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                System.out.println("Día de la semana inválido.");
                return;
        }

        // Determinar el nombre del mes
        switch (mes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                if (diaMes > 28) {
                    System.out.println("Día inválido para Febrero. Solo tiene 28 días.");
                    return;
                }
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                if (diaMes > 30) {
                    System.out.println("Día inválido para Abril. Solo tiene 30 días.");
                    return;
                }
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                if (diaMes > 30) {
                    System.out.println("Día inválido para Junio. Solo tiene 30 días.");
                    return;
                }
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                if (diaMes > 30) {
                    System.out.println("Día inválido para Septiembre. Solo tiene 30 días.");
                    return;
                }
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                if (diaMes > 30) {
                    System.out.println("Día inválido para Noviembre. Solo tiene 30 días.");
                    return;
                }
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                System.out.println("Mes inválido.");
                return;
        }

        // Validar el día del mes
        if (diaMes < 1 || diaMes > 31) {
            System.out.println("Día inválido.");
            return;
        }

        // Imprimir la fecha en palabras
        System.out.printf("La fecha es: %s, %d de %s, 20%d%n", nombreDia, diaMes, nombreMes, anio);

        scanner.close();
    }
}
