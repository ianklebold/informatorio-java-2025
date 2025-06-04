package com.chadgame.servicios.evaluador;


import com.chadgame.dominio.Jugador;

//Es un contrato
public interface EvaluadorDeDesempenioService{
    //Firmas
    String evaluar(Jugador jugador);  //Firma
    String mensajeDeConstancia(Jugador jugador); //Firma
    boolean tieneFallos(Jugador jugador); //Firma
}