package com.informatorio.info_market.controller.producto;

import com.informatorio.info_market.domain.Producto;
import com.informatorio.info_market.dto.producto.ProductoCreateDto;
import com.informatorio.info_market.dto.producto.ProductoDto;
import com.informatorio.info_market.exception.notfound.NotFoundException;
import com.informatorio.info_market.service.producto.ProductoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
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
    public ResponseEntity<ProductoDto> createProducto(@Valid @RequestBody ProductoCreateDto producto) {
        ProductoDto productoDto = productoService.createProducto(producto);

        return ResponseEntity
                .created( URI.create( "/api/v1/productos/" + productoDto.getId() ) )
                .contentType(MediaType.APPLICATION_JSON)
                .body(productoDto);
    }

    @PutMapping("/{productoId}")
    public ResponseEntity<ProductoDto> updateProducto(
            @Valid @RequestBody ProductoCreateDto producto,
            @PathVariable UUID productoId
    ) {
        ProductoDto productoDto = productoService.updateProducto(producto, productoId);

        return ResponseEntity
                .ok()
                .location(URI.create( "/api/v1/productos/" + productoId ) )
                .body(productoDto);
    }

    @GetMapping("/{productoId}")
    public ProductoDto getProductoById(@PathVariable UUID productoId) {
        return productoService.getProductoById(productoId);
    }

    @DeleteMapping("/{productoId}")
    public void deleteProductoById(@PathVariable UUID productoId) {
        productoService.deleteProducto(productoId);
        ResponseEntity.noContent().build();
    }

    @GetMapping("/query")
    public List<ProductoDto> testProductsQueries(){
        return productoService.testProductsQueries();
    }


}