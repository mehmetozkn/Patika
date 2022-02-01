package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array =  {10, 20, 20, 10, 10, 20, 5, 20};
        int[] frequency = new int[21];

        for(int i = 0 ; i < array.length;i++){
            frequency[array[i]]++;
        }

        for(int i = 0 ; i < frequency.length ; i++){
            if(frequency[i] != 0)
            System.out.println(i + " Sayisi " + frequency[i]  + " kere geciyor.");
        }


    }
}

