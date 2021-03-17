package com.company;

public class Main {

    public static void main(String[] args) {

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
}