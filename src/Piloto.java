import java.util.Random;

public class Piloto{
    private String nombrePiloto;
    private int edadPiloto;
    private double habilidad;
    private String habilidadString;

    public Piloto(String nombre, int edad, String habilidadString) {
        this.nombrePiloto = nombre;
        this.edadPiloto = edad;
        this.habilidadString = habilidadString;
    }

    Random rand=new Random();
    public String getNombre() {
        return nombrePiloto;
    }

    public double velocidadMedia(){
        return 0;
    }
}
