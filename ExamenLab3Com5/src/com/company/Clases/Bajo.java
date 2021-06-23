package com.company.Clases;

public class Bajo extends Cuerda implements Amplificacion{

    String modelo;

    public Bajo() {
    }

    public Bajo(double precio, String marca, String modelo) {
        super(precio, marca, 4);
        this.modelo = modelo;
    }

    @Override
    public void sonidoAmplificado() {
        System.out.println(this.getClass() + ": SONIDO AMPLIFICADO");
    }

    @Override
    public String toString() {
        return "Bajo{" +
                "modelo='" + modelo + '\'' +
                "} " + super.toString();
    }
}
