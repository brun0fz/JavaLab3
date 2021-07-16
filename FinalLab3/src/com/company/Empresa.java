package com.company;

public class Empresa extends Cliente{

    private String nombreFantasia;

    public Empresa() {
    }

    public Empresa(String direccionDestino, String direccionOrigen, String telefono, String nombreFantasia) {
        super(direccionDestino, direccionOrigen, telefono);
        this.nombreFantasia = nombreFantasia;
    }

    public String getNombreFantasia() {
        return nombreFantasia;
    }

    public void setNombreFantasia(String nombreFantasia) {
        this.nombreFantasia = nombreFantasia;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombreFantasia='" + nombreFantasia + '\'' +
                "} " + super.toString();
    }
}
