package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number Of Row in The Game : ");
        int row = scanner.nextInt();
        System.out.print("Number Of Column in The Game : ");
        int column = scanner.nextInt();
        MayinTarlasi mayinTarlasi = new MayinTarlasi(row, column);
        mayinTarlasi.run();
    }
}
