package Day07_Basit_IfCumleleri;

import java.util.Scanner;

public class C02_Ifcumlerleri_1soru {

		public static void main(String[] args) {
			
		// Soru1; Kullanicidan bir tamsayi isteyin, sayinin tek veya cift old yazdiriniz.
			
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz.");
		
		int sayi=scan.nextInt();
		
		if (sayi%2==0) {
			System.out.println("Sayiniz cift sayidir.");
		}
		if (sayi%2==1) {
			System.out.println("Sayiniz tek sayidir.");
		}
		scan.close();
		}
}
