package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ArithmeticException {

		Scanner sc = new Scanner(System.in);

		int number;
		System.out.print("Number = ");
		number = sc.nextInt();
		
		System.out.println(armstrong(number));
		
		
		
		

	}
	
	public static int basamakBulma(int number) {
		int basamakSayisi = 0;
		while (number != 0) {
			number /= 10;
			basamakSayisi++;
		}
		return basamakSayisi;
	}
	
	public static int usAlma(int taban, int us) {
		if(us == 0) return 1;
		else if(taban == 1) return 1;
		else return taban * usAlma(taban, (us-1));
	}
	
	public static boolean armstrong(int number) {
		int temp = number, total = 0;
		while (temp > 0) {
			total += usAlma(temp % 10, basamakBulma(number));
			temp /= 10;
		}
		if(total == number) return true;
		else return false;
	}
	

}
