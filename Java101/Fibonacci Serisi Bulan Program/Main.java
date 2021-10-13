package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ArithmeticException {

		Scanner sc = new Scanner(System.in);
		
		
		int n1 = 0, n2 = 1, n3, elemanSayisi = 9;
		System.out.print(n1 + " " + n2);
		
		for(int i = 2 ; i < elemanSayisi ; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
			
		}
			
		
	}

}
