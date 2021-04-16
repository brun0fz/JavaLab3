package com.company;

import com.company.Classes.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        VideoStore donVideo = new VideoStore();

        Pelicula starWarsIII = new Pelicula("Star Wars III", LocalDate.of(2005, 5, 19), 140, Genero.ACCION, Clasificacion.PG13, "USA", "Revenge Of The Sith", 10);
        Pelicula starWarsV = new Pelicula("Star Wars V", LocalDate.of(1980, 6, 20), 124, Genero.ACCION, Clasificacion.PG, "USA", "The Empire Strikes Back", 8);

        donVideo.agregarPelicula(starWarsIII);
        donVideo.agregarPelicula(starWarsV);


        donVideo.mostrarPeliculas();


    }
}
