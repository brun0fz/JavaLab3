package com.company.Classes;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class VideoStore {

    private List<Pelicula> peliculasList = new ArrayList<>();
    private List<Cliente> clientesList = new ArrayList<>();
    private List<Alquiler> alquileresList = new ArrayList<>();

    public VideoStore() {
    }

    public VideoStore(List<Pelicula> peliculasList, List<Cliente> clientesList, List<Alquiler> alquileresList) {
        this.peliculasList = peliculasList;
        this.clientesList = clientesList;
        this.alquileresList = alquileresList;
    }

    //Peliculas
    public void nuevaPelicula(Pelicula pelicula) {
        peliculasList.add(pelicula);
    }

    public void mostrarPeliculas() {
        System.out.println("\nCatalogo de peliculas \n");
        for (Pelicula pelicula : peliculasList) {
            System.out.println(pelicula);
        }
    }

    public Pelicula buscarPelicula(String nombrePelicula) {
        for (Pelicula pelicula : peliculasList) {
            if (pelicula.getTitulo().equalsIgnoreCase(nombrePelicula)) {
                return pelicula;
            }
        }
        return null;
    }

    public List<Pelicula> getPeliculasList() {
        return peliculasList;
    }

    //Clientes
    public void nuevoCliente(String nombre, String telefono, String direccion) {
        Cliente cliente = new Cliente(nombre, telefono, direccion);
        clientesList.add(cliente);
    }

    public Cliente buscarCliente(String nombreCliente) {
        for (Cliente cliente : clientesList) {
            if (cliente.getNombre().equalsIgnoreCase(nombreCliente)) {
                return cliente;
            }
        }
        return null;
    }

    public void mostrarClientes() {
        System.out.println("\nClientes: \n");
        clientesList.stream().forEach(System.out::println);
    }

    public List<Cliente> getClientesList() {
        return clientesList;
    }

    ///Alquileres
    public Alquiler buscarAlquiler(int id) {
        for (Alquiler alquiler : alquileresList) {
            if (alquiler.getId() == id) {
                return alquiler;
            }
        }
        return null;
    }

    public void eliminarAlquiler(int id) {
        /*for (var alquiler : alquileresList) {
            if (alquiler.getId() == id) {
                alquileresList.remove(alquiler);
            }
        }*/

        alquileresList.removeIf(alquiler -> alquiler.getId() == id);
    }

    public void nuevoAlquiler(String nombreCliente, String nombrePelicula) {

        Pelicula pelicula = buscarPelicula(nombrePelicula);
        Cliente cliente = buscarCliente(nombreCliente);

        if (pelicula != null && pelicula.getCantidad() >= 0) {

            pelicula.setCantidad(pelicula.getCantidad() - 1);

            if (cliente != null) {

                Alquiler alquiler = new Alquiler(pelicula, cliente);
                alquileresList.add(alquiler);
                cliente.listaAlquieres.add(alquiler);
                pelicula.setContadorAlquiler(pelicula.getContadorAlquiler() + 1);

            } else {

                //throw new RuntimeException("No existe el cliente");
                System.out.println("El cliente no existe");
            }

        } else {

            System.out.println("La pelicula no esta disponible.");

        }

    }

    public void mostrarAlquileres() {
        System.out.println("\nAlquileres vigentes:\n");
        for (Alquiler alquiler : alquileresList) {
            System.out.println(alquiler);
        }
    }

    public void mostrarAlquieresCliente(String nombreCliente) {
        System.out.println("Alquieleres de " + nombreCliente);
        Cliente cliente = buscarCliente(nombreCliente);
        for (Alquiler alquiler : cliente.listaAlquieres) {
            System.out.println(alquiler);
        }
    }

    public void devolucion(int alquilerId) {
        Alquiler alquiler = buscarAlquiler(alquilerId);
        if (alquiler != null) {
            String nombrePelicula = alquiler.getPelicula().getTitulo();
            Pelicula pelicula = buscarPelicula(nombrePelicula);
            pelicula.setCantidad(pelicula.getCantidad() + 1);
            eliminarAlquiler(alquilerId);
        }
    }

    public void mostrarDevolucionesDelDia() {
        System.out.println("Devoluciones del dia:\n");
        for (Alquiler alquiler : alquileresList) {
            if (alquiler.getfDevolucion().equals(LocalDate.now())) {
                System.out.println(alquiler);
            }
        }
    }

    public List<Pelicula> ordenarPeliculas() {
        List<Pelicula> pelisOrdenadas = peliculasList;

        return pelisOrdenadas.stream()
                .sorted((Pelicula p1, Pelicula p2) -> p2.getContadorAlquiler() - p1.getContadorAlquiler())
                .collect(Collectors.toList());
    }

    public void mostrarPelisOrd(){
        List<Pelicula> pelisOrd = ordenarPeliculas();

        System.out.println("\nPeliculas ordenadas por popularidad: \n");

        for(Pelicula pelicula : pelisOrd){
            System.out.println(pelicula);
        }
    }


    public void mostrarPelisGenero(String genero){
        List<Pelicula> pelisOrd = ordenarPeliculas();

        System.out.println("\nPeliculas de genero: " + genero);

        for(Pelicula pelicula : pelisOrd){
            if(pelicula.getGenero() == genero){
                System.out.println(pelicula);
            }
        }
    }




}
