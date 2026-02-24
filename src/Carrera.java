public class Carrera {
    private String temporadaCarrera;
    private boolean yaCorrieron;
    private double vueltasCarrera;

    private Piloto[] arraypilotoPuesto;
    private Piloto[] arraypiloto;

    private Circuito circuito;

    private double[] velocidades;



    public Carrera(String temporadaCarrera, boolean yaCorrieron, Circuito tipoCircuito, double vueltasCarrera) {
        this.temporadaCarrera = temporadaCarrera;
        this.yaCorrieron = yaCorrieron;
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

    public double LongitudTotalHecho(){
        double longitudCir = circuito.getLongitudCircuito();
        return longitudCir * vueltasCarrera;
    }
    public boolean ejecutarCarrera(){
        if(yaCorrieron){
            System.out.println("Ya se ha corrido este circuito");
            return false;
        }
        System.out.println("LA CARRERA EMPIEZA: ");
        System.out.print(""+circuito.getNombreCircuito()+"");


        return true;
    }
}