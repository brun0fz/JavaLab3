package com.company;

public class CParticular extends Cliente{

    private String nombre;

    public CParticular() {
    }

    public CParticular(String direccion, String telefono, int cantVentas, String nombre) {
        super(direccion, telefono, cantVentas);
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
        return "CParticular{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
