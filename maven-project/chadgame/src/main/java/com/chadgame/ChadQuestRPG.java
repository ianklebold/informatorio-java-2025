package com.chadgame;

import com.chadgame.constantes.MessageConstants;
import com.chadgame.dominio.Jugador;
import com.chadgame.dominio.Mision;
import com.chadgame.entradautils.LectorDeMisiones;
import com.chadgame.servicios.archivos.ArchivosMisionesService;
import com.chadgame.servicios.archivos.impl.ArchivosMisionesServiceImpl;
import com.chadgame.servicios.evaluador.EvaluadorDeDesempenioService;
import com.chadgame.servicios.evaluador.impl.EvaluadorDeDesempenioServiceImpl;
import com.chadgame.servicios.menu.MenuService;
import com.chadgame.servicios.menu.impl.MenuServiceImpl;

import java.util.List;
import java.util.Scanner;

public class ChadQuestRPG {
    public static void main(String[] args) {

        System.out.println(MessageConstants.TITLE_OF_GAME);

        LectorDeMisiones lector = new LectorDeMisiones(new Scanner(System.in));
        List<Mision> misiones = lector.leerMisiones(5);
        Jugador jugador = new Jugador( misiones );
        ArchivosMisionesService archivosMisionesService = new ArchivosMisionesServiceImpl();
        EvaluadorDeDesempenioService evaluadorDeDesempenioService = new EvaluadorDeDesempenioServiceImpl();

        MenuService menuService = new MenuServiceImpl(evaluadorDeDesempenioService, archivosMisionesService, jugador);

        menuService.seleccionarOpcionMenu();
    }
}
