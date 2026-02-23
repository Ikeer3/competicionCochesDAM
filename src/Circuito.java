public class Circuito {
    private String NombreCircuito;
    private double LongitudCircuito;
    private Carrera[] carreras;
    private int contadorCarreras;

    public Circuito(String nombreCircuito, double longitudCircuito) {
        this.NombreCircuito = nombreCircuito;
        this.LongitudCircuito = longitudCircuito;
        this.carreras=new Carrera[0];
        this.contadorCarreras=0;
    }

    public String getNombreCircuito() {
        return NombreCircuito;
    }

    public double getLongitudCircuito() {
        return LongitudCircuito;
    }

    public int getContadorCarreras() {
        return contadorCarreras;
    }

    public void anhadirCarreraCircuito(Carrera carrera) {
        //Creamos array con una posicion mas que el anterior
        Carrera[] nuevoArray=new Carrera[this.carreras.length+1];
        //Copiamos carreras del array antiguo al nuevo
        for(int i=0;i<carreras.length;i++){
            nuevoArray[i]=this.carreras[i];
        }
        //Añadimos la nueva carrera en la ultima posicion del array
        nuevoArray[nuevoArray.length-1]=carrera;
        //Sustituir array viejo por nuevo
        this.carreras=nuevoArray;
        this.contadorCarreras++;
    }

    public int obtenerCarrerasTotalesCircuito() {

        return this.contadorCarreras;
    }
}
