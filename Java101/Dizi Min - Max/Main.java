package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.print("Sayi : ");
        int sayi = scanner.nextInt();
        int kucukEnYakin = 0;
        int buyukEnYakin = 0;
        int kucukRef = Integer.MAX_VALUE;
        int buyukRef = Integer.MAX_VALUE;;
        for (int i = 0; i < array.length; i++) {

            if (array[i] > sayi) {
                if (Math.abs(array[i] - sayi) < buyukRef) {
                    buyukEnYakin = array[i];
                    buyukRef = Math.abs(array[i] - sayi);
                }
            } else if (array[i] < sayi) {
                if (Math.abs(sayi - array[i]) < kucukRef) {
                    kucukEnYakin = array[i];
                    kucukRef = Math.abs(array[i] - sayi);
                }

            }
        }

        System.out.println("Girilen Sayidan Kucuk En Yakin Sayi : " + kucukEnYakin);
        System.out.println("Girilen Sayidan Buyuk En YAkin Sayi : " + buyukEnYakin);


    }

}

