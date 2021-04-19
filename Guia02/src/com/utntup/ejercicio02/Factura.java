package com.utntup.ejercicio02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.UUID;

public class Factura {

    private UUID id;
    private double montoTotal;
    private LocalDateTime fecha;

    private Cliente cliente;

    private ItemVenta[] itemVentas;

    public Factura() {
    }

    public Factura(double montoTotal, Cliente cliente) {
        this.id = UUID.randomUUID();
        this.montoTotal = montoTotal;
        this.fecha = LocalDateTime.now();
        this.cliente = cliente;
    }

    public Factura(Cliente cliente, ItemVenta[] itemVentas) {
        this.id = UUID.randomUUID();
        this.itemVentas = itemVentas;
        this.montoTotal = sumarCarrito();
        this.fecha = LocalDateTime.now();
        this.cliente = cliente;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getMontoDesc() {
        double resultado = (cliente.getDescuento() > 0) ? montoTotal - (montoTotal * (cliente.getDescuento() / 100)) : 0;

        return resultado;
    }

    public double sumarCarrito() {
        double suma=0;

        for (ItemVenta carrito : this.itemVentas) {

            suma += carrito.getPrecioUnitario();
        }

        return suma;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", montoTotal=" + montoTotal +
                ", montoDesc=" + getMontoDesc() +
                ", fecha=" + fecha +
                ", cliente=" + cliente +
                ", items: " + Arrays.toString(itemVentas) +
                '}';
    }
}
