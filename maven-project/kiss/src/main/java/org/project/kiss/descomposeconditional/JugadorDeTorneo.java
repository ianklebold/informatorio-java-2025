package org.project.kiss.descomposeconditional;

import com.chadgame.dominio.Jugador;
import com.chadgame.dominio.Mision;

import java.util.List;

public class JugadorDeTorneo extends Jugador {

    private int edad;
    private boolean tieneLicencia;
    private boolean esProfesional;

    public JugadorDeTorneo(List<Mision> misiones) {
        super(misiones);
    }

    public JugadorDeTorneo(List<Mision> misiones, int edad, boolean tieneLicencia, boolean esProfesional) {
        super(misiones);
        this.edad = edad;
        this.tieneLicencia = tieneLicencia;
        this.esProfesional = esProfesional;
    }

    public boolean isTieneLicencia() {
        return tieneLicencia;
    }

    public void setTieneLicencia(boolean tieneLicencia) {
        this.tieneLicencia = tieneLicencia;
    }

    public boolean isEsProfesional() {
        return esProfesional;
    }

    public void setEsProfesional(boolean esProfesional) {
        this.esProfesional = esProfesional;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
