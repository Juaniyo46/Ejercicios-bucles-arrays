package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Ejercicio 15 Arrays");
        System.out.println("Introduzca un número para calcular su raiz cuadrada");
        Scanner sc =new Scanner(System.in);

        Double num =sc.nextDouble();

        System.out.printf("El resultado de la raiz cuadrada de %f es: "+Math.pow(Math.abs(num),0.5),num);




    }

}