package DAY05;

import java.util.Scanner;

public class C05_Modulus {
	
	public static void main(String[] args) {
		
		//Kullanicidan 6 basamakli bir sayi alip rakamlar toplamini yazdirma
				Scanner scan=new Scanner(System.in);
				System.out.println("Lutfen 6 basamakli bir sayi girniz.");
				
				int sayi=scan.nextInt();
			
				int rakamlarToplami=0;
				int rakam=sayi%10; //birler basamagini verir. 3
				
				rakamlarToplami+=rakam;
				//Bu islemi basamak sayisi kadar tekrar ederek
				sayi/=10;
				rakam=sayi%10;
				rakamlarToplami+=rakam;
				
				//Bu islemi basamak sayisi kadar tekrar ederek
				sayi/=10;
				rakam=sayi%10;
				rakamlarToplami+=rakam;

				//Bu islemi basamak sayisi kadar tekrar ederek
				sayi/=10;
				rakam=sayi%10;
				rakamlarToplami+=rakam;

				//Bu islemi basamak sayisi kadar tekrar ederek
				sayi/=10;
				rakam=sayi%10;
				rakamlarToplami+=rakam;

				//Bu islemi basamak sayisi kadar tekrar ederek
				sayi/=10;
				rakam=sayi%10;
				rakamlarToplami+=rakam;
				
				//Bu islemi basamak sayisi kadar tekrar ederek
				sayi/=10;
				rakam=sayi%10;
				rakamlarToplami+=rakam;
				
				System.out.println(" Sayinizin Rakamlar Toplami ; "+rakamlarToplami);
				
		scan.close();
	}
}
