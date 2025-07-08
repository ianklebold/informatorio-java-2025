package com.informatorio.info_market.mapper.producto.impl;

import com.informatorio.info_market.domain.Producto;
import com.informatorio.info_market.dto.producto.ProductoDto;
import com.informatorio.info_market.mapper.categoria.CategoriaMapper;
import com.informatorio.info_market.mapper.producto.ProductoMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ProductoMapperImpl implements ProductoMapper {

    private CategoriaMapper categoriaMapper;

    @Override
    public ProductoDto productoToProductoDto(Producto producto) {
        ProductoDto productoDto = new ProductoDto();
        productoDto.setId(producto.getId());
        productoDto.setNombre(producto.getNombre());
        productoDto.setDescripcion(producto.getDescripcion());
        productoDto.setStock( producto.getStock() );
        productoDto.setPrecio(producto.getPrecio());

        productoDto.setCategorias(
                producto.getCategorias().stream()
                        .map(categoria -> categoriaMapper.categoriaToCategoriaDto(categoria))
                        .toList()
        );

        return productoDto;
    }

}