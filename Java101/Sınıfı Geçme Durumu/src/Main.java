package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int mat, fizik, turkce, kimya, muzik, ortalama,toplam = 0;
		String result;
		
		System.out.print("Mat Notu : ");
		mat = scanner.nextInt();
		
		System.out.print("Fizik Notu : ");
		fizik = scanner.nextInt();
		
		System.out.print("Turkce Notu : ");
		turkce = scanner.nextInt();
		
		System.out.print("Kimya Notu : ");
		kimya = scanner.nextInt();
		
		System.out.print("Muzik Notu : ");
		muzik = scanner.nextInt();
		
		if(mat >= 0 && mat <= 100) toplam += mat;
		if(fizik >= 0 && fizik <= 100) toplam += fizik;
		if(turkce >= 0 && turkce <= 100) toplam += turkce;
		if(kimya >= 0 && kimya <= 100) toplam += kimya;
		if(muzik >= 0 && muzik <= 100) toplam += muzik;
		
		ortalama = toplam / 5;
		
		result = (ortalama >= 55 ? "Tebrikler.Gectiniz..." : "Kaldiniz !");
		System.out.println(result);
		
		
			
		

	}

}
