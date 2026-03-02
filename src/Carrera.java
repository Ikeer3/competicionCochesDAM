public class Carrera {
    private String temporadaCarrera;
    private boolean yaCorrieron;
    private double vueltasCarrera;
    private Piloto[] arrayPilotoPuesto;
    private Piloto[] arrayPiloto;
    private Circuito circuito;
    private double[] velocidades;

    public Carrera(String temporadaCarrera, boolean yaCorrieron, Circuito circuito, double vueltasCarrera, Piloto[] pilotos) {
        this.temporadaCarrera = temporadaCarrera;
        this.circuito = circuito;
        this.yaCorrieron = yaCorrieron;
        this.vueltasCarrera = vueltasCarrera;
        this.velocidades = new double[pilotos.length];
        this.arrayPilotoPuesto = new Piloto[pilotos.length];
        this.arrayPiloto = pilotos;
    }

    public Circuito getCircuito() {
        return circuito;
    }

    public Piloto[] getArrayPilotoPuesto() {
        return arrayPilotoPuesto;
    }

    public double LongitudTotalHecho() {
        double longitudCir = circuito.getLongitudCircuito();
        return longitudCir * vueltasCarrera;
    }

    public boolean ejecutarCarrera() {
        if (yaCorrieron) {
            System.out.println("Ya se ha corrido este circuito");
            return false;
        }

        velocidades = new double[arrayPiloto.length];
        arrayPilotoPuesto = new Piloto[arrayPiloto.length];

        System.out.println("\n=========================================");
        System.out.println("🏆 GRAN PREMIO DE LA TEMPORADA: " + this.temporadaCarrera.toUpperCase());
        System.out.println("📍 CIRCUITO: " + circuito.getNombreCircuito());
        System.out.println("🔄 DISTANCIA: Carrera a " + (int)this.vueltasCarrera + " vueltas");
        System.out.println("=========================================\n");
        System.out.println("LA CARRERA EMPIEZA... ¡SEMÁFORO EN VERDE!");

        for (int i = 0; i < arrayPiloto.length; i++) {
            Piloto piloto = arrayPiloto[i];
            double velocidad = piloto.velocidadMedia();

            if (!piloto.getCoche().acabaCarrera((int) LongitudTotalHecho())) {
                velocidad = 0;
                System.out.println(piloto.getNombrePiloto() + " ha abandonado");
            } else {
                System.out.printf(piloto.getNombrePiloto() + " --- Velocidad media: %.2f\n", velocidad);
            }
            velocidades[i] = velocidad;
            arrayPilotoPuesto[i] = piloto;
        }
        ordenarPilotos();
        yaCorrieron = true;
        return true;
    }

    private void ordenarPilotos() {
        for (int i = 1; i < velocidades.length; i++) {
            double velocidadActual = velocidades[i];
            Piloto pilotoActual = arrayPilotoPuesto[i];
            int j = i - 1;

            while (j >= 0 && velocidades[j] < velocidadActual) {
                velocidades[j + 1] = velocidades[j];
                arrayPilotoPuesto[j + 1] = arrayPilotoPuesto[j];
                j--;
            }
            velocidades[j + 1] = velocidadActual;
            arrayPilotoPuesto[j + 1] = pilotoActual;
        }
    }

    public boolean anhadirPiloto(Piloto pilotoNuevo) {
        for (int i = 0; i < arrayPiloto.length; i++) {
            if (arrayPiloto[i] == pilotoNuevo) {
                System.out.println("Piloto ya existente ");
                return false;
            }
        }
        Piloto[] arrayCopion = new Piloto[arrayPiloto.length + 1];

        for (int i = 0; i < arrayPiloto.length; i++) {
            arrayCopion[i] = arrayPiloto[i];
        }
        arrayCopion[arrayPiloto.length] = pilotoNuevo;
        arrayPiloto = arrayCopion;
        return true;
    }
}