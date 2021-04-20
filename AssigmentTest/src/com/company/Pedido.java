package com.company;

public class Pedido {

    private Cliente cliente;
    private Producto producto;
    private double kms;

    public Pedido() {
    }

    public Pedido(Cliente cliente, Producto producto, double kms) {
        this.cliente = cliente;
        this.producto = producto;
        this.kms = kms;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getKms() {
        return kms;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", producto=" + producto +
                ", kms=" + kms +
                '}';
    }
}
