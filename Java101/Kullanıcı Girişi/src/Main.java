package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String userName, password, newPassword = "";
		int islem;
		
		System.out.print("Username : ");
		userName = scanner.nextLine();
		
		System.out.print("Password : ");
		password = scanner.nextLine();

		if (userName.equals("mehmet") && password.equals("123")) {
			System.out.println("Tebrikler. Basariyle Giris Yaptiniz.");
		} else {
			System.out.print("Kullanici Adi veya Parola Yanlis!!\nParolanızı Unuttuysaniz 1'e Basiniz : ");
			
			islem = scanner.nextInt();
			scanner.nextLine();
			if(islem == 1) {
				System.out.print("Yeni Sifrenizi Giriniz : ");
				newPassword = scanner.nextLine();
				if(password == newPassword) {
					System.out.println("Şifre Olusturulamadi.");
				}else {
					System.out.println("Sifre Basariyla Olusturuldu.");
				}
			}else {
				System.out.println("Yanlis Islem!!!");
			}

		}

	}

}
