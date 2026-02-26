public class Competicion {

    private String nombreCompeticion;
    private Piloto[] arraypilotos;
    private Carrera[] arrayCarreras;
    private boolean empezarCarrera;

    public Competicion(String nombre) {
        this.nombreCompeticion = nombre;
        this.arraypilotos = new Piloto[0];
        this.arrayCarreras = new Carrera[0];
        this.empezarCarrera = false;
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
        //PASOS QUE SIGUE EL CODIGO: (empezarCarrera)
        /*
        1.- PRIMERO COMPROBAMOS QUE NO HAYA EMPEAZADO LA CARRERA SI LA CARRERA COMENZO ENTONCES RETURN FALSE
         */

        //SI NO HAY CARRERA ENTONCES CONTINUA

        //PASOS QUE SIGUE EL CODIGO: (pilotoNuevo)
        /*
        1.- PRIMERO COMPRUEBA QUE "PILOTONUEVO" NO EXISTA EN EL ARRAYORIGINAL
        2.- SEGUNDO ARRAYCOPION (como su nombre lo dice)  COPIA LOS DATOS DEL ARRAYORIGINAL, EN LAS MISMAS POSICIONES
        3.- TERCERO ARRAYCOPION AGREGA EN LA ULTIMA POSICION ,AGREGA AL PILOTONUEVO
         */
            if (empezarCarrera ==true){
                System.out.println("Carrera ya ha comenzado (No se puede inscribir piloto)");
                return false;
            }else {

                //PASOS DE pilotoNuevo:
                //PASO 1 (verificacion de pilotoNuevo)
                for (int i = 0; i < arraypilotos.length; i++) {
                    if (arraypilotos[i] == pilotoNuevo) {
                        System.out.println("Piloto ya existente ");
                        return false;
                    }
                }
                //PASO 2 (creacion de arrayCopion)
                Piloto[] arrayCopion = new Piloto[arraypilotos.length + 1];
                //arrayCopion copia los datos del arrayOriginal
                for (int i = 0; i < arraypilotos.length; i++) {
                    arrayCopion[i] = arraypilotos[i];
                }
                //PASO 3 (datos de pilotoNuevo son agregados a la ultima posicion del arrayOriginal
                arrayCopion[arraypilotos.length] = pilotoNuevo;
                return true;

            }
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
        // Comprobar si el campeonato ya ha empezado
        if (empezarCarrera) {
            System.out.println("No se ha podido añadir la carrera en " + circuito.getNombreCircuito() +
                    ". La competición " + nombreCompeticion + " ya ha empezado!!");
            return false;
        }

        // Comprobar si ya existe una carrera en el mismo circuito
        for (Carrera carrera:arrayCarreras) {
            if (carrera.getCircuito()==circuito) {
                System.out.println("No se ha podido añadir la carrera. Ya hay una programada en el circuito "
                        + circuito.getNombreCircuito());
                return false;
            }
        }
        return false;
    }

    /**
     * Simula todas las carreras del campeonato secuencialmente.
     * @return true si se ejecutan las carreras, false si el campeonato ya se había simulado previamente.
     */
    public boolean arrancarCampeonato(boolean empezada) {
        // TODO Bucle para ejecutarCarrera()

        if (empezarCarrera==true){
            return false;
        }else {
            for (int i = 0; i <arrayCarreras.length ; i++) {
                Carrera carreraActual=arrayCarreras[i];
                carreraActual.ejecutarCarrera();
            }
            empezarCarrera=true;
            return true;
        }
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
