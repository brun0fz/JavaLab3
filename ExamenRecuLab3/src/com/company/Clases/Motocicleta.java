package com.company.Clases;

public class Motocicleta extends Vehiculo{

    private double cilindrada;

    public Motocicleta() {
    }

    public Motocicleta(String modeloNombre, double precioMercado, String vehiculoTipo, double cilindrada) {
        super(modeloNombre, precioMercado, vehiculoTipo);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "cilindrada=" + cilindrada +
                "} " + super.toString();
    }
}
