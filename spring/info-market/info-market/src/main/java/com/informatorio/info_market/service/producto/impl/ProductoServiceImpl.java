package com.informatorio.info_market.service.producto.impl;

import com.informatorio.info_market.domain.Producto;
import com.informatorio.info_market.dto.producto.ProductoCreateDto;
import com.informatorio.info_market.dto.producto.ProductoDto;
import com.informatorio.info_market.exception.badrequest.StockInsuficienteException;
import com.informatorio.info_market.exception.notfound.NotFoundException;
import com.informatorio.info_market.mapper.producto.ProductoCreateMapper;
import com.informatorio.info_market.mapper.producto.ProductoMapper;
import com.informatorio.info_market.repository.producto.ProductoRepository;
import com.informatorio.info_market.service.producto.ProductoService;
import lombok.AllArgsConstructor;
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

    private final ProductoCreateMapper productoCreateMapper;

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
        }else{
            throw new NotFoundException("No se encontro el producto con id : " + id);
        }
    }

    @Override
    public Producto getProductoEntityById(UUID id) {
        Optional<Producto> producto = productoRepository.findById(id);
        if (producto.isPresent()) {
            return  producto.get() ;
        }else{
            throw new NotFoundException("No se encontro el producto con id : " + id);
        }
    }

    @Override
    public ProductoDto createProducto(ProductoCreateDto producto) {
        Producto productoToCreate = productoCreateMapper.productDtoCreateToProducto(producto);

        productoToCreate.setFechaDeCreacion(LocalDate.now());
        productoToCreate.setFechaActualizacion(LocalDate.now());

        return productoMapper.productoToProductoDto( productoRepository.save(productoToCreate) ) ;
    }

    @Override
    public ProductoDto updateProducto(ProductoCreateDto producto, UUID idProducto) {

        Optional<Producto> productoToUpdate = productoRepository.findById(idProducto);

        if (productoToUpdate.isPresent()){
            Producto productoUpdated = productoCreateMapper.productDtoCreateToProducto(producto);

            productoUpdated.setId( productoToUpdate.get().getId() );
            productoUpdated.setFechaDeCreacion( productoToUpdate.get().getFechaDeCreacion() );
            productoUpdated.setFechaActualizacion(LocalDate.now());

            productoRepository.save(productoUpdated);
            return productoMapper.productoToProductoDto(productoUpdated);

        }else{
            throw new NotFoundException("No se encontro el producto con id : " + idProducto);
        }

    }

    @Override
    public void descontarStock(Producto producto, int cantidad) {
        if ( producto.getStock() < cantidad ){
            //Ejecutar excepcion
            throw new StockInsuficienteException("No existe stock suficiente del producto");
        }else {
            producto.setStock(producto.getStock() - cantidad);
            productoRepository.save(producto);
        }
    }

    @Override
    public void deleteProducto(UUID id) {

        if (productoRepository.existsById( id )){
            productoRepository.deleteById(id);
        }

        throw new NotFoundException("No se encontro el producto con id : " + id);
    }

    @Override
    public List<ProductoDto> testProductsQueries() {

        List<Producto> productos;

        productos = productoRepository.obtenerTodosLosProductosConNombreCategoriaNative("Deportes");

        return productos.stream()
                .map(productoMapper::productoToProductoDto)
                .toList();
    }

}
