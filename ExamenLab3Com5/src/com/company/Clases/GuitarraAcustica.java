package com.company.Clases;

public class GuitarraAcustica extends Cuerda{

    TipoDeMadera tipoDeMadera;

    public GuitarraAcustica() {
    }

    public GuitarraAcustica(double precio, String marca, TipoDeMadera tipoDeMadera) {
        super(precio, marca, 6);
        this.tipoDeMadera = tipoDeMadera;
    }

    @Override
    public String toString() {
        return "GuitarraAcustica{" +
                "tipoDeMadera=" + tipoDeMadera +
                "} " + super.toString();
    }
}
