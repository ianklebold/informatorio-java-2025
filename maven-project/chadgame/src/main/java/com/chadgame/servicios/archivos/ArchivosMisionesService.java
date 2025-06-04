package com.chadgame.servicios.archivos;

import java.util.List;

import com.chadgame.dominio.Mision;

public interface ArchivosMisionesService {
    void exportarMisionesCSV(List<Mision> misiones);
}
