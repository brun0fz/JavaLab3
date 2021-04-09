package com.company.ej03;

public class Circulo2 extends Figura {

    private double radio;

    public Circulo2() {
    }

    public Circulo2(double radio) {
        this.radio = radio;
    }

    public Circulo2(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * this.radio;
    }

    @Override
    public String toString() {
        return "Circulo2{" +
                "color=" + getColor() +
                ", radio=" + radio +
                ", area=" + getArea() +
                ", perimetro" + getPerimetro() +
                '}';
    }
}
