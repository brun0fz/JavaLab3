package com.company;

public abstract class Cliente {

    private String direccionDestino;
    private String direccionOrigen;
    private String telefono;
    private int cantPedidos=0;

    public Cliente() {
    }

    public Cliente(String direccionDestino, String direccionOrigen, String telefono) {
        this.direccionDestino = direccionDestino;
        this.direccionOrigen = direccionOrigen;
        this.telefono = telefono;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    public String getDireccionOrigen() {
        return direccionOrigen;
    }

    public void setDireccionOrigen(String direccionOrigen) {
        this.direccionOrigen = direccionOrigen;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCantPedidos() {
        return cantPedidos;
    }

    public void setCantPedidos(int cantPedidos) {
        this.cantPedidos = cantPedidos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "direccionDestino='" + direccionDestino + '\'' +
                ", direccionOrigen='" + direccionOrigen + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cantPedidos=" + cantPedidos +
                '}';
    }
}
