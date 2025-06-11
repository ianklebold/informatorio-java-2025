package org.project.kiss.magicnumbers;

import com.chadgame.dominio.Jugador;
import com.chadgame.dominio.Mision;
import org.project.kiss.constants.MisionsConstants;

import java.util.List;

public class CodigoProblematico {
    public static void main(String[] args) {
        Jugador jugador = new Jugador(MisionsConstants.misions);

        if (getPuntajeFinal(jugador.getMisiones()) > 300) {
            System.out.println("Ganaste el torneo");
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
