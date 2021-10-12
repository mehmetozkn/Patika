package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ArithmeticException {

		Scanner sc = new Scanner(System.in);

		int number;
		System.out.print("Satir Sayisi : ");
		number = sc.nextInt();

		// *
		// * *
		// * * *
		// * * * *

		for (int i = 0; i < number; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println(" ");

		}

		System.out.println("\n\n------------------------------\n\n");

		
		
		
		// *
		// * * *
		// * * * * *
		// * * * * * * *

		for (int i = 1; i <= number; i++) {

			for (int j = i; j < number; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k < 2 * i; k++) {
				System.out.print("*");
			}

			System.out.println("");

		}

		System.out.println("\n\n------------------------------\n\n");

		
		
		// *
		// * * *
		// * * * * *
		// * * *
		// *

		for (int i = 1; i <= number; i++) {

			for (int j = i; j < number; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k < 2 * i; k++) {
				System.out.print("*");
			}

			System.out.println("");

		}

		for (int i = number - 1; i >= 1; i--) {

			for (int j = number ; j > i; j--) {
				System.out.print(" ");
			}
			
			for (int k = 1; k < 2 * i; k++) {
				System.out.print("*");
			}
			
			System.out.println();

		}

	}

}
