package paradigmas.poo.desafiov2;

import paradigmas.poo.desafiov2.dominio.Jugador;
import paradigmas.poo.desafiov2.dominio.Mision;
import paradigmas.poo.desafiov2.entradautils.LectorDeMisiones;
import paradigmas.poo.desafiov2.salidautils.ImpresoraResumen;
import paradigmas.poo.desafiov2.servicios.evaluador.EvaluadorDeDesempenioService;
import paradigmas.poo.desafiov2.servicios.evaluador.impl.EvaluadorDeDesempenioServiceImpl;
import paradigmas.poo.desafiov2.servicios.evaluador.impl.EvaluadorDeDesempenioServiceImplV2;

import java.util.List;
import java.util.Scanner;

public class ChadQuestRPG {
    public static void main(String[] args) {

        EvaluadorDeDesempenioService evaluadorDeDesempenioService = new EvaluadorDeDesempenioServiceImpl();

        System.out.println(" Bienvenido a ChadQuest RPG - Carga los puntajes de tus misiones ");

        LectorDeMisiones lector = new LectorDeMisiones(new Scanner(System.in));
        List<Mision> misiones = lector.leerMisiones(5);

        Jugador jugador = new Jugador( misiones );
        ImpresoraResumen.imprimir(jugador);

        String mensajePostEvaluacion = evaluadorDeDesempenioService.evaluar(jugador);
        String mensajeConstancia = evaluadorDeDesempenioService.mensajeDeConstancia(jugador);
        boolean tieneFallos = evaluadorDeDesempenioService.tieneFallos(jugador);

        System.out.println(mensajePostEvaluacion);
        System.out.println(mensajeConstancia);
        System.out.println( (tieneFallos)? "Si, ha fallado en una mision": "No ha fallado en ninguna mision" );

    }
}
