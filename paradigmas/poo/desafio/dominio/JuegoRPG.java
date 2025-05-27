package paradigmas.poo.desafio.dominio;

import paradigmas.poo.desafio.salidautils.ImpresoraResumen;

public class JuegoRPG {
    private Jugador jugador;

    public JuegoRPG(Jugador jugador) {
        this.jugador = jugador;
    }

    public void evaluar(){
        int total = jugador.calcularTotal();
        Mision mejor = jugador.misionConMayorPuntaje();

        if(total>300){
            System.out.println("¡Felicidades! Sos un verdadero Chad del RPG ");
        } else {
            System.out.println("Te falta entrenamiento, joven aprendiz...");
        }

        System.out.println("Puntos acumulados : " + total);
        System.out.println("La mision que mejor rendimiento tuvo es la mision N° " + mejor.getNumero() + " con " + mejor.getPuntaje() + " puntos. ");

        if (jugador.tieneMisionFallida()){
            System.out.println("Fallaste al menos una misión. Que el backend te tenga piedad...");
        }

        if(jugador.esConstante()){
            System.out.println("¡Ejecución constante! Sos el sueño de un arquitecto de software.");
        }
    }

}
