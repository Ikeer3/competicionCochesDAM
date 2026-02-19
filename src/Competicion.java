public class Competicion {

    private String nombreCompeticion;
    private Piloto[] pilotos;
    private int contadorPilotos;
    private Carrera[] carreras;
    private int contadorCarreras;
    private boolean empezada;

    public Competicion(String nombre, int contadorPilotos, int contadorCarreras, boolean empezada) {
        this.nombreCompeticion = nombre;
        this.pilotos = pilotos;
        this.contadorPilotos = contadorPilotos;
        this.carreras = carreras;
        this.contadorCarreras = contadorCarreras;
        this.empezada = empezada;
    }

    /**
     *
     * @param piloto
     * @return
     */
    public boolean anhadirPiloto(Piloto piloto) {
        // TODO Lógica de validación e inserción
        return false;
    }

    /**
     *
     * @param circuito
     * @param vueltas
     * @return
     */
    public boolean anhadirCarrera(Circuito circuito, int vueltas) {
        // TODO
        return false;
    }

    /**
     *
     * @return
     */
    public boolean arrancarCampeonato() {
        // TODO
        return false;
    }

    /**
     * Calcula e imprime por consola la clasificación final de los pilotos,
     * ordenados por su puntuación total obtenida en las carreras.
     */
    public void imprimirResultado() {
        // TODO Lógica de puntuación y ordenación de pilotos
    }

    /**
     * Calcula e imprime por consola la clasificación final a nivel de escuderías,
     * sumando los puntos de todos los pilotos de cada escudería.
     */
    public void imprimirResultadoEscudería() {
        // TODO: Lógica de extracción de equipos, suma de puntos y ordenación
    }
}



