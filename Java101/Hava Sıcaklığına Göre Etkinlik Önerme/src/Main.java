package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sicaklik;

		System.out.print("Sicaklik : ");
		sicaklik = scanner.nextInt();
		
		if(sicaklik <= 5) System.out.println("Kayak");
		else if(sicaklik > 5 && sicaklik <= 15) System.out.println("Sinema");
		else if(sicaklik > 15 && sicaklik <= 25) System.out.println("Piknik");
		else if(sicaklik > 25) System.out.println("Yuzme");
		
			
		

	}

}
