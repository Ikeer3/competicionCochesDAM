public class Carrera {
    private String temporadaCarrera;
    private boolean yaCorrieron;
    private double vueltasCarrera;

    private Piloto[] arraypilotoPuesto;
    private Piloto[] arraypiloto;

    private Circuito circuito;

    public Circuito getCircuito() {
        return circuito;
    }

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

        for(int i = 0; i < arraypiloto.length; i++){

            Piloto piloto = arraypiloto[i];

            double velocidad = piloto.velocidadMedia();
            double kmTotales = LongitudTotalHecho();

            if(!piloto.getCoche().acabaCarrera((int)kmTotales)){

                velocidad = 0;

                System.out.println(piloto.getNombre() + " ha abandonado");
            }

            else{
                System.out.println(piloto.getNombre() + " velocidad media " + velocidad);

            }


            velocidades[i] = velocidad;

            arraypilotoPuesto[i] = piloto;

        }

        return true;
    }
}