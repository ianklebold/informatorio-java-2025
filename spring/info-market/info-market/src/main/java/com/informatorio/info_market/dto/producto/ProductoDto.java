package com.informatorio.info_market.dto.producto;

import com.informatorio.info_market.dto.categoria.CategoriaDto;
import lombok.*;

import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ProductoDto {
    private UUID id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private List<CategoriaDto> categorias;
}
