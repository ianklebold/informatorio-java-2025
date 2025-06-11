package org.project.kiss.descomposeconditional;

import org.project.kiss.constants.MisionsConstants;

public class CodigoProblematico {

    public static void main(String[] args) {

        JugadorDeTorneo jugadorDeTorneo = new JugadorDeTorneo(MisionsConstants.misions,
                25,
                Boolean.FALSE,
                Boolean.TRUE);

        if ((jugadorDeTorneo.getEdad() > 18 && jugadorDeTorneo.isTieneLicencia()) || jugadorDeTorneo.isEsProfesional()) {
            permitirCompetir();
        }
    }

    public static void permitirCompetir() {
        System.out.println("Competiendo...");
    }

}
