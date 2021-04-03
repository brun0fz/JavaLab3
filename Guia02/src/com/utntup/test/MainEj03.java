package com.utntup.test;

import com.utntup.ejercicio03.Cliente;
import com.utntup.ejercicio03.Cuenta;

import java.util.Arrays;

public class MainEj03 {

    public static void main(String[] args) {

        Cliente bruno = new Cliente("Bruno Fabrizio", 'M');

        System.out.println(bruno);

        Cuenta accBruno = new Cuenta(10000, bruno);

        System.out.println(accBruno);

        accBruno.extraer(2500);
        accBruno.extraer(2500);
        accBruno.extraer(8000);
        accBruno.depositar(2500);

       accBruno.mostrarOperaciones();

    }
}
