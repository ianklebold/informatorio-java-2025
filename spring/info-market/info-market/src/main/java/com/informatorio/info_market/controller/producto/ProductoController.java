package com.informatorio.info_market.controller.producto;

import com.informatorio.info_market.dto.error.ErrorResponseDto;
import com.informatorio.info_market.dto.producto.ProductoCreateDto;
import com.informatorio.info_market.dto.producto.ProductoDto;
import com.informatorio.info_market.service.producto.ProductoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@Tag(
        name = "Productos REST APIs",
        description = "REST APIs del Proyecto para realizar un CRUD de productos"
)
@RestController //Anotacion a nivel de clase
@RequestMapping("/api/v1/productos")
public class ProductoController {

    @Autowired //Anotacion a nivel de atributo
    private ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @Operation(
            summary = "Get todos los productos",
            description = "REST API para obtener todos los productos."
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "HTTP Request Success"
            )
    })
    @GetMapping()//Anotacion a nivel de metodo
    public List<ProductoDto> getAllProductos(
            @RequestParam(value = "minStock", defaultValue = "0", required = false) int minStock,
            @RequestParam(value = "minPrice", defaultValue = "0", required = false) Double minPrice,
            @RequestParam(value = "maxPrice", defaultValue = "0" ,required = false) Double maxPrice
    ) {
        return productoService.getAllProductos(minStock, minPrice, maxPrice);
    }


    @Operation(
            summary = "Create Producto ",
            description = "REST API para crear un producto"
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "201",
                    description = "HTTP Status CREATED",
                    content = @Content(
                            schema = @Schema(implementation = ProductoDto.class)
                    )
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "HTTP Status BAD REQUEST",
                    content = @Content(
                            schema = @Schema(implementation = ErrorResponseDto.class)
                    )
            )
    })
    @PostMapping()
    public ResponseEntity<ProductoDto> createProducto(@Valid @RequestBody ProductoCreateDto producto) {
        ProductoDto productoDto = productoService.createProducto(producto);

        return ResponseEntity
                .created( URI.create( "/api/v1/productos/" + productoDto.getId() ) )
                .contentType(MediaType.APPLICATION_JSON)
                .body(productoDto);
    }

    @Operation(
            summary = "Put para actualizar un producto",
            description = "REST API para actualizar un producto"
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "HTTP Request Success",
                    content = @Content(
                            schema = @Schema(implementation = ProductoDto.class)
                    )
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "HTTP Status NOT FOUND",
                    content = @Content(
                            schema = @Schema(implementation = ErrorResponseDto.class)
                    )
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "HTTP Status BAD REQUEST",
                    content = @Content(
                            schema = @Schema(implementation = ErrorResponseDto.class)
                    )
            )
    })
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

    @Operation(
            summary = "Get para obtener un producto por id",
            description = "REST API para obtener un producto por id"
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "HTTP Request Success",
                    content = @Content(
                            schema = @Schema(implementation = ProductoDto.class)
                    )
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "HTTP Status NOT FOUND",
                    content = @Content(
                            schema = @Schema(implementation = ErrorResponseDto.class)
                    )
            )
    })
    @GetMapping("/{productoId}")
    public ProductoDto getProductoById(@PathVariable UUID productoId) {
        return productoService.getProductoById(productoId);
    }

    @Operation(
            summary = "Delete para eliminar un producto",
            description = "REST API para eliminar un producto por id"
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "204",
                    description = "HTTP Request NOT CONTENT"
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "HTTP Status NOT FOUND",
                    content = @Content(
                            schema = @Schema(implementation = ErrorResponseDto.class)
                    )
            )
    })
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