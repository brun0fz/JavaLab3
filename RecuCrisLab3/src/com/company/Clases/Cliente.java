package com.company.Clases;

public class Cliente {

    private String nombreCompleto;
    private String dni;
    private boolean registro;

    public Cliente() {
    }

    public Cliente(String nombreCompleto, String dni, boolean registro) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.registro = registro;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean isRegistro() {
        return registro;
    }

    public void setRegistro(boolean registro) {
        this.registro = registro;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", dni='" + dni + '\'' +
                ", registro=" + registro +
                '}';
    }
}
