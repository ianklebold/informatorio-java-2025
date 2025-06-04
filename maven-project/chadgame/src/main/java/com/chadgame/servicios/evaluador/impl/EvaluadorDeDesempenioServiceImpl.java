package com.chadgame.servicios.evaluador.impl;

import com.chadgame.dominio.Jugador;
import com.chadgame.servicios.evaluador.EvaluadorDeDesempenioService;

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
    public String tieneFallos(Jugador jugador) {
        if( jugador.tieneMisionFallida() ){
            return "Si, ha fallado en una mision";
        }else{
            return "No ha fallado en ninguna mision";
        }
    }
}
