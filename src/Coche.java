import java.util.Random;
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

    public String getEscuderia() {
        return escuderia;
    }

    /**
     * Calcula si el coche se rompe basado en la distancia
     * @param kilometros número entero
     * @return si el coche se ha roto
     */
    public boolean acabaCarrera(int kilometros) {
        // TODO Implementar lógica de probablilidad
        Random rand=new Random();
        int tramos =(kilometros/5);

        for(int i=0;i<tramos;i++){
            double probabilidadAleatoria= rand.nextDouble();
            if(probabilidadAleatoria>fiabilidad){
                return false;
            }
        }
        return true;
    }
}
