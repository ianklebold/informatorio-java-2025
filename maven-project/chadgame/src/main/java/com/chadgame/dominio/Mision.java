package com.chadgame.dominio;

public class Mision {
    private int numero;
    private int puntaje;

    public Mision(int numero, int puntaje) {
        this.numero = numero;
        this.puntaje = puntaje;
    }

    public int getNumero() {
        return numero;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public boolean esFallida(){
        return this.puntaje == 0;
    }

}
