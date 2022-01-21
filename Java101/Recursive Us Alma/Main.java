package com.company;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban : ");
        int taban = scanner.nextInt();
        System.out.print("Us : ");
        int us = scanner.nextInt();
        System.out.println(recursiveUsAlma(taban, us));


    }

    static int recursiveUsAlma(int taban, int us){
        if(us == 0) return  1;
        else return  recursiveUsAlma(taban, (us-1))*taban;

    }

}

