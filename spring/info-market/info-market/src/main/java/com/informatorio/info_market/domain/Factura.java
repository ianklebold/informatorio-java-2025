package com.informatorio.info_market.domain;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Carrito carrito;

    private LocalDate fechaDeEmision;

    public Factura() {}

    public Factura(Carrito carrito, LocalDate fechaDeEmision) {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public LocalDate getFechaDeEmision() {
        return fechaDeEmision;
    }

    public void setFechaDeEmision(LocalDate fechaDeEmision) {
        this.fechaDeEmision = fechaDeEmision;
    }
}
