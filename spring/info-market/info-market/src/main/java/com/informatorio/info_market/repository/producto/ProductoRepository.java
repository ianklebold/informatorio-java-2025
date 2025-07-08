package com.informatorio.info_market.repository.producto;

import com.informatorio.info_market.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ProductoRepository extends JpaRepository<Producto, UUID> {
    //Query Methods
    //Filtro por minStock , min Price y maxPrice
    List<Producto> findAllByStockIsGreaterThanAndPrecioIsBetween(int stockMin, Double minPrice, Double maxPrice);

    //Filtrar por maxPrice
    List<Producto> findAllByPrecioIsLessThan(Double precio);

    //Filtrar por min stock
    List<Producto> findAllByStockIsGreaterThan(int stockMin);
}
