package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ArithmeticException {

		Scanner sc = new Scanner(System.in);

		int number = 0, total = 1;
		System.out.print("Number : ");
		number = sc.nextInt();
		System.out.println("Result = " + faktoriyel(number));

	}

	public static int faktoriyel(int number) {
		if (number >= 1) {
			return number * faktoriyel(number - 1);
		} else
			return 1;
	}

}
