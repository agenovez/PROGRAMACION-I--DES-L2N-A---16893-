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
// Clase base Animal
public class Animal {
    private String nombre;
    private String habitat;
    private String dieta;

    // Constructor
    public Animal(String nombre, String habitat, String dieta) {
        this.nombre = nombre;
        this.habitat = habitat;
        this.dieta = dieta;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    // Método para mostrar información básica del animal
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Hábitat: " + habitat);
        System.out.println("Dieta: " + dieta);
    }
}

// Clase derivada Mamifero
class Mamifero extends Animal {
    private int periodoGestacion;

    // Constructor
    public Mamifero(String nombre, String habitat, String dieta, int periodoGestacion) {
        super(nombre, habitat, dieta);
        this.periodoGestacion = periodoGestacion;
    }

    // Getter y Setter
    public int getPeriodoGestacion() {
        return periodoGestacion;
    }

    public void setPeriodoGestacion(int periodoGestacion) {
        this.periodoGestacion = periodoGestacion;
    }

    // Método para mostrar información del mamífero
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Período de Gestación: " + periodoGestacion + " meses");
    }
}

// Clase derivada Ave
class Ave extends Animal {
    private double envergaduraAlas;

    // Constructor
    public Ave(String nombre, String habitat, String dieta, double envergaduraAlas) {
        super(nombre, habitat, dieta);
        this.envergaduraAlas = envergaduraAlas;
    }

    // Getter y Setter
    public double getEnvergaduraAlas() {
        return envergaduraAlas;
    }

    public void setEnvergaduraAlas(double envergaduraAlas) {
        this.envergaduraAlas = envergaduraAlas;
    }

    // Método para mostrar información del ave
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Envergadura de las Alas: " + envergaduraAlas + " metros");
    }
}

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
