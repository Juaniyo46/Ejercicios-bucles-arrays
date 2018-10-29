package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Ejercicio 2 Arrays");
        Scanner sc =new Scanner(System.in);
        System.out.println("Introduzca un número para comprobar si es primo");
        int num = sc.nextInt();

        boolean primo = true;

        for (int i=2; i<num; i++) {
            if (num % i==0){
                primo=false;
                break;
            }
        }
        System.out.println("¿El número es primo? "+primo);



    }

}