package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Escritorio escritorioPC = new Escritorio();
        Impresora impresoraHP = new Impresora();
        Notebook macbook = new Notebook();
        Silla sillaGamer = new Silla();

        List<Producto> productoList = new ArrayList<>();

        productoList.add(escritorioPC);
        productoList.add(impresoraHP);
        productoList.add(macbook);
        productoList.add(sillaGamer);

        for (Producto producto: productoList) {
            System.out.println(producto.getClass());
        }




    }
}
