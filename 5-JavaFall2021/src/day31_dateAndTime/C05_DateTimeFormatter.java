package day31_dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDateTime tarihSaat= LocalDateTime.now();
		 
		System.out.println(tarihSaat);
		
		//Eger tarih veya saati kendi istedigimiz formattab yazdirmak istersek
		
		// gun / ay / yil    saat: dakika
		
		DateTimeFormatter duzenle= DateTimeFormatter.ofPattern("DDD / MMM / Y - h : mm a");
		System.out.println(duzenle.format(tarihSaat));
		
		/*
		  Format olustururken GUN 
		  d  : basta 0 varsa onu yazmadan gun numarasi
		  dd : tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi, 
		  D,DD,DDDD : yilin kacinci gunu old
		 * 
		 E,EE, EEE : gun isminin ilk uc harfi
		 EEEE : gun isminin tamami
		 *
		 Ay(Ay icin M, dakika icin m kullanilir)
		 M : basta 0 varsa onuyazmadan ay numarasi
		 MM : tek haneli ayari 01 seklinde
		 MMM : Ay isminin ilk uc hanesi
		 MMMM : Ay isminin tamami
		 
		 YY : yilin son iki rakamini
		 Y	, YYYY : yilin tamamini
		 
		 SAAT (24 saat uzerinden istiyorsak H, 
		 		  12 saat uzerinden  istiyorsak h,
		 HH : saatin tamami
		 H  : tek rakamli saat olursa, sadece saati
		
		sonuna a eklersek am-pm ekler yazdirir
		 
		 *
		 */
	}

}
