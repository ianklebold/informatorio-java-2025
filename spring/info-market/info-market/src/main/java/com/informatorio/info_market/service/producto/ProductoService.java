package com.informatorio.info_market.service.producto;

import com.informatorio.info_market.domain.Producto;
import com.informatorio.info_market.dto.producto.ProductoCreateDto;
import com.informatorio.info_market.dto.producto.ProductoDto;

import java.util.List;
import java.util.UUID;

public interface ProductoService {
    List<ProductoDto> getAllProductos(int minStock, Double minPrice, Double maxPrice);

    ProductoDto getProductoById(UUID id);

    Producto getProductoEntityById(UUID id);

    ProductoDto createProducto(ProductoCreateDto producto);

    ProductoDto updateProducto(ProductoCreateDto producto, UUID idProducto);

    void descontarStock(Producto producto, int cantidad);

    void deleteProducto(UUID id);

    List<ProductoDto> testProductsQueries();
}
