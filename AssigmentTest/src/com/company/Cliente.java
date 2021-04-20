package com.company;

public class Cliente {

    private String direccion;
    private String telefono;
    private int cantVentas;

    public Cliente() {
    }

    public Cliente(String direccion, String telefono, int cantVentas) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.cantVentas = cantVentas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCantVentas() {
        return cantVentas;
    }

    public void setCantVentas(int cantVentas) {
        this.cantVentas = cantVentas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cantVentas=" + cantVentas +
                '}';
    }
}
