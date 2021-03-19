package com.company.clases;

public class Cuenta {

    private int id;
    private String nombre;
    private double balance;


    public Cuenta() {
    }

    public Cuenta(int id, String nombre, double balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public double credito(double deposito) {
        return this.balance += deposito;
    }

    public double debito(double sustraccion) {
        if (this.balance - sustraccion >= 0) {
            this.balance -= sustraccion;
        } else {
            System.out.println("El dinero en la cuenta no es suficiente para cubrir la sustraccion");
        }

        return this.balance;
    }

    public String getCuenta() {
        return "Cuenta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", balance=" + balance +
                '}';
    }
}
