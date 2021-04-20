package com.company;

public class CEmpresa extends Cliente{

    private String nombreFantasia;

    public CEmpresa() {
    }

    public CEmpresa(String direccion, String telefono, int cantVentas, String nombreFantasia) {
        super(direccion, telefono, cantVentas);
        this.nombreFantasia = nombreFantasia;
    }

    public String getNombreFantasia() {
        return nombreFantasia;
    }

    public void setNombreFantasia(String nombreFantasia) {
        this.nombreFantasia = nombreFantasia;
    }


}
