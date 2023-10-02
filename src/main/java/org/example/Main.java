package org.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello world!");
        ArrayList<Integer> firstarray = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            int ran_number = random.nextInt(49) + 1;
            firstarray.add(ran_number);
        }
        ArrayList<Object> secondarray = new ArrayList<>(firstarray);
        System.out.printf("%s%8s%n", "Index", "Value");
        for (int j = 0; j < 1000; j++) {
//            System.out.printf("The number is %s, %s %n", j, secondarray.get(j));
            System.out.printf("%5d%8d%n", j, secondarray.get(j));
        }


    }
}