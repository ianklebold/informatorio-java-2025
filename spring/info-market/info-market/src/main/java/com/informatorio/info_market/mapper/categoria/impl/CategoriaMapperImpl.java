package com.informatorio.info_market.mapper.categoria.impl;

import com.informatorio.info_market.domain.Categoria;
import com.informatorio.info_market.dto.categoria.CategoriaDto;
import com.informatorio.info_market.mapper.categoria.CategoriaMapper;
import org.springframework.stereotype.Component;

@Component
public class CategoriaMapperImpl implements CategoriaMapper {
    @Override
    public CategoriaDto categoriaToCategoriaDto(Categoria categoria) {
        CategoriaDto categoriaDto = new CategoriaDto();
        categoriaDto.setNombre( categoria.getNombre() );
        return categoriaDto;
    }
}
