package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int r;
		double pi = Math.PI;
		
		
		System.out.print("Yaricap :");
		r = scanner.nextInt();
		
		double alan = pi*r*r;
		double cevre = 2*pi*r;
		
		System.out.println("Alan = " + alan);
		System.out.println("Çevre = " + cevre);
		
		

	}

}
