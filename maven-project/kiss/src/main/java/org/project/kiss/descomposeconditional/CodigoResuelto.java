package org.project.kiss.descomposeconditional;

import org.project.kiss.constants.MisionsConstants;

public class CodigoResuelto {
    public static void main(String[] args) {
        JugadorDeTorneo jugadorDeTorneo = new JugadorDeTorneo(MisionsConstants.misions,
                25,
                false,
                true);

        boolean puedeCompetir = (jugadorDeTorneo.getEdad() > 18 && jugadorDeTorneo.isTieneLicencia())
                || jugadorDeTorneo.isEsProfesional();

        if (puedeCompetir) {
            permitirCompetir();
        }
    }

    public static void permitirCompetir() {
        System.out.println("Competiendo...");
    }
}
