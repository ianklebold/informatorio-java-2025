package com.informatorio.info_market.dto.producto;

import com.informatorio.info_market.dto.categoria.CategoriaDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Schema(
        name = "Producto DTO",
        description = "DTO para alojar la informacion de un producto"
)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ProductoDto {
    @Schema(description = "id", example = "55555555-aaaa-bbbb-cccc-555555555555")
    private UUID id;

    @Schema(description = "Nombre del producto", example = "Shampoo UltraCare")
    private String nombre;

    @Schema(description = "Descripcion del producto", example = "Hidratación profunda para cabello seco")
    private String descripcion;

    @Schema(description = "Precio del producto", example = "35999.00")
    private double precio;

    @Schema(description = "Stock del producto", example = "15")
    private int stock;

    private List<CategoriaDto> categorias;
}
