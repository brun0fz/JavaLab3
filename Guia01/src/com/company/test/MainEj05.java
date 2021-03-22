package com.company.test;

import com.company.clases.Hora;

public class MainEj05 {
    public static void main(String[] args) {

        Hora horita = new Hora(19,2,26);

        boolean ver = horita.veriHora();

        System.out.println(ver);

    }
}
