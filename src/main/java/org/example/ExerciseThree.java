package org.example;

public class ExerciseThree {

    public static void main(String[] args) {

        int initialValue = 10;

        int[] initialarray = new int[initialValue];


        for (int i = 0; i < initialValue; i++) {

            initialarray[i] = 2 + 2 * i;
        }
        System.out.printf("%s%8s%n", "Index", "Value");
        for (int j = 0; j < initialValue; j++) {
            System.out.printf("%5d%8d%n", j, initialarray[j]);
        }

    }
}
