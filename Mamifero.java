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
