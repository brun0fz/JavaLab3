package com.company.clases;

public class ItemVenta {

    int id;
    String descripcion;
    int cantidad;
    double pUnitario;

    public ItemVenta() {
    }

    public ItemVenta(int id, String descripcion, int cantidad, double pUnitario) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.pUnitario = pUnitario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getpUnitario() {
        return pUnitario;
    }

    public void setpUnitario(double pUnitario) {
        this.pUnitario = pUnitario;
    }

    public double calPTotal() {
        return this.pUnitario * this.cantidad;
    }

    public String getItemVenta() {
        return "ItemVenta{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", pUnitario=" + pUnitario +
                '}';
    }
}
