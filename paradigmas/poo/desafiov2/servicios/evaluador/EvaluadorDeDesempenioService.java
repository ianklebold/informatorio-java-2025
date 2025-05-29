package paradigmas.poo.desafiov2.servicios.evaluador;


import paradigmas.poo.desafiov2.dominio.Jugador;

//Es un contrato
public interface EvaluadorDeDesempenioService{
    //Firmas
    String evaluar(Jugador jugador);  //Firma
    String mensajeDeConstancia(Jugador jugador); //Firma
    boolean tieneFallos(Jugador jugador); //Firma
}