package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ArithmeticException {

		Scanner sc = new Scanner(System.in);

		int taban, us;
		System.out.print("Taban = ");
		taban = sc.nextInt();
		
		System.out.print("Us = ");
		us = sc.nextInt();
		
		System.out.println("Result = " + us(taban, us));
		

	}

	public static int us(int taban, int us) {
		if(us == 0) return 1;
		else if(taban == 1) return 1;
		else return taban * us(taban, (us-1));
		
	}

}
