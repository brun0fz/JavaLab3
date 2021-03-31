package com.utntup.test;

import com.utntup.ejercicio02.Cliente;
import com.utntup.ejercicio02.Factura;

public class MainEj02 {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Bruno Fabrizio", "brunofabrizio15@gmail.com", 15);

        System.out.println(cliente1);

        Factura facturaC1 = new Factura(790, cliente1);

        System.out.println("El monto total es de $" + facturaC1.getMontoTotal() + " Y con su " + cliente1.getDescuento() + "% de descuento le queda en: " + facturaC1.getMontoDesc());

        System.out.println(facturaC1);

    }

}