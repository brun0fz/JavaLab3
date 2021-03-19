package com.company.test;

import com.company.clases.Rectangulo;

public class MainEj01 {

    public static void main(String[] args) {
        ///Ejercicio 01
        Rectangulo rectangulito = new Rectangulo(3,6);

        System.out.println("Alto: " + rectangulito.getAlto() + " Ancho: " + rectangulito.getAncho());

        System.out.println("Area: " + rectangulito.calcArea() + " Perimetro: " + rectangulito.calcPerimetro());

        rectangulito.setAlto(9);
        rectangulito.setAncho(7);

        System.out.println("Area: " + rectangulito.calcArea() + " Perimetro: " + rectangulito.calcPerimetro());

        Rectangulo rectangulito2 = new Rectangulo();

        System.out.println("Area: " + rectangulito2.calcArea() + " Perimetro: " + rectangulito2.calcPerimetro());

    }


}
