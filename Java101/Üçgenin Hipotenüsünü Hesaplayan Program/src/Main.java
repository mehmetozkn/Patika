package com.test;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
		int a;
		int b;
		double c;
		
		System.out.print("1.Kenar : ");
		a = scanner.nextInt();
		
		System.out.print("2.Kenar : ");
		b = scanner.nextInt();
		
		c = Math.sqrt((a*a) + (b*b));
		System.out.println("Hipotens : " + c);
		
		
		
		
		
			

	}

}
