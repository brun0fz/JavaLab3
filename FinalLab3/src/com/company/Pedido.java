package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Cliente cliente;
    private List<Producto> productoList = new ArrayList<>();
    private double km;
    private double costoEnvio = 0;

    public Pedido() {
    }

    public Pedido(Cliente cliente, List<Producto> productoList, double km, double costoEnvio) {
        this.cliente = cliente;
        this.productoList = productoList;
        this.km = km;
        this.costoEnvio = costoEnvio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(double costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", productoList=" + productoList +
                ", km=" + km +
                ", costoEnvio=" + costoEnvio +
                '}';
    }
}
