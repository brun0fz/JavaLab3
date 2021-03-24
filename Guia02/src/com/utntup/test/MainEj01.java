package com.utntup.test;

import com.utntup.ejercicio01.Autor;
import com.utntup.ejercicio01.Libro;

public class MainEj01 {
    public static void main(String[] args) {

        Autor autorJoshua = new Autor("Joshua", "Bloch", "joshua@email.com", 'm');
        Libro libroJava = new Libro("Effective Java", 450, 150, autorJoshua);

        System.out.println(autorJoshua);
        System.out.println(libroJava);

    }
}
