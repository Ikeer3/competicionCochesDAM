public class Coche {

    private String escuderia;
    private double velocidadMaxima;
    private double fiabilidad;

    public Coche(String escuderia, double velocidadMaxima, double fiabilidad) {
        this.escuderia = escuderia;
        this.velocidadMaxima = velocidadMaxima;
        this.fiabilidad = fiabilidad;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    /**
     * Calcula si el coche se rompe basado en la distancia
     * @param kilometros número entero
     * @return si el coche se ha roto
     */
    public boolean acabaCarrera(int kilometros) {
        // TODO Implementar lógica de probablilidad
        return true;
    }
}
