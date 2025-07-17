package com.informatorio.info_market.service.item;

import com.informatorio.info_market.domain.Carrito;
import com.informatorio.info_market.domain.ItemCarrito;
import com.informatorio.info_market.domain.Producto;

public interface ItemService {
    ItemCarrito crearItemCarrito(Carrito carrito, Producto producto, int cantidad);
}
