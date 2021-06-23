package com.company.Clases;

public abstract class Producto {

    private int stock;
    private String nombre;
    private double precio;

    public Producto() {
    }

    public Producto(int stock, String nombre, double precio) {
        this.stock = stock;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }


    public void actualizarPrecio() {
        if (this instanceof Silla) {
            System.out.println("Silla Precio actual: " + this.precio);
            this.precio = this.precio * 1.05;
        } else if (this instanceof Escritorio) {
            System.out.println("Escritorio Precio actual: " + this.precio);
            this.precio = this.precio * 1.10;
        } else if (this instanceof Impresora) {
            System.out.println("Impresora Precio actual: " + this.precio);
            this.precio = this.precio * 1.15;
        } else {
            System.out.println("Notebook Precio actual: " + this.precio);
            this.precio = this.precio * 1.20;
        }
        System.out.println("Precio actualizado: " + this.precio);
    }


}
