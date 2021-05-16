package com.company;

public abstract  class ProductoInformatico extends Producto{

    private String nombreFabricante;

    @Override
    public String toString() {
        return "ProductoInformatico{" +
                "nombreFabricante='" + nombreFabricante + '\'' +
                '}';
    }
}
