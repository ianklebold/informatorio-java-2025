package com.informatorio.info_market.service.carrito.impl;

import com.informatorio.info_market.domain.Carrito;
import com.informatorio.info_market.domain.ItemCarrito;
import com.informatorio.info_market.domain.Producto;
import com.informatorio.info_market.domain.Usuario;
import com.informatorio.info_market.enumerations.EstadoCarritoEnum;
import com.informatorio.info_market.repository.carrito.CarritoRepository;
import com.informatorio.info_market.service.carrito.CarritoService;
import com.informatorio.info_market.service.item.ItemService;
import com.informatorio.info_market.service.producto.ProductoService;
import com.informatorio.info_market.service.usuario.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class CarritoServiceImpl implements CarritoService {

    private CarritoRepository carritoRepository;

    private ProductoService productoService;

    private UsuarioService usuarioService;

    private ItemService itemService;

    @Override
    public void agregarProducto(UUID idUser, UUID idProducto) {
        Producto producto = productoService.getProductoEntityById(idProducto);

        Usuario usuario = usuarioService.getUsuarioEntityById(idUser);

        Optional<Carrito> carrito = getCarritoConEstado( EstadoCarritoEnum.ABIERTO, usuario.getCarritos() );

        if (carrito.isPresent()){
                ItemCarrito itemCarrito =itemService.crearItemCarrito( carrito.get(), producto, 1 );
                carrito.get().getItemsCarritos().add(  itemCarrito );

                carritoRepository.save( carrito.get() );
        }else {
            Carrito carritoNuevo = new Carrito();
            carritoNuevo.setEstadoCarrito(EstadoCarritoEnum.ABIERTO);
            carritoNuevo.setUsuario(usuario);
            carritoNuevo.setFactura(null);
            carritoNuevo.setFechaActualizacion(LocalDate.now());
            carritoNuevo.setFechaDeCreacion(LocalDate.now());
            ItemCarrito itemCarrito = itemService.crearItemCarrito( carritoNuevo, producto, 1 );
            carritoNuevo.getItemsCarritos().add( itemCarrito );
            carritoRepository.save( carritoNuevo );
        }

    }

    @Override
    public Optional<Carrito> getCarritoConEstado(EstadoCarritoEnum estadoCarritoEnum, List<Carrito> carritos) {
        return carritos.stream()
                .filter( carrito -> estadoCarritoEnum.equals( carrito.getEstadoCarrito() ))
                .findFirst();
    }


}
