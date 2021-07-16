package com.company;

import com.company.Clases.*;

public class Main {

    public static void main(String[] args) {

        EmpresaAlquiler empresaAlquiler = new EmpresaAlquiler();

        V2Puertas golPower = new V2Puertas("Gol Power", 50000, "2008", 100);
        V4Puertas suran = new V4Puertas("Suran", 75000, "2018", 250);
        Camioneta saveiro = new Camioneta("Saveiro", 80000, "2019", 500);

        Cliente cliente1 = new Cliente("Bruno Fabrizio", "40567765", true);
        Cliente cliente2 = new Cliente("Eze Rage", "32132123", true);

        Sucursal sucConsti = new Sucursal("Mar del Plata", "Constitucion 3200", "4786776");


        empresaAlquiler.getClienteList().add(cliente1);
        empresaAlquiler.getClienteList().add(cliente2);

        empresaAlquiler.getVehiculoList().add(golPower);
        empresaAlquiler.getVehiculoList().add(suran);
        empresaAlquiler.getVehiculoList().add(saveiro);

        empresaAlquiler.getSucursalList().add(sucConsti);


        empresaAlquiler.generarAlquiler();
        empresaAlquiler.generarAlquiler();

        empresaAlquiler.devolverAlquiler();
        empresaAlquiler.devolverAlquiler();

        empresaAlquiler.mostrarAlquilerMayorCosto();
        empresaAlquiler.cantAlquiPorTipo();

    }
}
