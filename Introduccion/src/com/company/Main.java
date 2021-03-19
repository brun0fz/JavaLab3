package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    private static final PrintStream out = System.out;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        exercise01();
        exercise02();
        exercise03();
        exercise04();
        exercise05();
        exercise06();
        exercise08();
        exercise09();
        exercise10();

    }

    private static void exercise01() {

        System.out.println("\nExercise01\n");


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

    private static void exercise02() {

        System.out.println("\nExercise02\n");
        int X=2;
        int Y=5;

        double N=6.5;
        double M=8.9;

        System.out.println("X+Y ="+ (X+Y));
    }


    private static void exercise03() {

            System.out.println("\nExercise03\n");

            int N=5;

            N+=77;
            System.out.println("N = " + N);
            N=3;
            System.out.println("N = " + N);
            N*=2;
            System.out.println("N = " + N);

        }

    private static void exercise04() {

        System.out.println("\nExercise04\n");

        int A=1,B=2,C=3,D=4;

        System.out.println("A = " + A + "\nB = " + B + "\nC = " + C + "\nD = " + D);

        B=C;
        C=A;
        A=D;
        D=B;

        System.out.println("\nA = " + A + "\nB = " + B + "\nC = " + C + "\nD = " + D);
    }

    private static void exercise05() {

        System.out.println("\nexercise 05\n");

        String paridad="impar";

        int A = (int) (Math.random() * 100);

        if( (A % 2) == 0){
            paridad="par";
        }

        System.out.println("A: " + A + " El numero es: " + paridad);
        //System.out.printf("A: %s El numero es: %s%n", A, paridad);

    }

    private static void exercise06() {

        System.out.println("\nexercise 06\n");

        String rta="positivo";

        int B = 56;

        if(B<0){
            rta="negativo";
        }

        out.printf("B: %s es un numero %s%n", B,rta);
    }

    private static void exercise08(){
        scanner.reset();
        System.out.println("\nexercise 08\n");


        String nombre;

        out.print("Ingrese un nombre: ");

        nombre = scanner.nextLine();

        //out.println("Buenos dias, " + nombre + ".");
        out.printf("Buenos dias, %s!%n", nombre);

    }

    private static void exercise09(){
        scanner.reset();
        out.println("\nexercise 09\n");

        out.print("Ingrese un numero: ");

        int num = scanner.nextInt();

        int doble, triple;

        doble = num * 2;
        triple = num * 3;

        out.printf("El doble de %s es: %s y el triple es: %s%n", num, doble, triple);


    }

    private static void exercise10(){
        scanner.reset();

        out.println("\nexercise 10\n");

        out.print("Ingrese una temperatura en Farenheit: ");

        int F = scanner.nextInt();

        double C = (F - 32) / 1.8;

        out.printf("%s °F = %s °C%n", F, C);

    }
}