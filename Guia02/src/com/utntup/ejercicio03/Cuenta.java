package com.utntup.ejercicio03;

import java.util.Arrays;
import java.util.UUID;

public class Cuenta {

    private static final int OPMAX = 10;

    private UUID id;
    private double balance;

    private Cliente cliente;


    private int contadorOP = 0;
    private String[] operaciones = new String[OPMAX];

    public Cuenta() {
    }

    public Cuenta(double balance, Cliente cliente) {
        this.id = UUID.randomUUID();
        this.balance = balance;
        this.cliente = cliente;
    }


    public String[] getOperaciones() {
        return operaciones;
    }

    public void mostrarOperaciones() {
        for (String op : operaciones) {
            if (op != null) {
                System.out.println(op);
            }
        }
    }


    public void extraer(int extraccion) {

        if ((balance - extraccion) >= -2000) {
            balance -= extraccion;
            docuExtraccion(extraccion);
        } else {
            System.out.println("Su cuenta no posee saldo suficiente para la extraccion solicitada.");
        }

    }

    public void depositar(int deposito) {
        this.balance += deposito;
        docuDeposito(deposito);
    }

    public void docuExtraccion(double monto) {

        if (this.contadorOP == OPMAX) {
            this.contadorOP = 0;
        }

        operaciones[contadorOP] = "El cliente " + cliente.getNombre() + ", retiro " + monto;

        this.contadorOP++;


    }

    public void docuDeposito(double monto) {

        if (this.contadorOP == OPMAX) {
            this.contadorOP = 0;
        }

        operaciones[contadorOP] = "El cliente " + cliente.getNombre() + ", deposito " + monto;

        this.contadorOP++;

    }


    @Override
    public String toString() {
        return "Cuenta{" +
                "id=" + id +
                ", balance=" + balance +
                ", cliente=" + cliente +
                '}';
    }
}
