package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int km, age, type;
		double price;

		System.out.print("Km : ");
		km = scanner.nextInt();

		System.out.print("Age : ");
		age = scanner.nextInt();

		System.out.print("Type (Tek Yön = 1 / Gidiş-Dönüş = 2) : ");
		type = scanner.nextInt();

		price = km * 0.1;
		
		if (km > 0 && age > 0 && (type == 1 || type == 2)) {

			if (age <= 12) {
				price = price / 2;
			} else if (age > 12 && age <= 24) {
				price = price * 0.9;
			} else if (age > 65) {
				price = price * 0.7;
			}
			
			if(type == 2) {
				price = price * 0.8;
			}

		} else {
			System.out.println("Wrong Data Entered !");
			
		}
			
		
		
		
		System.out.println("Ticket Price = " + price);

	}
}
