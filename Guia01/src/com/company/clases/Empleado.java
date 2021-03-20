package com.company.clases;

public class Empleado {

    private int dni;
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado() {
    }

    public Empleado(int dni, String nombre, String apellido, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double salarioAnual() {
        return this.salario * 12;
    }

    public void aumentarSalario(double porcentaje) {
        this.salario = this.salario + ((this.salario * porcentaje) / 100);
    }

    /*///Pedorrus
    public void getEmpleado() {
        System.out.printf("Empleado[dni=%s, nombre=%s, apellido=%s, salario=%s]\n", this.dni, this.nombre, this.apellido, this.salario);
    }*/

    /*///Devolviendo un string directamente
    public String getEmpleadoString() {
        return "Empleado[dni=" + this.dni + " nombre=" + this.nombre + " apellido=" + this.apellido + " salario=" + this.salario + "]";
    }*/

    ///FUNCION TO STRING

    @Override
    public String toString() {
        return "Empleado{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario=" + salario +
                '}';
    }
}
