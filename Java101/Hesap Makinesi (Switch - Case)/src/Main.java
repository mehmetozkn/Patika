package com.test;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int n1, n2, islem;
		
		System.out.print("First Number : ");
		n1 = scanner.nextInt();
		
		System.out.print("Second Number : ");
		n2 = scanner.nextInt();
		
		System.out.println("Number 1 =  " + n1);
		System.out.println("Number 2 = " + n2);
		
		System.out.print("1-Toplama\n2-Cikarma\n3-Bolme\n4-Carpma\nYapilacak Islemi Seciniz : ");
		islem = scanner.nextInt();
		
		switch (islem) {
		case 1: {
				System.out.println("Number 1 + Number 2 = " + (n1 + n2));
				break;
			
		}
		case 2: {
			System.out.println("Number 1 - Number 2 = " + (n1 - n2));
			break;
		}
		case 3: {
			System.out.println("Number 1 / Number 2 = " + (n1/n2));
			break;
			
		}
		case 4: {
			System.out.println("Number 1 x Number 2 = " + (n1*n2));
			break;
		}
		default:
			System.out.println("INCORRECT ENTRY !!!");
		}
		
		
		
		
		
		
		

	}

}
