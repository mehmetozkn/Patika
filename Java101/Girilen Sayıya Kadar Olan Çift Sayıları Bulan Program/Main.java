package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ArithmeticException {
		
			Scanner sc = new Scanner(System.in);
			
			int number;
			System.out.println("Number : ");
			number = sc.nextInt();
			
			for(int i = 1 ; i <= number ;i++) {
				if(i % 2 == 0) System.out.println(i);
			}
			
	
		
	    }
	  }
