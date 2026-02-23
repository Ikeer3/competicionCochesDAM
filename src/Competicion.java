public class Competicion {

    private String nombreCompeticion;
    private Piloto[] arraypilotos;
    private Carrera[] arrayCarreras;
    private boolean empezada;

    public Competicion(String nombre) {
        this.nombreCompeticion = nombre;
        this.arraypilotos = new Piloto[0];
        this.arrayCarreras = new Carrera[0];
        this.empezada = false;
    }

    /**
     * Añade un piloto a la lista de participantes de la competición. Lista la cual es array de pilotos
     * Imprime un mensaje informando del resultado de la operación.
     * @param pilotoNuevo Objeto Piloto por añadir.
     * @return true si se añade correctamente, false si ya existe o la competición ya empezó o .
     * (si la competicion ya empezo no se puede incluir ningun piloto// ya existe no se agregara)
     */
    public boolean anhadirPiloto(Piloto pilotoNuevo) {
        // TODO Lógica de validación e inserción


        //revision del pilot Nuevo que no exista en el array actual











        return false;
    }

    /**
     * Crea y añade una nueva carrera al calendario de la competición.
     * @param circuito El circuito donde se correrá.
     * @param vueltas Número de vueltas de la carrera.
     * @return true si se añade correctamente, false ya ha comenzado el campeonato aún
     * o ya hay otra carrera en el mismo circuito en el campeonato.
     */
    public boolean anhadirCarrera(Circuito circuito, int vueltas) {
        // TODO Lógica de validación e inserción
        return false;
    }

    /**
     * Simula todas las carreras del campeonato secuencialmente.
     * @return true si se ejecutan las carreras, false si el campeonato ya se había simulado previamente.
     */
    public boolean arrancarCampeonato(boolean empezada) {
        // TODO Bucle para ejecutarCarrera()
        while(empezada==false){

                empezada=true;
        }
        if (empezada==true){


        }
        return false;
    }

    /**
     * Calcula e imprime por consola la clasificación final de los pilotos,
     * ordenados por su puntuación total obtenida en las carreras.
     */
    public void imprimirResultado() {
        // TODO Lógica de puntuación y clasificación de pilotos

        System.out.println("");


    }

    /**
     * Calcula e imprime por consola la clasificación final a nivel de escuderías,
     * sumando los puntos de todos los pilotos de cada escudería.
     */
    public void imprimirResultadoEscudería() {
        // TODO: Lógica de extracción de equipos, suma de puntos y clasificación
    }
}
