package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ArithmeticException {

		Scanner sc = new Scanner(System.in);

		int number;
		double total = 1.0;
		System.out.print("Number : ");
		number = sc.nextInt();
		
		for(double i = 1.0 ; i <= number ; i++)
		{
			total += (1.0/i);
		}
		
		System.out.println("Result = " + total);
		
		

	}
	
}
