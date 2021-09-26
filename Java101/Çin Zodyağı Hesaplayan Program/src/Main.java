package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int yearOfBirth;
		
		System.out.print("Year Of Birth : ");
		yearOfBirth = scanner.nextInt();
		
		if(yearOfBirth % 12 == 0) System.out.println("Çin Zodyağı Burcunuz : Maymun" );
		if(yearOfBirth % 12 == 1) System.out.println("Çin Zodyağı Burcunuz : Horoz");
		if(yearOfBirth % 12 == 2) System.out.println("Çin Zodyağı Burcunuz : Kopek");
		if(yearOfBirth % 12 == 3) System.out.println("Çin Zodyağı Burcunuz : Domuz");
		if(yearOfBirth % 12 == 4) System.out.println("Çin Zodyağı Burcunuz : Fare");
		if(yearOfBirth % 12 == 5) System.out.println("Çin Zodyağı Burcunuz : Okuz");
		if(yearOfBirth % 12 == 6) System.out.println("Çin Zodyağı Burcunuz : Kaplan");
		if(yearOfBirth % 12 == 7) System.out.println("Çin Zodyağı Burcunuz : Tavsan");
		if(yearOfBirth % 12 == 8) System.out.println("Çin Zodyağı Burcunuz : Ejderha");
		if(yearOfBirth % 12 == 9) System.out.println("Çin Zodyağı Burcunuz : Yilan");
		if(yearOfBirth % 12 == 10) System.out.println("Çin Zodyağı Burcunuz : At");
		if(yearOfBirth % 12 == 11) System.out.println("Çin Zodyağı Burcunuz : Koyun");
		
		
	

	}
}
