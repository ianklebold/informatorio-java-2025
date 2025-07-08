package com.informatorio.info_market.mapper.categoria;

import com.informatorio.info_market.domain.Categoria;
import com.informatorio.info_market.dto.categoria.CategoriaDto;

public interface CategoriaMapper {
    CategoriaDto categoriaToCategoriaDto(Categoria categoria);
}
