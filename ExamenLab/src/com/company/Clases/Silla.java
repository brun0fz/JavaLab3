package com.company.Clases;

public class Silla extends Mueble implements Descuento {

    private Boolean ruedas;

    public Silla() {
    }


    public Silla(int stock, String nombre, double precio, Boolean ruedas) {
        super(stock, nombre, precio);
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Silla{" +
                "ruedas=" + ruedas +
                "} " + super.toString();
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        return getPrecio() - (getPrecio() * porcentaje / 100);
    }
}

