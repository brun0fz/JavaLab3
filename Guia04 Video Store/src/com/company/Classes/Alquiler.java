package com.company.Classes;

import java.time.LocalDate;
import java.util.UUID;

public class Alquiler {

    private static int cId=1;

    private int id;
    private Pelicula pelicula;
    private Cliente cliente;
    private LocalDate fAlquiler;
    private LocalDate fDevolucion;

    public Alquiler() {
    }

    public Alquiler(Pelicula pelicula, Cliente cliente) {
        this.id = cId++;
        this.pelicula = pelicula;
        this.cliente = cliente;
        this.fAlquiler = LocalDate.now();
        this.fDevolucion = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getfAlquiler() {
        return fAlquiler;
    }

    public void setfAlquiler(LocalDate fAlquiler) {
        this.fAlquiler = fAlquiler;
    }

    public LocalDate getfDevolucion() {
        return fDevolucion;
    }

    public void setfDevolucion(LocalDate fDevolucion) {
        this.fDevolucion = fDevolucion;
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

