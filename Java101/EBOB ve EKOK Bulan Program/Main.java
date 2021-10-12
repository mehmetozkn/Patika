package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ArithmeticException {

		Scanner sc = new Scanner(System.in);
		
		int n1, n2, ebob = 1 ,ekok;
		
		
		System.out.print("Number 1 : ");
		n1 = sc.nextInt();
		
		System.out.print("Number 2 : ");
		n2 = sc.nextInt();
		
		for(int i = 1 ; i <= n1 && i <= n2 ; i++) {
			if(n1 % i == 0 && n2 % i == 0) ebob = i;
		}
		ekok = (n1*n2)/ebob;
		
		System.out.println("EBOB = " + ebob);
		System.out.println("EKOK = " + ekok);

	}

}
