package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Ejercicio 13 Arrays");
        System.out.println("Introduzca un número para buscar si está en el array");
        Scanner sc =new Scanner(System.in);

        int[] array ={4,3,2,1};
        int num = sc.nextInt();

        boolean isContained = false;
        int position = -1;
        for (int i = 0; i < array.length; i++){

            if (num==array[i]){
                isContained = true;
                position = i;
                break;
            }
        }

        System.out.println("¿Esta el número? "+isContained + " La posición es: "+position);


    }

}