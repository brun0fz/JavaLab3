package com.utntup.ejercicio02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Factura {

    private UUID id;
    private LocalDateTime fecha;
    private double montoTotal;

    private Cliente cliente;

    public Factura() {
    }

    public Factura(double montoTotal, Cliente cliente) {
        this.id = UUID.randomUUID();
        this.montoTotal = montoTotal;
        this.fecha = LocalDateTime.now();
        this.cliente = cliente;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public double getMontoDesc() {
        return montoTotal - (montoTotal * (cliente.getDescuento() / 100));
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", monto=" + montoTotal +
                ", montoDesc=" + getMontoDesc() +
                ", " + cliente +
                '}';
    }
}
