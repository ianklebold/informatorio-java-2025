package com.informatorio.info_market.service.producto;

import com.informatorio.info_market.domain.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> getAllProductos();

    Producto createProducto(Producto producto);
}
