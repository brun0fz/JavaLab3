package com.utntup.ejercicio03;

import java.util.UUID;

public class Cuenta {

    private UUID id;
    private double balance;

    private Cliente cliente;

    public Cuenta() {
    }

    public Cuenta(double balance, Cliente cliente) {
        this.id = UUID.randomUUID();
        this.balance = balance;
        this.cliente = cliente;
    }

    public void extraer(int extraccion) {

        if ((balance - extraccion) >= 0) {
            balance -= extraccion;
        } else {
            System.out.println("Su cuenta no posee saldo suficiente para la extraccion solicitada.");
        }

    }

    public void depositar(int deposito) {
        this.balance += deposito;
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
