package com.company;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number : ");
        int number = scanner.nextInt();
        System.out.println(recursivePrime(number, 2));



    }

    static boolean recursivePrime(int number, int i ){
        if(number != i){
            if(number % i == 0 ) return false;
            else recursivePrime(number, ++i);
        }
        return true;


    }

}

