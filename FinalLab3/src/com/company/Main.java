package com.company;

public class Main {

    public static void main(String[] args) {

        EmpresaTransporte fedex = new EmpresaTransporte();

        Producto notebook = new Producto("Macbook", 2, 8, 30);
        Producto mesa = new Producto("Mesa comedor", 20, 70, 200);
        Producto bicicletaFija = new Producto("Bicicleta Fija", 30, 100, 200);

        fedex.getProductoList().add(notebook);
        fedex.getProductoList().add(mesa);
        fedex.getProductoList().add(bicicletaFija);

        Empresa bruno = new Empresa("Mar del plata", "Cordoba", "2235566554", "Garbarino");
        Particular eze = new Particular("Entre rios", "Jujuy", "43334454", "Garbarino");
        Particular eze2 = new Particular("Entre rios", "Jujuy", "43334454", "eze");

        fedex.getClienteList().add(bruno);
        fedex.getClienteList().add(eze);
        fedex.getClienteList().add(eze2);

        fedex.realizarPedido();



    }
}
