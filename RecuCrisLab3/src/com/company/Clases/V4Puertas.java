package com.company.Clases;

import java.util.UUID;

public class V4Puertas extends Vehiculo{
    public V4Puertas() {
    }

    public V4Puertas(String modelo, double kilometraje, String anio, double tarifaFija) {
        super(modelo, kilometraje, anio, tarifaFija);
    }

    @Override
    public String toString() {
        return "V4Puertas {" + super.toString();
    }
}
