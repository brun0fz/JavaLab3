package com.company.Clases;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpresaAlquiler {

    private List<Alquiler> alquilerList = new ArrayList<>();
    private List<Vehiculo> vehiculoList = new ArrayList<>();
    private List<Cliente> clienteList = new ArrayList<>();
    private List<Sucursal> sucursalList = new ArrayList<>();


    public EmpresaAlquiler() {
    }

    public List<Alquiler> getAlquilerList() {
        return alquilerList;
    }

    public List<Vehiculo> getVehiculoList() {
        return vehiculoList;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public List<Sucursal> getSucursalList() {
        return sucursalList;
    }


    public void generarAlquiler() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Generar Alquiler\n");
        System.out.println("Ingrese dni del cliente: ");

        Cliente cliente = buscarCliente(scanner.next());

        if (cliente == null) {
            System.out.println("El cliente no existe, ingrese sus datos.");
            cliente = crearCliente();
            System.out.println("Cliente generado!\n ");
        }

        if (cliente.isRegistro()) {

            boolean repeat = true;

            while (repeat) {
                System.out.println("Seleccione el vehiculo: \n");

                mostrarVehiculos();

                System.out.println("Ingrese el modelo que desea elegir: ");
                scanner.nextLine();
                Vehiculo vehiculo = buscarVehiculo(scanner.next());

                if (vehiculo != null) {
                    repeat = false;

                    boolean repeat3 = true;

                    while (repeat3) {
                        System.out.println("Seleccione la sucursal: \n");

                        mostrarSucursales();

                        System.out.println("Ingrese la direccion de la sucursal: ");
                        scanner.nextLine();
                        Sucursal sucursal = buscarSucursal(scanner.nextLine());

                        if (sucursal != null) {
                            repeat3 = false;

                            Alquiler alquiler = new Alquiler(cliente, vehiculo, sucursal, LocalDate.now());
                            this.alquilerList.add(alquiler);

                            System.out.println("Alquiler generado!");

                        } else {
                            System.out.println("La sucursal no existe.\n");
                        }
                    }
                } else {
                    System.out.println("El modelo ingresado no existe, vuelvalo a ingresar.\n");
                }
            }
        } else {
            System.out.println("Necesita registro. Volve en 3 meses. Chau");
        }
    }


    public void devolverAlquiler() {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) {

            System.out.println("Devolver Alquiler\n");
            System.out.println("Ingrese DNI del cliente: ");
            Alquiler alquiler = buscarAlquiler(scanner.next());

            if (alquiler != null) {
                repeat = false;

                alquiler.setFin(LocalDate.now());
                alquiler.setCosto(calcularCosto(alquiler));

                boolean repeat2 = true;

                while (repeat2) {

                    System.out.println("Seleccione la sucursal de destino");
                    mostrarSucursales();

                    System.out.println("Ingrese direccion de la sucursal");
                    scanner.nextLine();

                    Sucursal sucursal = buscarSucursal(scanner.nextLine());

                    if (sucursal != null) {
                        repeat2 = false;
                        alquiler.setSucursalDestino(sucursal);

                    } else {
                        System.out.println("La sucursal no existe.\n");
                    }
                }

                System.out.println("Alquiler devuelto!\n Usted debe pagar: $" + alquiler.getCosto());


            } else {
                System.out.println("No existe el alquiler.\n");
            }


        }

    }


    public Cliente buscarCliente(String dni) {
        for (Cliente cliente : this.clienteList) {
            if (cliente.getDni().equals(dni)) {
                return cliente;
            }
        }
        return null;
    }

    public void mostrarVehiculos() {
        for (Vehiculo vehiculo : this.vehiculoList) {
            System.out.println(vehiculo);
        }
    }

    public Vehiculo buscarVehiculo(String modelo) {
        for (Vehiculo vehiculo : this.vehiculoList) {
            if (vehiculo.getModelo().equalsIgnoreCase(modelo)) {
                return vehiculo;
            }
        }
        return null;
    }


    public void mostrarSucursales() {
        for (Sucursal sucursal : this.sucursalList) {
            System.out.println(sucursal);
        }
    }

    public Sucursal buscarSucursal(String direccion) {
        for (Sucursal sucursal : this.sucursalList) {
            if (sucursal.getDireccion().equalsIgnoreCase(direccion)) {
                return sucursal;
            }
        }
        return null;
    }


    public Cliente crearCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre y apellido: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese DNI:  ");
        String dni = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, dni, true);
        this.clienteList.add(cliente);

        return cliente;
    }

    public Alquiler buscarAlquiler(String dni) {
        for (Alquiler alquiler : alquilerList) {
            if (alquiler.getCliente().getDni().equals(dni)) {
                return alquiler;
            }
        }
        return null;
    }

    public double calcularCosto(Alquiler alquiler) {
        return calcularCostoDias(alquiler) + calcularCostoKm(alquiler.getVehiculo());
    }


    public double calcularCostoKm(Vehiculo vehiculo) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese KM acutales: ");
        double kmActuales = scanner.nextDouble();

        double kmRecorridos = kmActuales - vehiculo.getKilometraje();

        vehiculo.setKilometraje(kmActuales);

        return kmRecorridos * 50;

    }

    public double calcularCostoDias(Alquiler alquiler) {

        Period period = Period.between(alquiler.getInicio(), alquiler.getFin());
        int periodo = period.getDays();

        if (periodo == 0) {
            periodo = 1;
        }

        return periodo * alquiler.getVehiculo().getTarifaFija();
    }


    /// punto 3
    public void mostrarAlquilerMayorCosto() {

        if (alquilerList != null) {
            Alquiler alquilerMayor = alquilerList.get(0);

            for (int i = 0; i < this.alquilerList.size(); i++) {
                if (alquilerList.get(i).getCosto() > alquilerMayor.getCosto()) {
                    alquilerMayor = alquilerList.get(i);
                }
            }

            System.out.println("Alquiler con mayor costo:\n");
            System.out.println(alquilerMayor);

        } else {
            System.out.println("No hay alquileres.");
        }
    }

    ///punto 4
    public void cantAlquiPorTipo() {
        int V2 = 0, V4 = 0, C = 0;

        for (Alquiler alquiler : alquilerList) {
            if (alquiler.getVehiculo() instanceof V2Puertas) {
                V2++;
            } else if (alquiler.getVehiculo() instanceof V4Puertas) {
                V4++;
            } else {
                C++;
            }
        }

        System.out.println("Cantida de alquileres:\n" +
                "Vehiculos de 2 puertas: " + V2 + "\n" +
                "Vehiculos de 4 puertas: " + V4 + "\n" +
                "Camionetas: " + C + "\n");
    }

}
