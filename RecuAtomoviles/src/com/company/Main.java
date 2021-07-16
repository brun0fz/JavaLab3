package com.company;

import com.company.Clases.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Punto 2
        List<Vehiculo> vehiculoList = new ArrayList<>();

        Carrera carrera = new Carrera("Subaru", 500000, TipoVehiculo.CARRERA, 2, 250);
        Motocicleta motocicleta = new Motocicleta("Honda", 150000, TipoVehiculo.MOTOCICLETA, 300);
        Urbano urbano = new Urbano("Fiesta", 50000, TipoVehiculo.URBANO, 2, 4);
        Utilitario utilitario = new Utilitario("util", 25000, TipoVehiculo.UTILITARIO, 500, 150);

        vehiculoList.add(carrera);
        vehiculoList.add(motocicleta);
        vehiculoList.add(urbano);
        vehiculoList.add(utilitario);

        //Punto 2.A
        //vehiculoList.add(crearMotocicleta());

        //Punto 3
        for (Vehiculo vehiculo : vehiculoList) {
            System.out.println(vehiculo);
        }

        //Punto 4
        for (Vehiculo vehiculo : vehiculoList) {
            if (vehiculo.getPrecioMercado() > 100000) {
                System.out.println(vehiculo);
            }
        }

        //punto 5
        List<Carrera> carreraList = new ArrayList<>();
        List<Motocicleta> motocicletaList = new ArrayList<>();
        List<Urbano> urbanoList = new ArrayList<>();
        List<Utilitario> utilitarioList = new ArrayList<>();

        for (Vehiculo vehiculo : vehiculoList) {
            if (vehiculo instanceof Carrera) {
                carreraList.add((Carrera) vehiculo);
            } else if (vehiculo instanceof Motocicleta) {
                motocicletaList.add((Motocicleta) vehiculo);
            } else if (vehiculo instanceof Urbano) {
                urbanoList.add((Urbano) vehiculo);
            } else {
                utilitarioList.add((Utilitario) vehiculo);
            }
        }

        System.out.println("Cantidad de carrera: " + carreraList.size());
        System.out.println("Cantidad de motocicletas: " + motocicletaList.size());
        System.out.println("Cantidad de urbano: " + urbanoList.size());
        System.out.println("Cantidad de utilitarios: " + utilitarioList.size());


    }

    public static Motocicleta crearMotocicleta() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese nombre del modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Ingrese precio: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese cilindrada: ");
        double cilindrada = scanner.nextDouble();

        return new Motocicleta(modelo, precio, TipoVehiculo.MOTOCICLETA, cilindrada);
    }
}
