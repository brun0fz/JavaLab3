package com.company.Clases;

public abstract class Automovil extends Vehiculo{

    private double numMaxAirbags;

    public Automovil() {
    }

    public Automovil(String modeloNombre, double precioMercado, String vehiculoTipo, double numMaxAirbags) {
        super(modeloNombre, precioMercado, vehiculoTipo);
        this.numMaxAirbags = numMaxAirbags;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "numMaxAirbags=" + numMaxAirbags +
                "} " + super.toString();
    }
}
