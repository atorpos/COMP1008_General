package org.example;

public class IntArray {


    public static void main(String[] args) {

        int[] FirstArray = new int[10];
        int[] SecondArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};


        System.out.printf("%s%8s%n", "index", "value");

        for (int i = 0; i < SecondArray.length; i++) {
            System.out.printf("%5d%8d%n", i, SecondArray[i]);
        }

    }

}
