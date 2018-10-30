package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        System.out.println("Ejercicio 12 ArraysList");
        System.out.println("Ordenación de los números de un vector");
        Scanner sc =new Scanner(System.in);

        int[] array={4,3,2,1};
        int[] array1={3,2,1,4};

         ArrayList<Integer> list = new ArrayList<>();

         for (int i=0;i<array.length;i++) {
             list.add(array[i]);
         }
         Collections.sort(list);
        System.out.println(list);












    }

}