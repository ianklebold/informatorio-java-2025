package com.informatorio.info_market.dto.producto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ProductoCreateDto {

    @NotBlank(message = "El nombre del producto no puede estar vacio")
    private String nombre;

    @NotBlank(message = "La descripcion del producto no puede estar vacio")
    @Size(max = 50, message = "La despcion debe tener como maximo 50 caracteres")
    private String descripcion;

    @Min(value = 0, message = "Se debe tener un precio minimo de 0")
    private double precio;

    @Min(value = 0, message = "Se debe tener un stock minimo de 0")
    private int stock;

    @NotEmpty(message = "Se debe tener como minimo una categoria para el producto")
    private List<Long> categorias;

}
