package Day12_tekrar_edilecek;

import java.util.Scanner;

public class C06_contains {

	public static void main(String[] args) {
		// contains methodu
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir cumle giriniz.");
		
		String cumle= scan.nextLine().toLowerCase();
		
		// case sensitive ozelligini kaldirma
		
		// System.out.println(cumle+"\n");
		// toUpperCase Locale?    ???????
		if((cumle.toLowerCase().contains("kucuk"))&&(cumle.toLowerCase().contains("buyuk"))) {
			System.out.println("Kucuk mu buyuk mu karar ver");
		} else if (cumle.toLowerCase().contains("kucuk")) {
		System.out.println(cumle.toLowerCase());
		} else if (cumle.toLowerCase().contains("buyuk")) {
			System.out.println(cumle.toUpperCase());
		} else {
			System.out.println("Cumlenizde, buyuk ve kucuk kelimeleri gecmemektedir.");
		}
		
		

	}

}
