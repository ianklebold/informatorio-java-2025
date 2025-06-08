package com.chadgame.servicios.menu.impl;

import java.util.Scanner;

import com.chadgame.constantes.MessageConstants;
import com.chadgame.dominio.Jugador;
import com.chadgame.salidautils.ImpresoraResumen;
import com.chadgame.servicios.archivos.ArchivosMisionesService;
import com.chadgame.servicios.evaluador.EvaluadorDeDesempenioService;
import com.chadgame.servicios.menu.MenuService;

public class MenuServiceImpl implements MenuService{

    private EvaluadorDeDesempenioService evaluadorDeDesempenioService;
    private ArchivosMisionesService archivosMisionesService;
    private Jugador jugador;

    public MenuServiceImpl(EvaluadorDeDesempenioService evaluadorDeDesempenioService, ArchivosMisionesService archivosMisionesService, Jugador jugador) {
        this.evaluadorDeDesempenioService = evaluadorDeDesempenioService;
        this.archivosMisionesService = archivosMisionesService;
        this.jugador = jugador;
    }

    @Override
    public int seleccionarOpcionMenu() {
        Scanner scanner = new Scanner(System.in);
        int condition = 0;

        do {
            System.out.println("INDIQUE UNA OPCION : ");
            System.out.println("1. IMPRIMIR TOTAL FINAL DE JUGADOR");
            System.out.println("2. IMRPRIMIR MENSAJE POST EVALUACION");
            System.out.println("3. EXISTE CONSTANCIA? ");
            System.out.println("4. TIENE FALLOS? ");
            System.out.println("5. GENERAR ARCHIVOS DE LAS MISIONES");
            System.out.println("6. SALIR : ");

            condition = scanner.nextInt();
            ejecutarOpcion(condition);

        } while (condition != 6);
        scanner.close();
        return condition;

    }

    @Override
    public void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("\n");
                ImpresoraResumen.imprimir(jugador);
                System.out.println("\n");
                break;
            case 2:
                System.out.println("\n");
                System.out.println(evaluadorDeDesempenioService.evaluar(jugador));
                System.out.println("\n");
                break;
            case 3:
                System.out.println("\n");
                System.out.println(evaluadorDeDesempenioService.mensajeDeConstancia(jugador));
                System.out.println("\n");
                break;
            case 4:
                System.out.println("\n");
                System.out.println(evaluadorDeDesempenioService.tieneFallos(jugador));
                System.out.println("\n");
                break;
            case 5:
                System.out.println("\n");
                archivosMisionesService.exportarMisionesCSV(jugador.getMisiones());
                System.out.println("\n");
                break;
            case 6:
                System.out.println("\n");
                System.out.println(MessageConstants.MESSAGE_TO_SAY_GOODBYE);
                System.out.println("\n");
                break;
            default:
                break;
        }

    }

}
