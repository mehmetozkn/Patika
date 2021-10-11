package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ArithmeticException {
		
			Scanner sc = new Scanner(System.in);
			
			int number = 0, total = 0;
			
			while (number >= 0) {
				System.out.print("Number : ");
				number = sc.nextInt();
				if(number % 2 != 0) total += number;
			}
				
			
			System.out.println("Total = " + total);
			
			
			
	
		
	    }
	  }
