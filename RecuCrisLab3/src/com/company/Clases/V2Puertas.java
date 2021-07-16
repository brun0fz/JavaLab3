package com.company.Clases;

import java.util.UUID;

public class V2Puertas extends Vehiculo{

    public V2Puertas() {
    }

    public V2Puertas(String modelo, double kilometraje, String anio, double tarifaFija) {
        super(modelo, kilometraje, anio, tarifaFija);
    }

    @Override
    public String toString() {
        return "V2Puertas {" + super.toString();
    }
}
