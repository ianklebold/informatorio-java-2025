package org.project.kiss.extractmethod;

import com.chadgame.dominio.Jugador;
import com.chadgame.dominio.Mision;
import com.chadgame.servicios.evaluador.EvaluadorDeDesempenioService;
import com.chadgame.servicios.evaluador.impl.EvaluadorDeDesempenioServiceImpl;
import org.project.kiss.constants.MisionsConstants;

import java.util.List;

public class CodigoResuelto {
    public static void main(String[] args) {
        Jugador jugador = new Jugador(MisionsConstants.misions);
        imprimirDatos(jugador);
        mostrarEstado(jugador);
        mostrarSeparador();
    }

    private static void imprimirDatos(Jugador jugador) {
        //Esto no se debe hacer, deberia declararse como variable de instancia
        //No como variable de metodo. Esto se hace porque es solo un ejemplo.
        EvaluadorDeDesempenioService evaluadorDeDesempenioService = new EvaluadorDeDesempenioServiceImpl();

        System.out.println("Evaluar: " + evaluadorDeDesempenioService.evaluar(jugador));
        System.out.println("Constancia: " + evaluadorDeDesempenioService.mensajeDeConstancia(jugador));
        System.out.println("Fallos: " + evaluadorDeDesempenioService.tieneFallos(jugador));
    }

    private static void mostrarEstado(Jugador jugador) {
        if (getPuntajeFinal( jugador.getMisiones() ) > 300) {
            System.out.println("Ganador absoluto");
        }
    }

    private static int getPuntajeFinal(List<Mision> misiones){
        int puntaje = 0;
        for (Mision mision : misiones) {
            puntaje += mision.getPuntaje();
        }
        return puntaje;
    }

    private static void mostrarSeparador() {
        System.out.println("====================");
    }
}
