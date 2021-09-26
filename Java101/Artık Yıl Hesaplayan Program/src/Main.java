package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int year;
		
		System.out.print("Year : ");
		year = scanner.nextInt();
		
		if(year % 4 == 0) {
			System.out.println(year + " Bir Artik Yildir.");
		}else {
			System.out.println(year + " Bir Artik Yil Degildir!");
		}
		
		
	

	}
}
