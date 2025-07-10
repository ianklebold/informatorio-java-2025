package com.informatorio.info_market.dto.producto;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ProductoCreateDto {
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private List<Long> categorias;
}
