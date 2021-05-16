package com.company;

public abstract class Producto {

    private int stock;
    private String nombre;
    private double precio;


    @Override
    public String toString() {
        return "Producto{" +
                "stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
