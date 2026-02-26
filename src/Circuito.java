public class Circuito {
    private String nombreCircuito;
    private double longitudCircuito;
    private Carrera[] carreras;
    private int contadorCarreras;

    public Circuito(String nombreCircuito, double longitudCircuito) {
        this.nombreCircuito = nombreCircuito;
        this.longitudCircuito = longitudCircuito;
        this.carreras=new Carrera[0];
        this.contadorCarreras=0;
    }

    public String getNombreCircuito() {
        return nombreCircuito;
    }

    public double getLongitudCircuito() {
        return longitudCircuito;
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
