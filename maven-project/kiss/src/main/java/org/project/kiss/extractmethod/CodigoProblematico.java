package org.project.kiss.extractmethod;

import com.chadgame.dominio.Jugador;
import com.chadgame.dominio.Mision;
import com.chadgame.servicios.evaluador.EvaluadorDeDesempenioService;
import com.chadgame.servicios.evaluador.impl.EvaluadorDeDesempenioServiceImpl;
import org.project.kiss.constants.MisionsConstants;

import java.util.List;

public class CodigoProblematico {
    public static void main(String[] args) {

        Jugador jugador = new Jugador(MisionsConstants.misions);

        mostrarResumenJugador(jugador);
    }

    public static void mostrarResumenJugador(Jugador jugador) {
        EvaluadorDeDesempenioService evaluadorDeDesempenioService = new EvaluadorDeDesempenioServiceImpl();

        System.out.println("Evaluar: " + evaluadorDeDesempenioService.evaluar(jugador));
        System.out.println("Constancia: " + evaluadorDeDesempenioService.mensajeDeConstancia(jugador));
        System.out.println("Fallos: " + evaluadorDeDesempenioService.tieneFallos(jugador));

        if (getPuntajeFinal( jugador.getMisiones() ) > 300) {
            System.out.println("Ganador absoluto");
        }
        System.out.println("====================");

    }

    private static int getPuntajeFinal(List<Mision> misiones){
        int puntaje = 0;
        for (Mision mision : misiones) {
            puntaje += mision.getPuntaje();
        }
        return puntaje;
    }



}
