package com.company.clases;

public class Rectangulo {

    //Atributos

    private double ancho = 1.0;
    private double alto = 1.0;

    //Constructores
    public Rectangulo() {

    }

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    //Metodos
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double calcArea() {
        return this.ancho * this.alto;
    }

    public double calcPerimetro() {
        return 2 * (this.ancho + this.alto);
    }

}
