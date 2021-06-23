package com.company.Clases;

public class Impresora extends ProductoInformatico implements Descuento {

    private double impresionesXMin;

    public Impresora() {
    }

    public Impresora(int stock, String nombre, double precio, String fabricante, Double impresionesXMin) {
        super(stock, nombre, precio, fabricante);
        this.impresionesXMin = impresionesXMin;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "impresionesXMin=" + impresionesXMin +
                "} " + super.toString();
    }


    @Override
    public double aplicarDescuento(double porcentaje) {
        return getPrecio() - (getPrecio() * porcentaje / 100);
    }
}
