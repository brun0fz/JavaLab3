package com.company.Classes;

import java.time.LocalDate;

public class Alquiler {

    private static int cId = 1;

    private int id;
    private Pelicula pelicula;
    private Cliente cliente;
    private LocalDate fAlquiler;
    private LocalDate fDevolucion;

    public Alquiler(Pelicula pelicula, Cliente cliente) {
        this.id = cId++;
        this.pelicula = pelicula;
        this.cliente = cliente;
        this.fAlquiler = LocalDate.now();
        this.fDevolucion = fAlquiler.plusDays(2);
    }

    public int getId() {
        return id;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }


    public LocalDate getfDevolucion() {
        return fDevolucion;
    }


    @Override
    public String toString() {
        return "Alquiler{" +
                "ID='" + id + '\'' +
                ", pelicula=" + pelicula.getTitulo() +
                ", cliente=" + cliente +
                ", fAlquiler=" + fAlquiler +
                ", fDevolucion=" + fDevolucion +
                '}';
    }
}

