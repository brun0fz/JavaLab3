package com.company.test;

import com.company.clases.Cuenta;

public class MainEj04 {
    public static void main(String[] args) {

        Cuenta cuentita = new Cuenta(01, "CuentaX", 15000);

        cuentita.credito(2500);

        cuentita.debito(1500);

        cuentita.debito(30000);

        System.out.println(cuentita);

    }
}
