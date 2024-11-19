/*1.20. Construir un programa que calcule y presente por pantalla el signo, del zodiaco a partir de la introducción por teclado del día y mes de nacimiento como números enteros. 
  Los rangos serían: para   Capricornio el rango de Fecha del 22 de diciembre al 20 de enero,
  para Acuario del 21 de enero al 19 de febrero, Piscis del 20 de febrero al 20 de marzo, 
  Aries del 21 de marzo al 19 de abril, Tauro del 20 de abril al 20 de mayo, 
  Geminis del 21 de mayo al 21 de junio, Cáncer del 22 de junio al 21 de Julio, 
  Leo del 22 de julio al 21 de agosto, Virgo del 22 de agosto al 22 de septiembre, 
  Libra del 23 de septiembre al 22 de octubre, Escorpio del 23 de octubre al 21 de noviembre, 
  Sagitario del 22 de noviembre al 21 de diciembre.
* autor @agenovez
*/

import java.util.Scanner;

public class SignoZodiacal {
    public static void main(String[] args) {
        // Declaración de variables
        int dia, mes;
        String signo = "";

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día de nacimiento (como número entero): ");
        dia = scanner.nextInt();

        System.out.print("Ingrese el mes de nacimiento (como número entero): ");
        mes = scanner.nextInt();

        // Determinación del signo zodiacal
        if (mes == 1) {
            if (dia >= 1 && dia <= 31) {
                signo = (dia <= 20) ? "Capricornio" : "Acuario";
            }
        } else if (mes == 2) {
            if (dia >= 1 && dia <= 29) {
                signo = (dia <= 19) ? "Acuario" : "Piscis";
            }
        } else if (mes == 3) {
            if (dia >= 1 && dia <= 31) {
                signo = (dia <= 20) ? "Piscis" : "Aries";
            }
        } else if (mes == 4) {
            if (dia >= 1 && dia <= 30) {
                signo = (dia <= 19) ? "Aries" : "Tauro";
            }
        } else if (mes == 5) {
            if (dia >= 1 && dia <= 31) {
                signo = (dia <= 20) ? "Tauro" : "Géminis";
            }
        } else if (mes == 6) {
            if (dia >= 1 && dia <= 30) {
                signo = (dia <= 21) ? "Géminis" : "Cáncer";
            }
        } else if (mes == 7) {
            if (dia >= 1 && dia <= 31) {
                signo = (dia <= 21) ? "Cáncer" : "Leo";
            }
        } else if (mes == 8) {
            if (dia >= 1 && dia <= 31) {
                signo = (dia <= 21) ? "Leo" : "Virgo";
            }
        } else if (mes == 9) {
            if (dia >= 1 && dia <= 30) {
                signo = (dia <= 22) ? "Virgo" : "Libra";
            }
        } else if (mes == 10) {
            if (dia >= 1 && dia <= 31) {
                signo = (dia <= 22) ? "Libra" : "Escorpio";
            }
        } else if (mes == 11) {
            if (dia >= 1 && dia <= 30) {
                signo = (dia <= 21) ? "Escorpio" : "Sagitario";
            }
        } else if (mes == 12) {
            if (dia >= 1 && dia <= 31) {
                signo = (dia <= 21) ? "Sagitario" : "Capricornio";
            }
        } else {
            System.out.println("Fecha no válida. Verifique el día y el mes ingresados.");
            return;
        }

        // Salida del signo zodiacal
        if (!signo.isEmpty()) {
            System.out.println("Su signo zodiacal es: " + signo);
        } else {
            System.out.println("Fecha no válida. Verifique el día y el mes ingresados.");
        }

        scanner.close();
    }
}
