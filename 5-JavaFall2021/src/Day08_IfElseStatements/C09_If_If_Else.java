package Day08_IfElseStatements;

import java.util.Scanner;

public class C09_If_If_Else {

	public static void main(String[] args) {
		// KIz oldugunda, ayri sorgulama ile sonuc ve 
		// erkek oldugunda ayri sorgulama ile sonuc
		
		Scanner scanx=new Scanner(System.in);
		System.out.println("Lutfen Cinsiyetinizi giriniz[E/K} : ");
		
		char cinsiyet=scanx.next().toUpperCase().charAt(0);
		
		System.out.println("Lutfen yasinizi giriniz.");
		double yas=scanx.nextDouble();
		
		if (cinsiyet=='E') {
			
			if (yas>=65) {
				System.out.println("Emekli olabilirsin.");
			} else {
				System.out.println("Emekli olmazsin");
			}
				
		} else if (cinsiyet=='K') {
			if (yas>=60) {
			System.out.println("Emekli olabilirsin");
			} else {
				System.out.println("Emekli olmazsin");
			}
		
	}
			else {
					System.out.println("Gecerli bir deger giriniz.");
				}
		scanx.close();
			}
		
	}


