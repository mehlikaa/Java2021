package day31_dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_localTime {

	public static void main(String[] args) {
		
		LocalTime saat=LocalTime.now();
		
		System.out.println("Baslangic saati : "+ saat);
		
		int sayi=10;
		for (int i = 0; i < 10000; i++) {
			sayi++;
		}
		LocalTime saat2=LocalTime.now();
		System.out.println( "Bitis saati : "+ saat2);
		
		// eger bir islemin baslangic ve bitis saatini kaydetek istiyorsak, local time objesi olusturmliyiz.
		
		double nano1=saat.getNano();
		double nano2=saat2.getNano();
		
		System.out.println("Fark  "+(nano2-nano1));		//Fark  3.4599E7
		
		System.out.println(saat.getMinute());
		
		LocalTime yerelSaat=LocalTime.now(ZoneId.of("GMT"));
		System.out.println("Son "+ yerelSaat);
		
	}
 
}
