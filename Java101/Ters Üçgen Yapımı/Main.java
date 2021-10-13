package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ArithmeticException {

		Scanner sc = new Scanner(System.in);
		
		int basamakSayisi;
		
		System.out.print("Basamak Sayisi : ");
		basamakSayisi = sc.nextInt();
		
		for(int i = basamakSayisi - 1 ; i >= 1 ; i--) {
			for(int j = basamakSayisi ; j > i ; j-- ) {
				System.out.print(" ");
			}
			
			for(int k = 1 ; k < 2*i ; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
	}

}
