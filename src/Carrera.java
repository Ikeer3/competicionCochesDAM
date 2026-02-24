public class Carrera {
    private String temporadaCarrera;
    private boolean yaCorrieron;
    private Circuito tipoCircuito;
    private double vueltasCarrera;
    private Piloto[] arraypilotoPuesto;
    private Piloto[] arraypiloto;
    private Circuito circuito;
    private boolean carreraTerminada;



    public Carrera(String temporadaCarrera, boolean yaCorrieron, Circuito tipoCircuito, double vueltasCarrera) {
        this.temporadaCarrera = temporadaCarrera;
        this.yaCorrieron = yaCorrieron;
        this.tipoCircuito = tipoCircuito;
        this.vueltasCarrera = vueltasCarrera;
        this.arraypilotoPuesto =  new Piloto[0];
        this.arraypiloto = new Piloto[0];
    }

    public String getTemporadaCarrera() {
        return temporadaCarrera;
    }

    public double getVueltasCarrera() {
        return vueltasCarrera;
    }

    public boolean getYaCorrieron() {
        return yaCorrieron;
    }

    public Circuito getTipoCircuito() {
        return tipoCircuito;
    }

    public double LongitudTotalHecho(){
        double longitudCir = circuito.getLongitudCircuito();

        return longitudCir * vueltasCarrera;
    }
    public boolean ejecutarCarrera(){
        return false;
    }
}