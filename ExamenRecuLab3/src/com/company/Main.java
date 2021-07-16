package com.company;

import com.company.Clases.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AutoCarreras autoCarreras = new AutoCarreras();
        AutoUrbano autoUrbano = new AutoUrbano();
        Motocicleta motocicleta = new Motocicleta();
        Utilitario utilitario = new Utilitario();


        //Punto 02
        List<Vehiculo> vehiculoList = new ArrayList<>();

        vehiculoList.add(autoCarreras);
        vehiculoList.add(autoUrbano);
        vehiculoList.add(motocicleta);
        vehiculoList.add(utilitario);

        // vehiculoList.add(crearMotocicleta());

        //Punto 03
        for (Vehiculo vehiculo : vehiculoList) {
            System.out.println(vehiculo);
        }

        //Punto 04
        int cant = 0;

        for (Vehiculo vehiculo : vehiculoList) {
            if (vehiculo.getPrecioMercado() > 100000) {
                cant++;
            }
        }

        System.out.println("Cantidad de vehiculos con un precio mayor a $100.000: " + cant);

        //Punto 05
        List<AutoCarreras> autoCarrerasList = new ArrayList<>();
        List<AutoUrbano> autoUrbanoList = new ArrayList<>();
        List<Motocicleta> motocicletaList = new ArrayList<>();
        List<Utilitario> utilitarioList = new ArrayList<>();

        for (Vehiculo vehiculo : vehiculoList) {
            if (vehiculo instanceof AutoCarreras) {
                autoCarrerasList.add((AutoCarreras) vehiculo);
            } else if (vehiculo instanceof AutoUrbano) {
                autoUrbanoList.add((AutoUrbano) vehiculo);
            } else if (vehiculo instanceof Motocicleta) {
                motocicletaList.add((Motocicleta) vehiculo);
            } else {
                utilitarioList.add((Utilitario) vehiculo);
            }
        }

        System.out.println(autoCarrerasList.size());
        System.out.println(autoUrbanoList.size());
        System.out.println(motocicletaList.size());
        System.out.println(utilitarioList.size());

    }


    public static Motocicleta crearMotocicleta() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre del modelo: ");
        String modeloNombre = scanner.next();

        System.out.println("Ingrese precio: ");
        double precio = scanner.nextDouble();

        System.out.println("Ingrese tipo de vehiculo: ");
        String vehiculoTipo = scanner.next();

        System.out.println("Ingrese cilindrada: ");
        double cilindrada = scanner.nextDouble();

        Motocicleta motocicleta = new Motocicleta(modeloNombre, precio, vehiculoTipo, cilindrada);

        return motocicleta;

    }
}
