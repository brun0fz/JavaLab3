package com.company.Clases;

public abstract class Automovil extends Vehiculo {

    private int numAirbags;

    public Automovil() {
    }

    public Automovil(String nombreModelo, double precioMercado, TipoVehiculo tipoVehiculo, int numAirbags) {
        super(nombreModelo, precioMercado, tipoVehiculo);
        this.numAirbags = numAirbags;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "numAirbags=" + numAirbags +
                "} " + super.toString();
    }
}
