package com.company.ej02;

public class Empleado {

    int dni;
    String nombre;
    String apellido;
    double salario;

    public Empleado() {
    }

    public Empleado(int dni, String nombre, String apellido, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public double salarioAnual() {
        return this.salario * 12;
    }

    public void aumentarSalario(double porcentaje) {
        this.salario = this.salario + ((this.salario * porcentaje) / 100);
    }

    public void mostrarEmpleado() {
        System.out.printf("Empleado[dni=%s, nombre=%s, apellido=%s, salario=%s]\n", this.dni, this.nombre, this.apellido, this.salario);
    }


}
