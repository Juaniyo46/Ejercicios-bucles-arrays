package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        System.out.println("Ejercicio 13 ArraysList");
        System.out.println("Ver si el número introeducido esta en el array y mostrar su posicion");
        Scanner sc =new Scanner(System.in);

        int[] array={4,3,2,1};
        System.out.println("Introduzca el número a buscar");
        int num = sc.nextInt();


         ArrayList<Integer> list = new ArrayList<>();

         for (int i=0;i<array.length;i++) {
             list.add(array[i]);
         }
         boolean exist = list.contains(num);
         if (exist==true){
             System.out.println("La posición existente del número indicado es: "+ list.indexOf(num));
         } else System.out.println("El número indicado no existe en el array");

    }

}