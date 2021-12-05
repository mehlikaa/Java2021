package Day15_methodCreation;

import java.util.Scanner;

public class C02_mehodCreation {

	public static void main(String[] args) {
				/*
				 *  Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. 
		         Kullanici 2,3 veya 4 degerini girerse, 
		         kullanicidan bu sayilari girmesini isteyin 
		         ve sayilarin toplamini yazdirin. 
		         Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse 
		         “Cok sayi girdiniz, ben toplayamam” yazdirin.
				*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Kac sayinin toplamini hesaplamak istiyorsunuz(2/3/4)?");
		int secim=scan.nextInt();
		
		if (secim>4) {
			secim=5;
		} 
		// if (secim>='A' && secim<='Z') {
		// 	secim=6;
		// } else if (secim>='a' && secim<='z') {
		// 	secim=6;
		// }
			switch (secim) {
		case 2: 
			ikiSayiTopla();
			break;
		case 3:
			ucSayiTopla();
			break;
		case 4:
			dortSayiTopla();
			break;
			
		case 5:
			System.out.println("4'ten buyuk sayilari toplayamam :)");
			break;
		case 6:
			System.out.println("Harf girmemelisiniz");
			break;
		default:
			System.out.println("2, 3 ve 4 degerlerinden birini giriniz.");
		
			}
	
			scan.close();
	}
	

		
	

	public static void dortSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.print("Toplamak icin 4 sayi giriniz(Sayilar arasinda enter'a basiniz) : ");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		double sayi4=scan.nextDouble();
		
		System.out.print("Dort sayinin toplami : "+ (sayi1+sayi2+sayi3+sayi4));
		scan.close();
		
	}

	public static void ucSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.print("Toplamak icin 3 sayi giriniz(Sayilar arasinda enter'a basiniz) : ");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		
		System.out.print("Iki sayinin toplami : "+ (sayi1+sayi2+sayi3));
		scan.close();
		
	}

	public static void ikiSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.print("Toplamak icin 2 sayi giriniz(Sayilar arasinda enter'a basiniz) : ");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.print("Iki sayinin toplami : "+ (sayi1+sayi2));
		scan.close();
		}
}
