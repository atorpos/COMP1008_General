package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i;
        double[] inputlist = new double[3];
        Scanner nc = new Scanner(System.in);
        for(i = 0; i < 3; i++) {
            System.out.println("INput the numbers");
            inputlist[i] = nc.nextDouble();
        }

        System.out.printf("the max number is %s", findmax(inputlist));
    }

    public static double findmax(double[] inputno) {
        double max_number = 0.0;
        for(int j = 0; j < inputno.length; j++) {
            for(int k = 1; k < inputno.length; k++){
                if(max_number > inputno[k]){
                    break;
                } else {
                    if(inputno[j] >= inputno[k]) {
                        max_number = inputno[j];
                    } else {
                        max_number = inputno[k];
                    }
                }
            }
        }
        return max_number;
    }
}