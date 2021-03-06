package day31_dateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class C01_localDate {
	
	public static void main(String[] args) {
		
		LocalDate tarih= LocalDate.now();
		System.out.println(tarih);				// 2021-12-02
		
		System.out.println(tarih.getDayOfYear());		// 336
		
		System.out.println(tarih.getMonth());		// DECEMBER
	
		
		System.out.println(tarih.plusYears(2));
		System.out.println(tarih.plusWeeks(4));
		System.out.println(tarih.plusDays(12));
		
		System.out.println(tarih.minusWeeks(5));
		
		System.out.println(tarih.minusYears(5).minusMonths(4).minusDays(0));
		System.out.println(tarih.plusWeeks(5).minusWeeks(5));
		
		System.out.println(tarih.minusYears(21).isLeapYear());			//true
		
		LocalDate dogumTarihi1= LocalDate.of(1981, 01, 01);
		LocalDate dogumTarihi2= LocalDate.of(2000, 01, 01);
		
		System.out.println(dogumTarihi1+"  "+dogumTarihi2);
		
		System.out.println(dogumTarihi1.isBefore(dogumTarihi2));
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Dogum yilinizi-ayinizi-gununuzu yaziniz.");
		// int yil=scan.nextInt();
		//System.out.print("Dogum ayinizi yaziniz.");
		// int ay=scan.nextInt();
		//System.out.print("Dogum gununuzu yaziniz.");
		// int gun=scan.nextInt();
		LocalDate kullanicidan= LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
		//LocalDate kullanicidan= LocalDate.of(yil, ay, gun);
		System.out.print("Kullanicidan alinan tarih "+ kullanicidan);
		
		
		
		
	}
}
