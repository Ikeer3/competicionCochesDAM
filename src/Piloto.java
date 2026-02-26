import java.util.Random;

public class Piloto{
    private String nombrePiloto;
    private int edadPiloto;
    private double habilidad;
    private String habilidadString;
    private Coche coche;

    public Piloto(String nombre, int edad, String habilidadString, Coche coche) {
        this.nombrePiloto = nombre;
        this.edadPiloto = edad;
        this.coche=coche;

        //Relacion habilidad
        switch (habilidadString.toLowerCase()){
            case "excelente":
                this.habilidad= rand.nextDouble(0.9,1.1);
                break;
            case "bueno":
                this.habilidad=rand.nextDouble(0.8,0.9);
                break;
            case "mediocre":
                this.habilidad= rand.nextDouble(0.7,0.8);
                break;
            default:
                this.habilidad=0.6;
                break;
        }

    }

    public String getNombrePiloto() {
        return nombrePiloto;
    }

    public int getEdadPiloto() {
        return edadPiloto;
    }

    public double getHabilidad() {
        return habilidad;
    }

    public String getHabilidadString() {
        return habilidadString;
    }

    public Coche getCoche() {
        return coche;
    }

    Random rand=new Random();
    public String getNombre() {
        return nombrePiloto;
    }

    public double velocidadMedia(){
        return coche.getVelocidadMaxima()*habilidad*rand.nextDouble(0.9,1.1);
    }
}
