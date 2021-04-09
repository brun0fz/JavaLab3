package com.company.test;

import com.company.ej03.Circulo2;
import com.company.ej03.Cuadrado;
import com.company.ej03.Rectangulo;

public class MainEj03 {

    public static void main(String[] args) {

        Circulo2 circulo = new Circulo2("Rojo", 2.5);
        Circulo2 circulo2 = new Circulo2(3);

        Rectangulo rectangulo = new Rectangulo("Azul", 6, 4);
        Rectangulo rectangulo2 = new Rectangulo(8, 5);

        System.out.println(circulo);
        System.out.println(circulo2);
        System.out.println(rectangulo);
        System.out.println(rectangulo2);

        Cuadrado cuadrado = new Cuadrado("verde", 4);
        Cuadrado cuadrado2 = new Cuadrado(6);

        System.out.println(cuadrado);
        System.out.println(cuadrado2);
    }

}
