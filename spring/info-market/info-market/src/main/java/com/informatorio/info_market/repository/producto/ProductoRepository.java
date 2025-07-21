package com.informatorio.info_market.repository.producto;

import com.informatorio.info_market.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
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

    //HQL
    @Query("SELECT p FROM Producto p WHERE p.precio > :minPrecio")
    List<Producto> obtenerTodosLosProductosConUnPrecioMayorA(Double minPrecio);

    @Query("SELECT p FROM Producto p WHERE LOWER(p.nombre) LIKE LOWER(CONCAT('%', :nombreProd, '%') ) ")
    List<Producto> obtenerTodosLosProductosConNombreProd(String nombreProd);

    @Query("SELECT DISTINCT p FROM Producto p JOIN p.categorias c WHERE c.nombre = :nombreCategoria")
    List<Producto> obtenerTodosLosProductosConNombreCategoria(String nombreCategoria);

    @Query("SELECT p.id, p.nombre FROM Producto p WHERE SIZE(p.categorias)  > 1")
    List<Producto> obtenerTodosLosProductoConMasDeUnaCategoria();

    //NATIVE QUERY - SQL
    @Query(value = "SELECT * FROM producto WHERE fecha_de_creacion > :fecha", nativeQuery = true)
    List<Producto> obtenerProductosCreadosDespuesDe(@Param("fecha") LocalDate fecha);

    @Query(value = """
    SELECT p.* FROM producto p
    JOIN producto_categorias pc ON pc.producto_id = p.id
    JOIN categoria c ON c.id = pc.categorias_id
    WHERE c.nombre = :nombreCategoria
    """, nativeQuery = true)
    List<Producto> obtenerTodosLosProductosConNombreCategoriaNative(@Param("nombreCategoria") String nombreCategoria);
}
