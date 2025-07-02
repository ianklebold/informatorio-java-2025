package com.informatorio.info_market.domain;

import com.informatorio.info_market.enumerations.EstadoCarritoEnum;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
public class Carrito {

    @Id
    @GeneratedValue(generator = "UUID")
    @JdbcTypeCode(SqlTypes.CHAR)
    @Column(length = 36, columnDefinition = "varchar(36)", nullable = false, updatable = false)
    private UUID id;

    @Enumerated(EnumType.STRING)
    private EstadoCarritoEnum estadoCarrito;

    @ManyToMany
    private List<Producto> productos;

    @OneToOne
    private Factura factura;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    private LocalDate fechaDeCreacion;
    private LocalDate fechaActualizacion;

    public Carrito() {
    }

    public Carrito(UUID id, EstadoCarritoEnum estadoCarrito, List<Producto> productos, Factura factura, Usuario usuario, LocalDate fechaDeCreacion, LocalDate fechaActualizacion) {
        this.id = id;
        this.estadoCarrito = estadoCarrito;
        this.productos = productos;
        this.factura = factura;
        this.usuario = usuario;
        this.fechaDeCreacion = fechaDeCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public EstadoCarritoEnum getEstadoCarrito() {
        return estadoCarrito;
    }

    public void setEstadoCarrito(EstadoCarritoEnum estadoCarrito) {
        this.estadoCarrito = estadoCarrito;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public LocalDate getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(LocalDate fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public LocalDate getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDate fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
}
