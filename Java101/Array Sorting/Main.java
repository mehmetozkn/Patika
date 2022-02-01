package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Array Size : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i = 0 ; i < size; i++){
            System.out.print(i+1 + ". Element : ");
                array[i] = scanner.nextInt();
        }
        for (int i = 0; i < size - 1; i++)
        {
            for (int j = 0; j  < size - i - 1; j++)
            {
                if (array[j] > array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for(int i = 0 ; i < array.length ; i++) System.out.println(array[i]);


    }
}

