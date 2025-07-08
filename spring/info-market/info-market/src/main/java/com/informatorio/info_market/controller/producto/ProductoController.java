package com.informatorio.info_market.controller.producto;

import com.informatorio.info_market.domain.Producto;
import com.informatorio.info_market.dto.producto.ProductoDto;
import com.informatorio.info_market.service.producto.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController //Anotacion a nivel de clase
@RequestMapping("/api/v1/productos")
public class ProductoController {

    @Autowired //Anotacion a nivel de atributo
    private ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping()//Anotacion a nivel de metodo
    public List<ProductoDto> getAllProductos(
            @RequestParam(value = "minStock", defaultValue = "0", required = false) int minStock,
            @RequestParam(value = "minPrice", defaultValue = "0", required = false) Double minPrice,
            @RequestParam(value = "maxPrice", defaultValue = "0" ,required = false) Double maxPrice
    ) {
        return productoService.getAllProductos(minStock, minPrice, maxPrice);
    }

    @PostMapping()
    public Producto createProducto(@RequestBody Producto producto) {
        return productoService.createProducto(producto);
    }

    @GetMapping("/{productoId}")
    public ProductoDto getProductoById(@PathVariable UUID productoId) {
        return productoService.getProductoById(productoId);
    }

    @DeleteMapping("/{productoId}")
    public void deleteProductoById(@PathVariable UUID productoId) {
        productoService.deleteProducto(productoId);
    }


}