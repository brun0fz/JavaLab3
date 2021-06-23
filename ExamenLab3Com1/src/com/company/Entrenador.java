package com.company;

public class Entrenador extends Persona{

    private int aniosExp;

    public Entrenador() {
    }

    public Entrenador(String nombre, String apellido, int edad, String localidad, int aniosExp) {
        super(nombre, apellido, edad, localidad);
        this.aniosExp = aniosExp;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "aniosExp=" + aniosExp +
                "} " + super.toString();
    }
}
