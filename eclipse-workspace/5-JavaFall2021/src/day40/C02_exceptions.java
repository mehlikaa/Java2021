package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_exceptions {

	public static void main(String[] args) {
		// kullanicidan istedigi kadar sayi alip, bunlari toplayan bir program yapiniz
		// bu sayilari toplayan bir program yapiniz
		// sayi girisini bitirmek icinq ya basiniz
		
		int sayi=0;
		int toplam=0;
		String secim="";
		int count=0;
		
		Scanner scan=new Scanner(System.in);
		
		try {
			// while(!secim.equalsIgnoreCase("q")) {    //inputmismatch hatasi
			while(count<1000) {
				System.out.println("Lutfen toplamak icin. bir sey yaziniz: ");
				sayi=scan.nextInt();
				toplam+=sayi;
				count++;
			}
			
		}catch(InputMismatchException e) {
			
			System.out.println("Girdiginiz "+ count + "Sayilarin toplami "+toplam);
			System.out.println("Bitirmek icin, sayi disinda bir tusa basiniz :");
		}
		
		
		
		
			

		
		
		

	}

}
