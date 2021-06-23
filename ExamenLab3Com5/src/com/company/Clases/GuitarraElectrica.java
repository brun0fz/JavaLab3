package com.company.Clases;

public class GuitarraElectrica extends Cuerda implements Amplificacion{

    String modelo;

    public GuitarraElectrica() {
    }

    public GuitarraElectrica(double precio, String marca, String modelo) {
        super(precio, marca, 6);
        this.modelo = modelo;
    }

    @Override
    public void sonidoAmplificado() {
        System.out.println(this.getClass() + ": SONIDO AMPLIFICADO");
    }

    @Override
    public String toString() {
        return "GuitarraElectrica{" +
                "modelo='" + modelo + '\'' +
                "} " + super.toString();
    }
}
