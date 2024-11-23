TAREAS DE PROGRAMACION I

Estan cada nombre con el enunciado, para poder ejecutar es necesiario cambiar el nombre como corresponde con el nombre del metodo.
por ejemplo:

└─$ head 1.16.java   
//1.16. Calcular el salario neto de un trabajador de una empresa cuyo trabajo se paga por horas. Introducir por teclado el número de horas y el precio de Ia hora. El cálculo se realiza del siguiente modo: 
//Las primeras 35 horas de cada semana se pagan a la tarifa normal (suponer 4 semanas al mes).
//Las horas extras se pagan un 50% más que las normales.
//Los impuestos a deducir a los trabajadores varían en función su sueldo mensual (considerando las horas extras trabajadas): 
//Si el sueldo es menor de USD 600 está libre de impuestos. 
//Si el sueldo está entre USD  600 y USD 1000, se cobra el 20% de impuestos.
//Si el sueldo es mayor de USD 1000 se cobra el 30% de impuestos. 
import java.util.Scanner;

public class CalcularSalarioNeto {

el nombre del archivo cambia a CalcularSalioNeto.java

luego se compila con javac

$javac CalcularSalarioNeto.java

y se ejecuta con java

$java CalcularSalarioNeto

└─$ java CalcularSalarioNeto      
Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
Ingrese el número de horas trabajadas en el mes: 200
Ingrese el precio por hora trabajada: 16
Sueldo bruto: USD 3680.00
Impuestos: USD 1104.00
Sueldo neto: USD 2576.00
                                                                                                                                                                                                                                           


