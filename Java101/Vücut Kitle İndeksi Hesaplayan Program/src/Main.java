package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int kilo;
		double boy;
		
		
		System.out.print("Kilo : ");
		kilo = scanner.nextInt();
		
		System.out.print("Boy : ");
		boy = scanner.nextDouble();
		
		double vucutKitleIndeksi = kilo / (boy*boy);
		System.out.println("Vücut Kitle İndeksi = " + vucutKitleIndeksi);
		

	}

}
