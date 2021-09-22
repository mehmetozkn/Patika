package com.test;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
		int km;
		System.out.println("Km : ");
		km = scanner.nextInt();
		double tutar = 10 + (km*2.20);
		if(tutar < 20) tutar = 20;
		System.out.println("Odenecek Tutar : " + tutar);
		
			

	}

}
