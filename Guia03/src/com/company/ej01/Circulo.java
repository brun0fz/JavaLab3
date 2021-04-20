package com.company.ej01;

public class Circulo {

    private double radio = 1.0;
    private String color = "rojo";

    public Circulo() {
    }

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }




    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }


}
