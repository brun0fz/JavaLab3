package com.company.Clases;

public abstract class Instrumento {

    private double precio;
    private String marca;

    public Instrumento() {
    }

    public Instrumento(double precio, String marca) {
        this.precio = precio;
        this.marca = marca;
    }


    @Override
    public String toString() {
        return "precio=" + precio +
                ", marca='" + marca + '\'' +
                '}';
    }


    public void actualizarPrecios() {
        if (this instanceof GuitarraElectrica) {
            System.out.println("Guitarra Electrica Precio: $" + this.precio);
            this.precio = this.precio * 1.05;
        } else if (this instanceof GuitarraAcustica) {
            System.out.println("Guitarra Acustica Precio: $" + this.precio);
            this.precio = this.precio * 1.1;
        } else if (this instanceof Bateria) {
            System.out.println("Bateria Precio: $" + this.precio);
            this.precio = this.precio * 1.15;
        } else {
            System.out.println("Bajo Precio: $" + this.precio);
            this.precio = this.precio * 1.2;
        }
        System.out.println("Precio actualizado: $" + this.precio);
    }

}
