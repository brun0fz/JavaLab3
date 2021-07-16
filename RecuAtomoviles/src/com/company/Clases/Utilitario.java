package com.company.Clases;

public class Utilitario extends Vehiculo{

    private double kgMAX;
    private double altura;

    public Utilitario() {
    }

    public Utilitario(String nombreModelo, double precioMercado, TipoVehiculo tipoVehiculo, double kgMAX, double altura) {
        super(nombreModelo, precioMercado, tipoVehiculo);
        this.kgMAX = kgMAX;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Utilitario{" +
                "kgMAX=" + kgMAX +
                ", altura=" + altura +
                "} " + super.toString();
    }
}
