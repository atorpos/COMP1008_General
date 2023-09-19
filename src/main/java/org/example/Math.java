package org.example;

public class Math {

    public static float pow(int x, int y){
        float result = x;

        for (int i = 0; i < y; i++) {
            result = result*x;
        }
        return  result;
    }

}
