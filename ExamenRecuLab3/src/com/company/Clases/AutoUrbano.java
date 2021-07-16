package com.company.Clases;

public class AutoUrbano extends Automovil{

    private int cantMaxOcupantes;

    public AutoUrbano() {
    }

    public AutoUrbano(String modeloNombre, double precioMercado, String vehiculoTipo, double numMaxAirbags, int cantMaxOcupantes) {
        super(modeloNombre, precioMercado, vehiculoTipo, numMaxAirbags);
        this.cantMaxOcupantes = cantMaxOcupantes;
    }

    @Override
    public String toString() {
        return "AutoUrbano{" +
                "cantMaxOcupantes=" + cantMaxOcupantes +
                "} " + super.toString();
    }
}
