package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ArithmeticException {

		Scanner sc = new Scanner(System.in);
		
		
		
		for(int sayi = 2 ; sayi <= 100 ; sayi++) {
			int ctrl = 0;
			for(int j = 2 ; j < sayi ; j++) {
				if(sayi % j == 0) {
					ctrl = 1;
					break;
				}
			}
			if(ctrl == 0 System.out.println(sayi);
		}
		
		
		
		
	}

}
