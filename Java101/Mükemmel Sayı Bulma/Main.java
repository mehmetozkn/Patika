package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ArithmeticException {

		Scanner sc = new Scanner(System.in);
		
		int number, total = 0;
		
		System.out.println("Number : ");
		number = sc.nextInt();
		
		for(int i = 1 ; i < number ; i++) {
			if(number % i == 0) total += i;
		}
		
		if(total == number) System.out.println(number + " is a Perfect Number.");
		else System.out.println(number + " is not a Perfect Number");
		
		
	}

}
