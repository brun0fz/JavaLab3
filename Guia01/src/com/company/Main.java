package com.company;

import com.company.ej01.Rectangulo;

public class Main {

    public static void main(String[] args) {

    Rectangulo rectangulito = new Rectangulo(4,6);

    double recAlto=rectangulito.getAlto();
    double recAncho=rectangulito.getAncho();

        System.out.println("Ancho: "+ recAncho)

    }
}
