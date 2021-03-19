package com.company.clases;

public class Hora {

    private int hora;
    private int minuto;
    private int segundo;

    public Hora() {
    }

    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public boolean veriHora() {
        boolean flag = false;

        if (this.hora >= 0 && this.hora <= 23) {
            if (minuto >= 0 && minuto <= 59) {
                if (segundo >= 0 && segundo <= 59) {
                    flag = true;
                }
            }
        }
        return flag;
    }


}
