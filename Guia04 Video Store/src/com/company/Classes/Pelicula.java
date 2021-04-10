package com.company.Classes;

import java.time.LocalDate;

public class Pelicula {

    private String titulo;
    private LocalDate fechaDeLanzamiento;
    private int duracion;
    private String clasificacion;
    private String paisDeOrigen;
    private String descripcion;
    private int cantidad;

    public Pelicula() {
    }

    public Pelicula(String titulo, LocalDate fechaDeLanzamiento, int duracion, String clasificacion, String paisDeOrigen, String descripcion, int cantidad) {
        this.titulo = titulo;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
        this.paisDeOrigen = paisDeOrigen;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento +
                ", duracion=" + duracion +
                ", clasificacion='" + clasificacion + '\'' +
                ", paisDeOrigen='" + paisDeOrigen + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
