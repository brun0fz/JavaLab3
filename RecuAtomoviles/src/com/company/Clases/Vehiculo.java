package com.company.Clases;

public abstract class Vehiculo {

    private String nombreModelo;
    private double precioMercado;
    private TipoVehiculo tipoVehiculo;

    public Vehiculo() {
    }

    public Vehiculo(String nombreModelo, double precioMercado, TipoVehiculo tipoVehiculo) {
        this.nombreModelo = nombreModelo;
        this.precioMercado = precioMercado;
        this.tipoVehiculo = tipoVehiculo;
    }

    public double getPrecioMercado() {
        return precioMercado;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nombreModelo='" + nombreModelo + '\'' +
                ", precioMercado=" + precioMercado +
                ", tipoVehiculo='" + tipoVehiculo + '\'' +
                '}';
    }
}
