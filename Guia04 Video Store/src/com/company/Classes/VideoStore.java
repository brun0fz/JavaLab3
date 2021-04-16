package com.company.Classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VideoStore {

    private List<Pelicula> peliculasList = new ArrayList<>();
    private List<Usuario> usuariosList = new ArrayList<>();
    private List<Alquiler> alquileresList = new ArrayList<>();


    public VideoStore() {
    }

    public void agregarPelicula(Pelicula pelicula){
        peliculasList.add(pelicula);
    }

    
    public void mostrarPeliculas(){
        for(var pelicula : peliculasList){
            System.out.println(pelicula);
        }
    }



}
