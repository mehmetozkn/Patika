package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double armut, elma, domates, muz, patlican;
		
		
		System.out.print("Armut(kg) : ");
		armut = scanner.nextDouble();
		
		System.out.print("Elma(kg) : ");
		elma = scanner.nextDouble();
		
		System.out.print("Domates(kg) : ");
		domates = scanner.nextDouble();
		
		System.out.print("Muz(kg) : ");
		muz = scanner.nextDouble();
		
		System.out.print("Patlican(kg) : ");
		patlican = scanner.nextDouble();
		
		
		System.out.println("Toplam tutar = " + ((armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5.0) ));
		
		

	}

}
