package com.company.ej01;

public class Cilindro extends Circulo {

    private double altura = 1.0;

    public Cilindro() {
        super();
    }

    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVolumen() {
        return super.getArea() * altura;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * super.getRadio() * (super.getRadio() + altura);
    }

    @Override
    public String toString() {
        return "Cilindro: subclase de " + super.toString() + " altura=" + altura + " area= " + getArea();
    }

}
