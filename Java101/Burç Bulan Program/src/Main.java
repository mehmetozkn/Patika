package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int day, month;

		System.out.print("Day : ");
		day = scanner.nextInt();

		System.out.print("Month : ");
		month = scanner.nextInt();

		switch (month) {
		case 1:
			if (day <= 1 && day >= 31) {
				if (day < 22) {
					System.out.println("Oğlak Burcu.");
				} else {
					System.out.println("Kova Burcu.");
				}
			} else {
				System.out.print("Gecersiz Gun !!!");
			}

			break;

		case 2:
			if (day >= 1 && day <= 28) {
				if (day < 20) {
					System.out.println("Kova Burcu.");
				} else {
					System.out.println("Balik Burcu.Ï");
				}
			} else {
				System.out.print("Gecersiz Gun !!!");
			}
			break;
			
			// Bu şekilde 12 ay yapılır.
		
			
		}

	}
}
