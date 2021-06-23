package com.company;

public abstract class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String localidad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String localidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
