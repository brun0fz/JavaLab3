package com.company.Clases;

import java.util.UUID;

public class Camioneta extends Vehiculo{

    public Camioneta() {
    }

    public Camioneta(String modelo, double kilometraje, String anio, double tarifaFija) {
        super(modelo, kilometraje, anio, tarifaFija);
    }

    @Override
    public String toString() {
        return "Camioneta {" + super.toString();
    }
}
