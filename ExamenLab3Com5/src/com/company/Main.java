package com.company;

import com.company.Clases.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bateria bateria = new Bateria("Yamaha", 3, 2);
        Bajo bajo = new Bajo(35999, "Gibson", "M1");
        GuitarraElectrica guitarraElectrica = new GuitarraElectrica(60999, "Fender", "M14");
        GuitarraAcustica guitarraAcustica = new GuitarraAcustica(65999, "Yamaha", TipoDeMadera.NOGAL);

        List<Instrumento> instrumentoList = new ArrayList<>();

        instrumentoList.add(bajo);
        instrumentoList.add(bateria);
        instrumentoList.add(guitarraAcustica);
        instrumentoList.add(guitarraElectrica);

        //03
        for (Instrumento instrumento : instrumentoList) {
            System.out.println(instrumento);
        }

        //04
        bajo.sonidoAmplificado();
        guitarraElectrica.sonidoAmplificado();

        //Actualizar precios
        for (Instrumento instrumento : instrumentoList) {
            instrumento.actualizarPrecios();
        }

    }
}
