package com.informatorio.info_market.service.producto;

import com.informatorio.info_market.domain.Producto;
import com.informatorio.info_market.dto.producto.ProductoDto;

import java.util.List;
import java.util.UUID;

public interface ProductoService {
    List<ProductoDto> getAllProductos(int minStock, Double minPrice, Double maxPrice);

    ProductoDto getProductoById(UUID id);

    Producto createProducto(Producto producto);

    void deleteProducto(UUID id);
}
