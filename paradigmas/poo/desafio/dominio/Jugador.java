package paradigmas.poo.desafio.dominio;

import java.util.List;

public class Jugador {
    private List<Mision> misiones;

    public Jugador(List<Mision> misiones) {
        this.misiones = misiones;
    }

    public List<Mision> getMisiones() {
        return misiones;
    }

    public int calcularTotal(){
        int total = 0;
        for (Mision mision : misiones) {
            total += mision.getPuntaje();
        }
        return total;
    }

    public Mision misionConMayorPuntaje(){
        Mision misionConMayorPuntaje = misiones.get(0);
        for (Mision mision : misiones) {
            if( mision.getPuntaje() > misionConMayorPuntaje.getPuntaje() ){
                misionConMayorPuntaje = mision;
            }
        }
        return misionConMayorPuntaje;
    }

    public Mision misionConMenorPuntaje(){
        Mision misionConMenorPuntaje = misiones.get(0);
        for (Mision mision : misiones) {
            if( mision.getPuntaje() < misionConMenorPuntaje.getPuntaje() ){
                misionConMenorPuntaje = mision;
            }
        }
        return misionConMenorPuntaje;
    }

    public boolean tieneMisionFallida(){
        for (Mision mision : misiones) {
            if( mision.esFallida() ){
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public boolean esConstante(){
        return misionConMayorPuntaje().getPuntaje() - misionConMenorPuntaje().getPuntaje() < 20;
    }



}
