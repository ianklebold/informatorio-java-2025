package org.project.kiss.nestedconditional;

import com.chadgame.dominio.Jugador;
import com.chadgame.dominio.Mision;
import org.project.kiss.constants.MisionsConstants;

import java.util.List;

public class CodigoProblematico {
    public static void main(String[] args) {
        Jugador jugador = new Jugador(MisionsConstants.misions);

        procesarJugador(jugador);
    }

    public static void procesarJugador(Jugador jugador){
        if (jugador != null) {
            if (getPuntajeFinal(jugador.getMisiones()) > 0) {
                System.out.println("Jugador activo");
            }
        }
    }

    private static int getPuntajeFinal(List<Mision> misiones){
        int puntaje = 0;
        for (Mision mision : misiones) {
            puntaje += mision.getPuntaje();
        }
        return puntaje;
    }


}
