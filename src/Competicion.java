public class Competicion {

    private String nombreCompeticion;
    private Piloto[] pilotos;
    private int contadorPilotos;
    private Carrera[] carreras;
    private int contadorCarreras;
    private boolean empezada;

    public Competicion(String nombre, int maxPilotos, int maxCarreras) {
        this.nombreCompeticion = nombre;
        this.pilotos = new Piloto[maxPilotos];
        this.carreras = new Carrera[maxCarreras];
        this.contadorPilotos = 0;
        this.contadorCarreras = 0;
        this.empezada = false;
    }

    /**
     * Añade un piloto a la lista de participantes de la competición.
     * Imprime un mensaje informando del resultado de la operación.
     * @param piloto Objeto Piloto a añadir.
     * @return true si se añade correctamente, false si ya existe o la competición ya empezó.
     */
    public boolean anhadirPiloto(Piloto piloto) {
        // TODO Lógica de validación e inserción
        return false;
    }

    /**
     * Crea y añade una nueva carrera al calendario de la competición.
     * @param circuito El circuito donde se correrá.
     * @param vueltas Número de vueltas de la carrera.
     * @return true si se añade correctamente, false si el circuito ya está programado o la competición ya empezó.
     */
    public boolean anhadirCarrera(Circuito circuito, int vueltas) {
        // TODO Lógica de validación e inserción
        return false;
    }

    /**
     * Simula todas las carreras del campeonato secuencialmente.
     * @return true si se ejecutan las carreras, false si el campeonato ya se había simulado previamente.
     */
    public boolean arrancarCampeonato() {
        // TODO Bucle para ejecutarCarrera()
        return false;
    }

    /**
     * Calcula e imprime por consola la clasificación final de los pilotos,
     * ordenados por su puntuación total obtenida en las carreras.
     */
    public void imprimirResultado() {
        // TODO Lógica de puntuación y clasificación de pilotos
    }

    /**
     * Calcula e imprime por consola la clasificación final a nivel de escuderías,
     * sumando los puntos de todos los pilotos de cada escudería.
     */
    public void imprimirResultadoEscudería() {
        // TODO: Lógica de extracción de equipos, suma de puntos y clasificación
    }
}
