package com.company.test;

import com.company.clases.Empleado;

public class MainEj02 {

    public static void main(String[] args) {
        ///Ejercicio 02

        Empleado empleCarlos = new Empleado(23456345, "Carlos", "Gutierrez", 25000);
        Empleado empleAna = new Empleado(34234123, "Ana", "Sanchez", 27500);

        String ana = empleAna.getEmpleado();

        System.out.println(empleCarlos.getEmpleado());
        System.out.println(ana);

        empleCarlos.aumentarSalario(15);

        System.out.println("Salario Anual: " + empleCarlos.salarioAnual());
    }

}
