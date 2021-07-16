package com.company.Clases;

public class Motocicleta extends Vehiculo {

    private double cilindrada;

    public Motocicleta() {
    }

    public Motocicleta(String nombreModelo, double precioMercado, TipoVehiculo tipoVehiculo, double cilindrada) {
        super(nombreModelo, precioMercado, tipoVehiculo);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "cilindrada=" + cilindrada +
                "} " + super.toString();
    }
}
