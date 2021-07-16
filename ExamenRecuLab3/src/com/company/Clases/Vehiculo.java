package com.company.Clases;

public abstract class Vehiculo {

    private String modeloNombre;
    private double precioMercado;
    private String vehiculoTipo;

    public Vehiculo() {
    }

    public Vehiculo(String modeloNombre, double precioMercado, String vehiculoTipo) {
        this.modeloNombre = modeloNombre;
        this.precioMercado = precioMercado;
        this.vehiculoTipo = vehiculoTipo;
    }

    public double getPrecioMercado() {
        return precioMercado;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modeloNombre='" + modeloNombre + '\'' +
                ", precioMercado=" + precioMercado +
                ", vehiculoTipo='" + vehiculoTipo + '\'' +
                '}';
    }
}
