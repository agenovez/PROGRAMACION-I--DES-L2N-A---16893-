/*Título de la Tarea: Sistema de Clasificación de Animales

Objetivos:

Aplicar el concepto de encapsulamiento para asegurar la integridad de la información de los animales.
Implementar herencia para crear diferentes tipos de animales con características comunes y específicas.
Descripción:

Desarrolla un sistema de clasificación de animales usando Java. El sistema debe incluir las siguientes características:

Clase Base Animal:

Atributos privados: nombre, hábitat, dieta.
Métodos públicos: constructores, getters y setters para cada atributo, y un método para mostrar la información básica del animal.

Clase Derivada Mamifero:

-> Hereda de Animal.

Atributo privado adicional: periodoGestacion.
Métodos públicos: constructores, getters y setters para el nuevo atributo, y un método para mostrar la información específica del mamífero.

Clase Derivada Ave:

-> Hereda de Animal.

Atributo privado adicional: envergaduraAlas.

Métodos públicos: constructores, getters y setters para el nuevo atributo, y un método para mostrar la información específica del ave.

Clase Principal Zoologico:

- Crea varios objetos de Mamifero y Ave, asignándolos a variables individuales.
- Muestra la información de cada animal utilizando los métodos de las clases.

Instrucciones:

- Asegurese de que todos los atributos en las clases sean privados para demostrar el encapsulamiento.
- Usa herencia para evitar la duplicación de código entre Mamifero y Ave.
- En la clase principal, muestra cómo se crean y se manejan los objetos de cada tipo de animal.

*
*
*/
// Clase principal Zoologico
public class Zoologico {
    public static void main(String[] args) {
        System.out.println("Sistema de Clasificación de Animales");

        // Crear y mostrar un mamífero
        Mamifero leon = new Mamifero("León", "Sabana", "Carnívoro", 3);
        System.out.println("\nInformación del Mamífero:");
        leon.mostrarInformacion();

        // Crear y mostrar un ave
        Ave aguila = new Ave("Águila", "Montañas", "Carnívoro", 2.3);
        System.out.println("\nInformación del Ave:");
        aguila.mostrarInformacion();
    }
}
