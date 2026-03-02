public class Competicion {

    private String nombreCompeticion;
    private Piloto[] arrayPilotos;
    private Carrera[] arrayCarreras;
    private boolean empezarCarrera;

    public Competicion(String nombre) {
        this.nombreCompeticion = nombre;
        this.arrayPilotos = new Piloto[0];
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
            if (empezarCarrera == true){
                System.out.println("\nCarrera ya ha comenzado (No se puede inscribir piloto)");
                return false;
            } else {

                //PASOS DE pilotoNuevo:
                //PASO 1 (verificacion de pilotoNuevo)
                for (int i = 0; i < arrayPilotos.length; i++) {
                    if (arrayPilotos[i] == pilotoNuevo) {
                        System.out.println("Piloto ya existente ");
                        return false;
                    }
                }
                //PASO 2 (creacion de arrayCopion)
                Piloto[] arrayCopion = new Piloto[arrayPilotos.length + 1];
                //arrayCopion copia los datos del arrayOriginal
                for (int i = 0; i < arrayPilotos.length; i++) {
                    arrayCopion[i] = arrayPilotos[i];
                }
                //PASO 3 (datos de pilotoNuevo son agregados a la ultima posicion del arrayOriginal del campeonato
                arrayCopion[arrayPilotos.length] = pilotoNuevo;
                arrayPilotos = arrayCopion;

                for (Carrera c: arrayCarreras) {
                    c.anhadirPiloto(pilotoNuevo);
                }

                System.out.print("\nPiloto: " + pilotoNuevo.getNombrePiloto() + " ha sido añadido al Campeonato y a la Carrera correctamente");
                return true;
            }//si es emoji lo coloque yo no una IA (Carlos Raul)

    }

    /**
     * Crea y añade una nueva carrera al calendario de la competición.
     * @param circuito El circuito donde se correrá.
     * @param vueltas Número de vueltas de la carrera.
     * @return true si se añade correctamente, false ya ha comenzado el campeonato aún
     * o ya hay otra carrera en el mismo circuito en el campeonato.
     */
    public boolean anhadirCarrera(Circuito circuito, int vueltas) {
        // Comprobar si el campeonato ya ha empezado
        if (empezarCarrera) {
            System.out.println("No se ha podido añadir la carrera en " + circuito.getNombreCircuito() +
                    ". La competición " + nombreCompeticion + " ya ha empezado!!");
            return false;
        }

        // Comprobar si ya existe una carrera en el mismo circuito
        for (Carrera carrera:arrayCarreras) {
            if (carrera.getCircuito()==circuito) {
                System.out.print("\nNo se ha podido añadir la carrera. Ya hay una programada en el circuito "
                        + circuito.getNombreCircuito());
                return false;
            }
        }

        // Creamos la carrera (con los pilotos que haya en ese momento)
        Carrera nuevaCarrera = new Carrera(nombreCompeticion, false, circuito, vueltas, arrayPilotos);

        Carrera[] nuevo = new Carrera[arrayCarreras.length + 1];
        for (int i = 0; i < arrayCarreras.length; i++) {
            nuevo[i] = arrayCarreras[i];
        }
        nuevo[nuevo.length - 1] = nuevaCarrera;
        arrayCarreras = nuevo;

        // Registramos la carrera en el circuito
        circuito.anhadirCarreraCircuito(nuevaCarrera);
        System.out.print("\nCarrera: " + circuito.getNombreCircuito() + " ha sido añadida correctamente");

        return true;
    }

    /**
     * Simula todas las carreras del campeonato secuencialmente.
     * @return true si se ejecutan las carreras, false si el campeonato ya se había simulado previamente.
     */
    public boolean arrancarCampeonato(boolean empezada) {
        if (empezarCarrera==true){
            return false;
        } else {
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
        if(empezarCarrera) {
            int[] arrayPuntos = new int[arrayPilotos.length];

            for (int i = 0; i < arrayCarreras.length; i++) {
                calculoResultadoPuntos(arrayCarreras[i],arrayPuntos);
            }
            System.out.println("\n==================================================");
            System.out.println(" 🏆 CLASIFICACIÓN FINAL DE PILOTOS: " + nombreCompeticion.toUpperCase() + " 🏆");
            System.out.println("==================================================");
            for (int i = 0; i < arrayPilotos.length; i++) {
                System.out.println((i+1)+"º LUGAR CON: "+arrayPuntos[i]+" PUNTOS EL PILOTO: "+arrayPilotos[i].getNombrePiloto()
                        + " (" + arrayPilotos[i].getEdadPiloto() + " años, Habilidad: " + arrayPilotos[i].getHabilidadString() + ")");
            }
        } else {
            System.out.println("La Competicion aun no finaliza");
        }
    }

    private void calculoResultadoPuntos(Carrera c, int[] puntos ) {
        Piloto primerLugar = c.getArrayPilotoPuesto()[0];
        Piloto segundoLugar = c.getArrayPilotoPuesto()[1];
        Piloto tercerLugar = c.getArrayPilotoPuesto()[2];

        for (int i = 0; i < arrayPilotos.length; i++) {
            if (arrayPilotos[i] == primerLugar) {
                puntos[i] = puntos[i] + 10;
            } else if (arrayPilotos[i] == segundoLugar) {
                puntos[i] = puntos[i] + 8;
            } else if (arrayPilotos[i] == tercerLugar) {
                puntos[i] = puntos[i] + 5;
            }
        }

        // Algoritmo Burbuja
        for (int i = 0; i < arrayPilotos.length - 1; i++) {
            for (int j = 0; j < arrayPilotos.length - 1 - i; j++) {
                if (puntos[j] < puntos[j + 1]) {
                    // Intercambio
                    int mediador = puntos[j];
                    puntos[j] = puntos[j + 1];
                    puntos[j + 1] = mediador;

                    //Intercambiar el array de Pilotos junto al de puntos ya que son paralelos

                    Piloto mediadorPilotos = arrayPilotos[j];
                    arrayPilotos[j] = arrayPilotos[j + 1];
                    arrayPilotos[j + 1] = mediadorPilotos;
                }
            }
        }
    }

    /**
     * Calcula e imprime por consola la clasificación final a nivel de escuderías,
     * sumando los puntos de todos los pilotos de cada escudería.
     */
    public void imprimirResultadoEscuderia() {
        String[] escuderias = new String[0];
        int[] puntosEscuderias = new int[arrayPilotos.length];

        // Rellenamos el array de escuderias
        for (Piloto piloto:arrayPilotos) {
            String nombreEscuderia = piloto.getCoche().getEscuderia();
            boolean existe = false;

            for (String escuderiaGuardada:escuderias) {
                if (escuderiaGuardada.equalsIgnoreCase(nombreEscuderia)) {
                    existe = true;
                    break;
                }
            }

            if (!existe) {
                String[] temp = new String[escuderias.length + 1];
                for (int i = 0; i < escuderias.length; i++) {
                    temp[i] = escuderias[i];
                }
                temp[temp.length - 1] = nombreEscuderia;
                escuderias = temp;
            }
        }

        // Repartir los puntos de cada carrera
        for (Carrera carrera:arrayCarreras) {
            Piloto primerLugar = carrera.getArrayPilotoPuesto()[0];
            Piloto segundoLugar = carrera.getArrayPilotoPuesto()[1];
            Piloto tercerLugar = carrera.getArrayPilotoPuesto()[2];

            int indiceEscuderia1 = 0;
            int indiceEscuderia2 = 0;
            int indiceEscuderia3 = 0;

            // Generamos el bucle sobre el array de escuderías para encontrar qué índice tiene cada una
            for (int i = 0; i < escuderias.length; i++) {
                if (escuderias[i].equalsIgnoreCase(primerLugar.getCoche().getEscuderia())) {
                    indiceEscuderia1 = i;
                } else if (escuderias[i].equalsIgnoreCase(segundoLugar.getCoche().getEscuderia())) {
                    indiceEscuderia2 = i;
                } else if (escuderias[i].equalsIgnoreCase(tercerLugar.getCoche().getEscuderia())) {
                    indiceEscuderia3 = i;
                }
            }

            // Sumamos los puntos usando los índices que acabamos de encontrar
            puntosEscuderias[indiceEscuderia1] = puntosEscuderias[indiceEscuderia1] + 10;
            puntosEscuderias[indiceEscuderia2] = puntosEscuderias[indiceEscuderia2] + 8;
            puntosEscuderias[indiceEscuderia3] = puntosEscuderias[indiceEscuderia3] + 5;
        }

        // Ordenamos los arrays con el metodo Burbuja de mayor a menor
        for (int i = 0; i < escuderias.length - 1; i++) {
            for (int j = 0; j < escuderias.length - 1 - i; j++) {
                // Si el de la derecha tiene más puntos que el de la izquierda, los intercambiamos
                if (puntosEscuderias[j] < puntosEscuderias[j + 1]) {

                    // Intercambiamos los puntos
                    int puntosTemp = puntosEscuderias[j];
                    puntosEscuderias[j] = puntosEscuderias[j + 1];
                    puntosEscuderias[j + 1] = puntosTemp;

                    // Intercambiamos los nombres de las escuderías a la vez
                    String escuderiaTemp = escuderias[j];
                    escuderias[j] = escuderias[j + 1];
                    escuderias[j + 1] = escuderiaTemp;
                }
            }
        }

        System.out.println("\n=========================================================");
        System.out.println(" 🏎️ CLASIFICACIÓN FINAL POR ESCUDERÍAS: " + nombreCompeticion.toUpperCase() + " 🏎️");
        System.out.println("=========================================================");

        for (int i = 0; i < escuderias.length; i++) {
            System.out.println((i + 1) + ".- " + escuderias[i] + " con " + puntosEscuderias[i] + " puntos.");
        }
    }
}
