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
