package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.print("1.Number : ");
		n1 = scanner.nextInt();
		
		System.out.print("2.Number : ");
		n2 = scanner.nextInt();
		
		System.out.print("3.Number : ");
		n3 = scanner.nextInt();
		
		if((n1 > n2) && (n1 > n3)) {
			if(n2 > n3) System.out.println("n1 > n2 > n3");
			else if(n3 > n2) System.out.println("n1 > n3 > n2");	
			
		}else if ((n2 > n1) && (n2 > n3)) {
			if(n1 > n3) System.out.println("n2 > n1 > n3");
			else if(n3 > n1) System.out.println("n2 > n3 > n1");
			
		}else if((n3 > n1) && (n3 > n2)) {
			if(n1 > n2) System.out.println("n3 > n1 > n2");
			else if(n2 > n1) System.out.println("n3 > n1 > n2");
		}
		
			
		

	}

}
