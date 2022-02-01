package com.company;


public class Main {


    public static void main(String[] args) {
        System.out.println(isPalindrome(121));

    }
   static boolean isPalindrome(int number){
        int temp = number;
        String reverseNumber = "";
        while (temp != 0){
            reverseNumber += temp % 10;
            temp /= 10;
        }

        if(Integer.valueOf(reverseNumber) == number) return true;
        else return false;
    }

}

