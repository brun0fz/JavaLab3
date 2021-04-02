package com.utntup.test;

import com.utntup.ejercicio02.Cliente;
import com.utntup.ejercicio02.Factura;
import com.utntup.ejercicio02.ItemVenta;

public class MainEj02 {

    public static void main(String[] args) {

        Cliente elMejor = new Cliente("Danilo", "danimdq@gmail.com", 15);

        System.out.println(elMejor);

        Factura facturita = new Factura(1500, elMejor);

        System.out.println("Total: " + facturita.getMontoTotal() + "\nDescuento: " + facturita.getMontoDesc());

        ///

        Cliente elPeor = new Cliente("Bruno", "bruno@gmail.com", 10);

        ItemVenta arroz = new ItemVenta("arroz", "integral", 85);
        ItemVenta leche = new ItemVenta("leche", "serenisima", 70);
        ItemVenta harina = new ItemVenta("harina", "0000", 65);

        ItemVenta[] carrito = new ItemVenta[]{arroz, leche, harina};

        Factura facturaElPeor = new Factura(elPeor, carrito);

        System.out.println(facturaElPeor);


    }
}