package org.example;

import java.util.Random;

public class ExerciseFour {

    public static void main(String[] args) {

        int[] initarray = new int[10];

        for (int i = 0; i < initarray.length; i++) {
            Random newrand = new Random();
            initarray[i] = newrand.nextInt(100) + 1;
        }
        int totalnumber = 0;
        System.out.printf("%s%8s%n", "Index", "Value");
        for (int j = 0; j < initarray.length; j++) {
            totalnumber = totalnumber + initarray[j];
            System.out.printf("%5d%8d%n", j, initarray[j]);
        }

        System.out.printf("The sum of the total is %d", totalnumber);
    }
}
