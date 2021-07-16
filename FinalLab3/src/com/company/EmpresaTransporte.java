package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class EmpresaTransporte implements Descuento {

    private List<Cliente> clienteList = new ArrayList<>();
    private List<Producto> productoList = new ArrayList<>();
    private List<Pedido> pedidoList = new ArrayList<>();

    public EmpresaTransporte() {
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public List<Pedido> getPedidoList() {
        return pedidoList;
    }


    public void realizarPedido() {

        Scanner scanner = new Scanner(System.in);
        Particular clienteParti = null;
        Empresa clienteEmpre = null;

        System.out.println("""
                Indique el tipo de cliente:\s
                1. Parituclar
                2. Empresa""");


        if (scanner.nextInt() == 1) {
            System.out.print("Ingrese nombre del cliente: ");
            scanner.nextLine();
            clienteParti = buscarClienteParti(scanner.nextLine());

            if (clienteParti == null) {

                clienteParti = (Particular) crearCliente(2);
            }
        } else {
            System.out.print("Ingrese nombre del cliente: ");
            scanner.nextLine();
            clienteEmpre = buscarClienteEmpre(scanner.nextLine());

            if (clienteEmpre == null) {
                clienteEmpre = (Empresa) crearCliente(1);
            }
        }

        boolean repeat = true;

        List<Producto> carrito = new ArrayList<>();


        while (repeat) {

            System.out.println("Elija los productos que desee enviar:\n");
            mostrarProductos();

            System.out.println("Ingrese el nombre del producto: ");

            Producto producto = buscarProducto(scanner.nextLine());

            if (producto != null) {
                carrito.add(producto);
            } else {
                System.out.println("El producto no existe.");
            }

            System.out.print("Desea agregar otro producto a tu lista? [s/n]: ");

            if (scanner.nextLine().equalsIgnoreCase("n")) {
                repeat = false;
            }
        }

        System.out.print("\n Ingrese los kilometros del envio: ");
        double kmRecorridos = scanner.nextDouble();

        double costo = calcularCostoPedido(carrito, kmRecorridos);


        System.out.println("El costo total (costo de producto + envío) es: $" + costo + " Confirma el pedido? [s/n]: ");

        scanner.nextLine();
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            Pedido pedido;

            if (clienteEmpre != null) {
                costo = realizarDescuento(costo);
                pedido = new Pedido(clienteEmpre, carrito, kmRecorridos, costo);
            } else {
                pedido = new Pedido(clienteParti, carrito, kmRecorridos, costo);
            }

            this.pedidoList.add(pedido);


        } else {
            System.out.println("El pedido ha sido cancelado.\n");
        }
    }

    @Override
    public double realizarDescuento(double costo) {
        return costo - (costo * 10 / 100);
        //return costo - (costo * 0.1);
    }

    public Particular buscarClienteParti(String nombre) {
        for (Cliente cliente : this.clienteList) {
            if (cliente instanceof Particular && ((Particular) cliente).getNombre().equalsIgnoreCase(nombre)) {
                return (Particular) cliente;
            }
        }
        return null;
    }

    public Empresa buscarClienteEmpre(String nombre) {
        for (Cliente cliente : this.clienteList) {
            if (cliente instanceof Empresa && ((Empresa) cliente).getNombreFantasia().equals(nombre)) {
                return (Empresa) cliente;
            }
        }
        return null;
    }


    public Boolean siExiste(Cliente cliente) {

        if (cliente instanceof Empresa) {
            for (Cliente clie : clienteList) {
                if (clie instanceof Empresa && ((Empresa) clie).getNombreFantasia().equalsIgnoreCase(((Empresa) cliente).getNombreFantasia())) {
                    return true;
                }
            }


        } else if (cliente instanceof Particular) {
            for (Cliente clie : clienteList) {
                if (clie instanceof Particular && ((Particular) clie).getNombre().equalsIgnoreCase(((Particular) cliente).getNombre())) {
                    return true;
                }
            }
        }

        return false;
    }

    public Cliente crearCliente(int com) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) {
            if (com == 1) {
                System.out.println("Cliente Empresa\n");

                System.out.print("Ingrese nombre de fantasia: ");
                String nombre = scanner.nextLine();

                System.out.print("Ingrese direccion de origen: ");
                String direOri = scanner.nextLine();

                System.out.print("Ingrese direccion de destino: ");
                String direDes = scanner.nextLine();

                System.out.print("Ingrese direccion telefono: ");
                String telefono = scanner.nextLine();

                Empresa empresa = new Empresa(direDes, direOri, telefono, nombre);

                if (!siExiste(empresa)) {
                    clienteList.add(empresa);
                    return empresa;
                }


            } else {
                System.out.println("Cliente Particular\n");


                System.out.print("Ingrese nombre: ");
                String nombre = scanner.nextLine();

                System.out.print("Ingrese direccion de origen: ");
                String direOri = scanner.nextLine();

                System.out.print("Ingrese direccion de destino: ");
                String direDes = scanner.nextLine();

                System.out.print("Ingrese direccion telefono: ");
                String telefono = scanner.nextLine();

                Particular particular = new Particular(direDes, direOri, telefono, nombre);

                if (!siExiste(particular)) {
                    clienteList.add(particular);
                    return particular;
                }
            }

            System.out.println("El cliente ya existe.");

        }


        return null;
    }


    public void mostrarProductos() {
        productoList.forEach(System.out::println);
    }

    public Producto buscarProducto(String nombre) {
        for (Producto producto : productoList) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }


    public double calcularCostoPedido(List<Producto> carrito, double kmRecorrido) {

        double costoPKg = 0;

        for (Producto producto : carrito) {
            if (producto.getPeso() < 10) {
                costoPKg += 15;
            } else if (producto.getPeso() >= 11 && producto.getPeso() < 25) {
                costoPKg += 30;
            } else {
                costoPKg += 45;
            }
        }

        return costoPKg + (kmRecorrido * 3);

    }


    public double calcularPromedioCostos() {
        double suma = 0;

        for (Pedido pedido : pedidoList) {
            suma += pedido.getCostoEnvio();
        }

        if (pedidoList.size() != 0) {
            return suma / pedidoList.size();
        }

        return 0;
    }


    public Cliente buscarMayorEnvios() {
        Cliente mayor = clienteList.get(0);

        for (int i = 1; i < clienteList.size(); i++) {
            if (clienteList.get(i).getCantPedidos() > mayor.getCantPedidos()) {
                mayor = clienteList.get(i);
            }
        }

        return mayor;
    }

}


