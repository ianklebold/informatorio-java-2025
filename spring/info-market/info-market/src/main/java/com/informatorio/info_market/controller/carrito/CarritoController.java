package com.informatorio.info_market.controller.carrito;

import com.informatorio.info_market.service.carrito.CarritoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/carritos")
@AllArgsConstructor
public class CarritoController {

    private CarritoService carritoService;

    @PostMapping("agregarProducto/{idUser}/{idProducto}")
    public ResponseEntity agregarProducto(
            @PathVariable UUID idUser,
            @PathVariable UUID idProducto) {

        carritoService.agregarProducto(idUser, idProducto);
        return ResponseEntity.ok().build();
    }


}
