package com.company.Clases;

public abstract class Mueble extends Producto{

    public Mueble() {
    }

    public Mueble(int stock, String nombre, double precio) {
        super(stock, nombre, precio);
    }

    @Override
    public String toString() {
        return "Mueble{} " + super.toString();
    }
}
