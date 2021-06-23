package com.company.Test;

import com.company.Clases.*;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    public static void main(String[] args) {

        //Se instancian los productos
        Escritorio escritorio = new Escritorio(100, "Escritorio PC", 500, 200, 75);
        Impresora impresora = new Impresora(100, "HP", 3500, "HP", 10.0);
        Notebook notebook = new Notebook(100, "Zenbook", 170000, "Asus", 16);
        Silla silla = new Silla(100, "Silla gamer", 40000, true);

        //Se crea una lista de productos
        List<Producto> productoList = new ArrayList<>();

        //Se agregan los productos a la lista
        productoList.add(notebook);
        productoList.add(escritorio);
        productoList.add(impresora);
        productoList.add(silla);

        ///Ejercicio 03
        for (Producto producto : productoList) {
            if (producto instanceof Escritorio) {
                System.out.println("Soy un escritorio!");
            } else if (producto instanceof Impresora) {
                System.out.println("Soy una impresora!");
            } else if (producto instanceof Notebook) {
                System.out.println("Soy una notebook!");
            } else {
                System.out.println("Soy una silla!");
            }
        }

        //Ejercicio 04
        System.out.println(silla.aplicarDescuento(15));
        System.out.println(impresora.aplicarDescuento(10));

        //Ejercicio 05
        for(Producto producto : productoList){
            producto.actualizarPrecio();
        }

    }
}
