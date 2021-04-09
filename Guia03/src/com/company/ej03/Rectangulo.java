package com.company.ej03;

public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo() {
    }


    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return this.base * this.altura;
    }

    @Override
    public double getPerimetro() {
        return 2 * (this.base + this.altura);
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "color= " + getColor() +
                ", base=" + base +
                ", altura=" + altura +
                ", area=" + getArea() +
                ", perimetro=" + getPerimetro() +
                '}';
    }
}
