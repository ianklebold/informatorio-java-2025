package com.informatorio.info_market.service.producto.impl;

import com.informatorio.info_market.domain.Producto;
import com.informatorio.info_market.dto.producto.ProductoDto;
import com.informatorio.info_market.mapper.producto.ProductoMapper;
import com.informatorio.info_market.repository.producto.ProductoRepository;
import com.informatorio.info_market.service.producto.ProductoService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository productoRepository;

    private final ProductoMapper productoMapper;

    @Override
    public List<ProductoDto> getAllProductos(int minStock, Double minPrice, Double maxPrice) {
        List<Producto> productos; //Entidades

        if(minStock == 0 && maxPrice == 0 ){
            productos = productoRepository.findAll();
        } else if (minStock > 0 && maxPrice > 0) {
            productos = productoRepository.findAllByStockIsGreaterThanAndPrecioIsBetween(minStock, minPrice, maxPrice);
        } else if (maxPrice > 0) {
            //Filtrar por maxPrice
            productos = productoRepository.findAllByPrecioIsLessThan(maxPrice);
        }else {
            productos = productoRepository.findAllByStockIsGreaterThan(minStock);
        }

        return productos.stream()
                        .map( producto -> productoMapper.productoToProductoDto( producto ) )
                        .toList();
    }

    @Override
    public ProductoDto getProductoById(UUID id) {

        Optional<Producto> producto = productoRepository.findById(id);
        if (producto.isPresent()) {
            return productoMapper.productoToProductoDto( producto.get() );
        }
        return null;
    }

    @Override
    public Producto createProducto(Producto producto) {

        producto.setFechaDeCreacion(LocalDate.now());
        producto.setFechaActualizacion(LocalDate.now());
        productoRepository.save(producto);

        return producto;
    }

    @Override
    public void deleteProducto(UUID id) {
        productoRepository.deleteById(id);
    }

}
