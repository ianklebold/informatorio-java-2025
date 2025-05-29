package paradigmas.poo.desafiov2.servicios.evaluador.impl;

import paradigmas.poo.desafiov2.dominio.Jugador;
import paradigmas.poo.desafiov2.servicios.evaluador.EvaluadorDeDesempenioService;

public class EvaluadorDeDesempenioServiceImpl implements EvaluadorDeDesempenioService {

    public EvaluadorDeDesempenioServiceImpl() {}

    @Override
    public String evaluar(Jugador jugador) {
        int total = jugador.calcularTotal();

        if(total>300){
            return "¡Felicidades! Sos un verdadero Chad del RPG ";
        } else {
            return "Te falta entrenamiento, joven aprendiz...";
        }

    }

    @Override
    public String mensajeDeConstancia(Jugador jugador) {
        if(jugador.esConstante()){
            return "¡Ejecución constante! Sos el sueño de un arquitecto de software.";
        }
        return "";
    }

    @Override
    public boolean tieneFallos(Jugador jugador) {
        return jugador.tieneMisionFallida();
    }
}
