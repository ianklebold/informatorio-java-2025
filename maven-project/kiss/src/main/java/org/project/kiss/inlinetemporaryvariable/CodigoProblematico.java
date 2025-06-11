package org.project.kiss.inlinetemporaryvariable;

import com.chadgame.dominio.Jugador;
import com.chadgame.dominio.Mision;
import org.project.kiss.constants.MisionsConstants;

import java.util.List;

public class CodigoProblematico {
    public static void main(String[] args) {
        Jugador jugador = new Jugador(MisionsConstants.misions);
        System.out.println( getMensajeFinal(jugador) );
    }

    private static String getMensajeFinal(Jugador jugador){
        String mensaje = ( getPuntajeFinal(jugador.getMisiones())  >= 300 )? "Ganador!":"Perdedor";
        return mensaje;
    }

    private static int getPuntajeFinal(List<Mision> misiones){
        int puntaje = 0;
        for (Mision mision : misiones) {
            puntaje += mision.getPuntaje();
        }
        return puntaje;
    }
}
