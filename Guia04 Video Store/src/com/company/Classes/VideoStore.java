package com.company.Classes;

import java.time.LocalDate;
import java.util.*;

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
        for (var pelicula : peliculasList) {
            System.out.println(pelicula);
        }
    }

    public Pelicula buscarPelicula(String nombrePelicula) {
        for (var pelicula : peliculasList) {
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

    public Cliente crearCliente() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        String nombre = keyboard.nextLine();
        System.out.print("Ingrese telefono: ");
        String telefono = keyboard.nextLine();
        System.out.print("Ingrese direccion: ");
        String direccion = keyboard.nextLine();

        Cliente cliente = new Cliente(nombre, telefono, direccion);

        return cliente;
    }

    public Cliente buscarCliente(String nombreCliente) {
        for (var cliente : clientesList) {
            if (cliente.getNombre().equalsIgnoreCase(nombreCliente)) {
                return cliente;
            }
        }
        return null;
    }

    public void mostrarClientes() {
        System.out.println("\nClientes: \n");
        for (var cliente : clientesList) {
            System.out.println(cliente);
        }
    }

    public List<Cliente> getClientesList() {
        return clientesList;
    }

    ///Alquileres
    public Alquiler buscarAlquiler(int id) {
        for (var alquiler : alquileresList) {
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

            } else {

                System.out.println("El cliente no existe, se va a crear uno nuevo");

                Cliente nuevoCliente = crearCliente();
                clientesList.add(nuevoCliente);

                Alquiler alquiler = new Alquiler(pelicula, nuevoCliente);
                alquileresList.add(alquiler);
            }

        } else {

            System.out.println("La pelicula no esta disponible.");

        }

    }

    public void mostrarAlquileres() {
        System.out.println("\nAlquileres vigentes:\n");
        for (var alquiler : alquileresList) {
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

    public void mostrarDevolucionesDelDia(){
        System.out.println("Devoluciones del dia:\n");
        for(var alquiler : alquileresList){
            if(alquiler.getfDevolucion() == LocalDate.now()){
                System.out.println(alquiler);
            }
        }
    }



}
