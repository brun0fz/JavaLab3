package com.company;

public class Particular extends Cliente{

    private String nombre;

    public Particular() {
    }

    public Particular(String direccionDestino, String direccionOrigen, String telefono, String nombre) {
        super(direccionDestino, direccionOrigen, telefono);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Particular{" +
                "nombre='" + nombre + '\'' +
                "} " + super.toString();
    }
}
