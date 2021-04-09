package com.company.ej03;

public class Cuadrado extends Rectangulo {


    public Cuadrado() {
    }

    public Cuadrado(String color, double lados) {
        super(color, lados, lados);
    }

    public Cuadrado(double lados) {
        super(lados, lados);
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "color=" + getColor() +
                ", lados=" + getBase() +
                ", area=" + getArea() +
                ", perimetro=" + getPerimetro() +
                '}';
    }
}
