package com.company.Clases;

import java.time.LocalDate;

public class Alquiler {

    private Cliente cliente;
    private Vehiculo vehiculo;
    private Sucursal sucursalrenta;
    private Sucursal sucursalDestino;
    private LocalDate inicio;
    private LocalDate fin = LocalDate.of(1,1,1);
    private double costo = 0;

    public Alquiler() {
    }

    public Alquiler(Cliente cliente, Vehiculo vehiculo, Sucursal sucursalrenta, LocalDate inicio) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.sucursalrenta = sucursalrenta;
        this.inicio = inicio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Sucursal getSucursalrenta() {
        return sucursalrenta;
    }

    public void setSucursalrenta(Sucursal sucursalrenta) {
        this.sucursalrenta = sucursalrenta;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFin() {
        return fin;
    }

    public void setFin(LocalDate fin) {
        this.fin = fin;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Sucursal getSucursalDestino() {
        return sucursalDestino;
    }

    public void setSucursalDestino(Sucursal sucursalDestino) {
        this.sucursalDestino = sucursalDestino;
    }


    @Override
    public String toString() {
        return "Alquiler{" +
                "cliente=" + cliente +
                ", vehiculo=" + vehiculo +
                ", sucursalrenta=" + sucursalrenta +
                ", sucursalDestino=" + sucursalDestino +
                ", inicio=" + inicio +
                ", fin=" + fin +
                ", costo=" + costo +
                '}';
    }
}
