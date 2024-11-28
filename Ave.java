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
