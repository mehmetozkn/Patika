package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ArithmeticException {

		Scanner sc = new Scanner(System.in);
		
		int sayi, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		System.out.print("Sayi Sayisi : ");
		sayi = sc.nextInt();
		
		for (int i = 1; i <= sayi ; i++) {
			int number;
			System.out.print(i + ". Sayi : ");
			number = sc.nextInt();
			if(number > max) max = number;
			if(number < min) min = number;
		}
		
		System.out.println("Max Value : " + max);
		System.out.println("Min Value : " + min);

	}

}
