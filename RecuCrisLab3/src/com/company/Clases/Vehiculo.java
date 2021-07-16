package com.company.Clases;

import java.util.UUID;

public abstract class Vehiculo {

    private String modelo;
    private double kilometraje;
    private String anio;
    private UUID uuid;
    private double tarifaFija;

    public Vehiculo() {
    }

    public Vehiculo(String modelo, double kilometraje, String anio, double tarifaFija) {
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.anio = anio;
        this.uuid = UUID.randomUUID();
        this.tarifaFija = tarifaFija;
    }

    public String getModelo() {
        return modelo;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public double getTarifaFija() {
        return tarifaFija;
    }

    @Override
    public String toString() {
        return "modelo='" + modelo + '\'' +
                ", kilometraje=" + kilometraje +
                ", anio='" + anio + '\'' +
                ", uuid=" + uuid +
                ", tarifaFija=" + tarifaFija +
                '}';
    }


}
