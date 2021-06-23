package com.company.Clases;

public abstract class Cuerda extends Instrumento {

    private int cantCuerdas;

    public Cuerda() {
    }

    public Cuerda(double precio, String marca, int cantCuerdas) {
        super(precio, marca);
        this.cantCuerdas = cantCuerdas;
    }

    @Override
    public String toString() {
        return "Cuerda{" +
                "cantCuerdas=" + cantCuerdas +
                "} " + super.toString();
    }
}
