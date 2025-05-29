package paradigmas.poo.desafiov2.servicios.evaluador.impl;

import paradigmas.poo.desafiov2.dominio.Jugador;
import paradigmas.poo.desafiov2.servicios.evaluador.EvaluadorDeDesempenioService;

public class EvaluadorDeDesempenioServiceImplV2 implements EvaluadorDeDesempenioService {

    public EvaluadorDeDesempenioServiceImplV2() {
    }

    @Override
    public String evaluar(Jugador jugador) {
        return "";
    }

    @Override
    public String mensajeDeConstancia(Jugador jugador) {
        return "";
    }

    @Override
    public boolean tieneFallos(Jugador jugador) {
        return false;
    }
}
