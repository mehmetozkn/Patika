package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		double tutar;
		double kdvOranı = 0.18;

		System.out.print("Tutar : ");
		tutar = scanner.nextDouble();

		double kdvliTutar = (tutar) + (tutar * kdvOranı);
		System.out.println("KDV'li Tutar : " + kdvliTutar);
		System.out.println("KDV Tutarı : " + (kdvliTutar - tutar));

	}

}
