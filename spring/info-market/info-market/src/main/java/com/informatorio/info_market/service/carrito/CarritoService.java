package com.informatorio.info_market.service.carrito;

import com.informatorio.info_market.domain.Carrito;
import com.informatorio.info_market.enumerations.EstadoCarritoEnum;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CarritoService {

    @Transactional()
    void agregarProducto(UUID idUser, UUID idProducto);

    Optional<Carrito> getCarritoConEstado(EstadoCarritoEnum estadoCarritoEnum, List<Carrito> carritos);

}
