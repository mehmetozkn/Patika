package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int select = -1;
        int number = (int) (Math.random() * 100);
        System.out.println(number);
        while (select != number) {
            System.out.print("Tahmin : ");
            select = sc.nextInt();
            if (number != select) {
                System.out.println("Yanlış Tahmin. Tekrar Deneyiniz.");
                continue;
            } else {
                System.out.println("Doğru Tahmin. Program Sonlandırılıyor.");
            }
            break;
        }

    }
}

