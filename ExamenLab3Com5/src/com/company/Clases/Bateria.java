package com.company.Clases;

public class Bateria extends Instrumento {

    int cantTambores;
    int cantPlatillos;

    public Bateria() {
    }

    public Bateria(String marca, int cantTambores, int cantPlatillos) {
        super((cantPlatillos * 2000) + (cantTambores * 3000), marca);

        if (cantTambores >= 3) {
            this.cantTambores = cantTambores;
        }

        if (cantPlatillos > 0 && cantPlatillos < 6) {
            this.cantPlatillos = cantPlatillos;
        }
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "cantTambores=" + cantTambores +
                ", cantPlatillos=" + cantPlatillos +
                "} " + super.toString();
    }
}
