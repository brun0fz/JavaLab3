package com.company.Clases;

public class Utilitario extends Vehiculo{

    private double maxKg;
    private double altura;

    public Utilitario() {
    }

    public Utilitario(String modeloNombre, double precioMercado, String vehiculoTipo, double maxKg, double altura) {
        super(modeloNombre, precioMercado, vehiculoTipo);
        this.maxKg = maxKg;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Utilitario{" +
                "maxKg=" + maxKg +
                ", altura=" + altura +
                "} " + super.toString();
    }
}
