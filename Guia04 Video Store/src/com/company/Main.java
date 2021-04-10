package com.company;

import com.company.Classes.Pelicula;
import com.company.Classes.Usuario;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        System.out.println("DON VIDEO");

        Pelicula starWarsIII = new Pelicula("Star Wars III", LocalDate.of(2005,5,19), 140, "PG-13", "USA", "Revenge Of The Sith", 10);
        Pelicula starWarsV = new Pelicula("Star Wars V", LocalDate.of(1980,6,20), 124, "PG", "USA", "The Empire Strikes Back", 8);
        System.out.println(starWarsIII);
        System.out.println(starWarsV);

    }
}
