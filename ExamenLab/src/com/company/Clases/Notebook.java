package com.company.Clases;

public class Notebook extends ProductoInformatico{

    private double ram;

    public Notebook() {
    }

    public Notebook(int stock, String nombre, double precio, String fabricante, double ram) {
        super(stock, nombre, precio, fabricante);
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "ram=" + ram +
                "} " + super.toString();
    }
}
