package com.company.test;

import com.company.ej02.Estudiante;
import com.company.ej02.Persona;
import com.company.ej02.Staff;

public class MainEj02 {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("40579965", "Bruno", "Fabrizio", "bruno@gmail.com", "Millan 828", 2020, 3000, "Programacion");
        Estudiante estudiante2 = new Estudiante("36123321", "Ezequiel", "Jaime", "exeziel@gmail.com", "Luro 2354", 2020, 3000, "Programacion");
        Estudiante estudiante3 = new Estudiante("34545665", "Danilo", "Suarez", "dani@gmail.com", "San martin 2354", 2020, 3000, "Programacion");
        Estudiante estudiante4 = new Estudiante("32665556", "carlos", "Miranda", "charly@gmail.com", "Rivadavia 2354", 2020, 3000, "Programacion");

        Staff profesor = new Staff("36546665", "Gustavo", "Sonvico", "gsonvico@gmail.com", "colon 2343", 75000, "noche");
        Staff profesor2 = new Staff("36546665", "Gonzalo", "Orellano", "gorellano@gmail.com", "pampa 2343", 75000, "noche");
        Staff profesor3 = new Staff("36546665", "Sergio", "Garguir", "sgarguir@gmail.com", "santa fe 2343", 75000, "noche");
        Staff coordinador = new Staff("36546665", "Erwin", "Smith", "esmith@gmail.com", "falucho 2343", 125000, "mañana");

        Persona[] personal = new Persona[8];

        personal[0] = estudiante1;
        personal[1] = estudiante2;
        personal[2] = estudiante3;
        personal[3] = estudiante4;
        personal[4] = profesor;
        personal[5] = profesor2;
        personal[6] = profesor3;
        personal[7] = coordinador;

        int cantStaff = 0;
        int cantEstudiante = 0;

        for (Persona p : personal) {

            if (p instanceof Staff) {
                cantStaff++;
            } else {
                cantEstudiante++;
            }

        }

        System.out.println("Cantidad de estudiantes: " + cantEstudiante + "\nCantidad de miembros del staff: " + cantStaff);

        int ingresosCuota = 0;

        for (Persona p : personal) {

            if (p instanceof Estudiante) {

                ingresosCuota += ((Estudiante) p).getCuotaMensual();

            }
        }

        System.out.println("Ingresos: " + ingresosCuota);

    }
}
