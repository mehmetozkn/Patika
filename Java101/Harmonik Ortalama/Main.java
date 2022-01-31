package com.company;

public class Main {

    public static double harmonikOrt(int n){
        double sum = 0;
        for(int i = 1 ; i <= n; i++ ){
            sum += 1.0/i;
        }

        return sum;
    }
    public static void main(String[] args) {
        System.out.printf("Result = " + harmonikOrt(5));
    }
}

