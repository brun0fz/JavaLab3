package com.company.Clases;

public abstract class ProductoInformatico extends Producto{

    private String fabricante;

    public ProductoInformatico() {
    }


    public ProductoInformatico(int stock, String nombre, double precio, String fabricante) {
        super(stock, nombre, precio);
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "ProductoInformatico{" +
                "fabricante='" + fabricante + '\'' +
                "} " + super.toString();
    }
}
