package com.company;

import com.company.Classes.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        VideoStore donVideo = new VideoStore();

        Pelicula starWarsIII = new Pelicula("Star Wars III", LocalDate.of(2005, 5, 19), 140, Genero.ACCION, Clasificacion.PG_13, "USA", "Revenge Of The Sith", 10);
        Pelicula starWarsV = new Pelicula("Star Wars V", LocalDate.of(1980, 6, 20), 124, Genero.ACCION, Clasificacion.PG, "USA", "The Empire Strikes Back", 8);

        donVideo.nuevaPelicula(starWarsIII);
        donVideo.nuevaPelicula(starWarsV);

        donVideo.nuevoCliente("Bruno Fabrizio", "4711045", "Millan 828");
        donVideo.nuevoCliente("Carlos Miranda", "5655443", "Luro 3200");

        donVideo.nuevoAlquiler("nico", "star wars III");
        donVideo.nuevoAlquiler("Bruno Fabrizio", "Star Wars V");
        donVideo.nuevoAlquiler("Bruno Fabrizio", "Star Wars III");

        donVideo.mostrarAlquileres();

        //donVideo.devolucion(1);

        donVideo.mostrarDevolucionesDelDia();

        donVideo.mostrarAlquieresCliente("Bruno Fabrizio");

        donVideo.mostrarPeliculas();

        System.out.println(donVideo.ordenarPeliculas());


    }
}
