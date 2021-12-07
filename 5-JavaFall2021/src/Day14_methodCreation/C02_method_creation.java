package Day14_methodCreation;

import java.util.Scanner;

public class C02_method_creation {

	public static void main(String[] args) {
		// Iki sayi isteyin 
		// sayilarin karelerini ve kuplerini toplayan iki ayri method yazin
		// kullaniciya us sorun
		//2 yazarsa kareleri toplamini yapan method, 3 yazarsa kupler toplamini yapan 
		// method calissin
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen iki sayi giriniz : \n (ilk sayidan sonra enterá basiniz). ");
		
		double x=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println("Kareler toplami icin; 2,\nKupler toplami icin 3'e basiniz.");
		int secim=scan.nextInt();
		
		switch (secim) {
		case 2:
			kareTopla(x,sayi2);
			break;
		case 3:
			kupTopla(x,sayi2);
			break;
		default:
			System.out.println("Lutfen, 2 yada 3 giriniz.\n\n");	
		}
		
		if (secim==2) {
		   kareTopla(x,sayi2);	
		   System.out.println("if");
		} else if(secim==3) {
			kupTopla(x,sayi2);
			System.out.println("if");
		} else {
			System.out.println("-Lutfen, 2 yada 3 giriniz.");
		}
		
		//kareTopla(sayi1,sayi2);
		//kupTopla(sayi1,sayi2);
		
	}

	public static void kupTopla(double sayi1, double sayi2) {
		// kupTopla adli method olusturuyoruz
		System.out.println("Girilen sayilarin Kupleri Toplami : " +(sayi1*sayi1*sayi1+sayi2*sayi2*sayi2));
		
	}

	public static void kareTopla(double sayi1, double sayi2) {
		// kareTopla adli method olusturuyoruz
		System.out.println("Girilen sayilarin Kareleri Toplami : "+(sayi1*sayi1+sayi2*sayi2));
		
		
	}

}
