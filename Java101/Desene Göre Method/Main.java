package com.company;


import java.util.Scanner;

public class Main {

    static int ref = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number : ");
        int number = scanner.nextInt();
        deseneGoreMethod(number, 7);


    }

    static void deseneGoreMethod(int number, int kacKere) {
        if(kacKere == 0) return;

        if (number == 0 || number < 0) {
            ref = 1;
            System.out.println(number);
            deseneGoreMethod(number + 5, --kacKere);

        } else  {
            if(ref == 1){
                System.out.println(number);
                deseneGoreMethod(number + 5, --kacKere);
            }else{
                System.out.println(number);
                deseneGoreMethod(number - 5, --kacKere);

            }


        }


    }

}

