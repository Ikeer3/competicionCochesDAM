public class Simulador {
    public static void main(String[] args) {


    //Coches
    Coche A1=new Coche("Aston Martin",317,0.5);
    Coche A2=new Coche("Aston Martin",315,0.5);
    Coche Rb1=new Coche("Red Bull",327,0.8);
    Coche Rb2=new Coche("Red bull",329,0.8);
    Coche F1=new Coche("Ferrari",323,0.7);
    Coche F2=new Coche("Ferrari",325,0.7);


    //Pilotos
    Piloto p1=new Piloto("Fernando Alonso", 44, "Excelente", A1);
    Piloto p2=new Piloto("Lance Stroll", 27, "Mediocre", A2);
    Piloto p3=new Piloto("Yuki Tsunoda", 25, "Mediocre", Rb1);
    Piloto p4=new Piloto("Max Verstappen", 28, "Excelente", Rb2);
    Piloto p5=new Piloto("Charles Leclerc", 28, "Bueno", F1);
    Piloto p6=new Piloto("Lewis Hamilton", 41, "Excelente", F2);


    //Circuitos

    Circuito Spa=new Circuito("Spa-Francorchamps", 7004);
    Circuito Baku=new Circuito("Callejero de Baku", 6003);
    Circuito Silverstone=new Circuito("Silverstone", 5891);
    Circuito Suzuka=new Circuito("Suzuka", 5807);


    //Competicion1

    Competicion formulaUno2025 =new Competicion("Formula 1");

    //Carreras

    formulaUno2025.anhadirCarrera(Silverstone, 52);
    formulaUno2025.anhadirCarrera(Spa, 44);
    formulaUno2025.anhadirCarrera(Suzuka, 53);

    //Pilotos

        formulaUno2025.anhadirPiloto(p1);
        formulaUno2025.anhadirPiloto(p2);
        formulaUno2025.anhadirPiloto(p3);
        formulaUno2025.anhadirPiloto(p4);
        formulaUno2025.anhadirPiloto(p5);
        formulaUno2025.anhadirPiloto(p6);

    //Arrancar campeonato

        formulaUno2025.arrancarCampeonato(false);

    //Imprimir clasificacion final

        formulaUno2025.imprimirResultado();
        formulaUno2025.imprimirResultadoEscuderia();

    //Competicion2

        Competicion formulaUno2024 =new Competicion("Formula 2");

    //Carreras

        formulaUno2024.anhadirCarrera(Baku, 51);
        formulaUno2024.anhadirCarrera(Spa, 44);
        formulaUno2024.anhadirCarrera(Silverstone, 52);

    //Pilotos

        formulaUno2024.anhadirPiloto(p1);
        formulaUno2024.anhadirPiloto(p2);
        formulaUno2024.anhadirPiloto(p3);
        formulaUno2024.anhadirPiloto(p4);
        formulaUno2024.anhadirPiloto(p5);
        formulaUno2024.anhadirPiloto(p6);

    //Arrancar campeonato

        formulaUno2024.arrancarCampeonato(false);

    //Imprimir clasificacion final

        formulaUno2024.imprimirResultado();
        formulaUno2024.imprimirResultadoEscuderia();


    }
}
