package com.company;


import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        if (reverse.equals(word)) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Word : ");
        String word = scanner.nextLine();

        String result = isPalindrome(word) == true ? "Word is Palindrome" : "Word is Not Palindrome";

        System.out.println(result);


    }
}

