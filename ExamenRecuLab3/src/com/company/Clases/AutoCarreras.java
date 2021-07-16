package com.company.Clases;

public class AutoCarreras extends Automovil{

    private double maxSpeed;


    public AutoCarreras() {
    }

    public AutoCarreras(String modeloNombre, double precioMercado, String vehiculoTipo, double numMaxAirbags, double maxSpeed) {
        super(modeloNombre, precioMercado, vehiculoTipo, numMaxAirbags);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "AutoCarreras{" +
                "maxSpeed=" + maxSpeed +
                "} " + super.toString();
    }
}
