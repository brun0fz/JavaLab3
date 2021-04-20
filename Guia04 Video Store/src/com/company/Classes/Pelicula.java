package com.company.Classes;

import java.time.LocalDate;

public class Pelicula {

    private String titulo;
    private LocalDate fechaDeLanzamiento;
    private int duracion;
    private String genero;
    private String clasificacion;
    private String paisDeOrigen;
    private String descripcion;
    private int cantidad;

    private int contadorAlquiler=0;

    public Pelicula() {
    }

    public Pelicula(String titulo, LocalDate fechaDeLanzamiento, int duracion, String genero, String clasificacion, String paisDeOrigen, String descripcion, int cantidad) {
        this.titulo = titulo;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.duracion = duracion;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.paisDeOrigen = paisDeOrigen;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setContadorAlquiler(int contadorAlquiler) {
        this.contadorAlquiler = contadorAlquiler;
    }

    public int getContadorAlquiler() {
        return contadorAlquiler;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento +
                ", duracion=" + duracion +
                ", genero='" + genero + '\'' +
                ", clasificacion='" + clasificacion + '\'' +
                ", paisDeOrigen='" + paisDeOrigen + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", veces alquilada=" + contadorAlquiler +
                '}';
    }
}
