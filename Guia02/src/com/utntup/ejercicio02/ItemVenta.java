package com.utntup.ejercicio02;

import java.util.UUID;

public class ItemVenta {

    private UUID id;
    private String nombre;
    private String descripcion;
    private double precioUnitario;

    public ItemVenta() {
    }

    public ItemVenta(String nombre, String descripcion, double precioUnitario) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "ItemVenta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precioUnitario=" + precioUnitario +
                '}';
    }
}
