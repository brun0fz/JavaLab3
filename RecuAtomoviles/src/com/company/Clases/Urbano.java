package com.company.Clases;

public class Urbano extends Automovil {

    private int cantMAXOcupantes;

    public Urbano() {
    }

    public Urbano(String nombreModelo, double precioMercado, TipoVehiculo tipoVehiculo, int numAirbags, int cantMAXOcupantes) {
        super(nombreModelo, precioMercado, tipoVehiculo, numAirbags);
        this.cantMAXOcupantes = cantMAXOcupantes;
    }

    @Override
    public String toString() {
        return "Urbano{" +
                "cantMAXOcupantes=" + cantMAXOcupantes +
                "} " + super.toString();
    }
}
