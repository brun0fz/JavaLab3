//Ejercicio 01

package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ejercicio01\n");
        ejercicio01();

        System.out.println("Ejercicio02\n");
        ejercicio02();

        System.out.println("Ejercicio03\n");
        ejercicio03();

    }

    public static void ejercicio01() {

        int N=5;
        double A=3.5;
        char C='a';

        System.out.println("El valor es: "+N+" "+A+" "+C+" ");
        System.out.println(N+A);
        System.out.println(A-N);
        System.out.println(C);

        int valorNumerico = Character.getNumericValue(C);


        System.out.println("El valor numerico de C es: "+valorNumerico);

    }

    public static void ejercicio02() {
        int X=2;
        int Y=5;

        double N=6.5;
        double M=8.9;

        System.out.println("X+Y ="+ (X+Y));
    }



        public static void ejercicio03() {

            int N=5;

            N+=77;
            System.out.println("N = " + N);
            N=3;
            System.out.println("N = " + N);
            N*=2;
            System.out.println("N = " + N);

        }


}