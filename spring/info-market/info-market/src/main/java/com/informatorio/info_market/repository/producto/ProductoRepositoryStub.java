package com.informatorio.info_market.repository.producto;

import com.informatorio.info_market.domain.Producto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProductoRepositoryStub {
    public static List<Producto> getAllProductos(){
        List<Producto> productos = new ArrayList<>();

        Producto producto = new Producto();
        producto.setId( UUID.randomUUID() );
        producto.setNombre( "Producto" );
        producto.setDescripcion( "Descripcion" );
        producto.setPrecio( 10 );
        producto.setStock( 200 );
        producto.setFechaDeCreacion( LocalDate.now() );
        producto.setFechaActualizacion( LocalDate.now() );

        Producto producto2 = new Producto();
        producto2.setId( UUID.randomUUID() );
        producto2.setNombre( "Producto 2" );
        producto2.setDescripcion( "Descripcion 2" );
        producto2.setPrecio( 20 );
        producto2.setStock( 1200 );
        producto2.setFechaDeCreacion( LocalDate.now() );
        producto2.setFechaActualizacion( LocalDate.now() );

        productos.add(producto);
        productos.add(producto2);
        return productos;
    }
}
