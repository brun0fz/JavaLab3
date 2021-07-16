package com.company.Clases;

public class Carrera extends Automovil {

    private double maxSpeed;

    public Carrera() {
    }

    public Carrera(String nombreModelo, double precioMercado, TipoVehiculo tipoVehiculo, int numAirbags, double maxSpeed) {
        super(nombreModelo, precioMercado, tipoVehiculo, numAirbags);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "maxSpeed=" + maxSpeed +
                "} " + super.toString();
    }
}
