package com.informatorio.info_market.repository.carrito;

import com.informatorio.info_market.domain.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CarritoRepository extends JpaRepository<Carrito, UUID> {
}
