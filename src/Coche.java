import java.util.Random;
public class Coche {

    private String escuderia;
    private int velocidadMaxima;
    private float fiabilidad;

    public Coche(String escuderia, int velocidadMaxima) {
        Random rand=new Random();
        this.escuderia = escuderia;
        this.velocidadMaxima = velocidadMaxima;
        this.fiabilidad = rand.nextFloat(0.9F,1.1F);
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
        Random rand=new Random();
        int tramos =(kilometros/5);

        for(int i=0;i<tramos;i++){
            float probabilidadAleatoria= rand.nextFloat(0,1);
            if(probabilidadAleatoria>fiabilidad){
                return false;
            }
        }
        return true;
    }
}
