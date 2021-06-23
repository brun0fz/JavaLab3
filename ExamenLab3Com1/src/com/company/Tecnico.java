package com.company;

public class Tecnico extends Persona{

    private String especializacion;

    public Tecnico() {
    }

    public Tecnico(String nombre, String apellido, int edad, String localidad, String especializacion) {
        super(nombre, apellido, edad, localidad);
        this.especializacion = especializacion;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "especializacion='" + especializacion + '\'' +
                "} " + super.toString();
    }
}
