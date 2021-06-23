package com.company;

public class Jugador extends Persona{

    private Posicion posicion;
    private String nick;
    private int cantVictorias;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, int edad, String localidad, Posicion posicion, String nick, int cantVictorias) {
        super(nombre, apellido, edad, localidad);
        this.posicion = posicion;
        this.nick = nick;
        this.cantVictorias = cantVictorias;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "posicion=" + posicion +
                ", nick='" + nick + '\'' +
                ", cantVictorias=" + cantVictorias +
                "} " + super.toString();
    }
}
