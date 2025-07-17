package com.informatorio.info_market.mapper.producto;

import com.informatorio.info_market.domain.Categoria;
import com.informatorio.info_market.domain.Producto;
import com.informatorio.info_market.dto.producto.ProductoCreateDto;
import com.informatorio.info_market.exception.notfound.NotFoundException;
import com.informatorio.info_market.repository.categoria.CategoriaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class ProductoCreateMapper {

    @Autowired
    protected CategoriaRepository categoriaRepository;

    @Mapping(target = "categorias", source = "categorias")
    public abstract Producto productDtoCreateToProducto(ProductoCreateDto productoCreateDto);

    protected Categoria map(Long id){
        return categoriaRepository.findById( id )
                .orElseThrow( () -> new NotFoundException("No se encontro la categoria con id : " + id));
    }


}
