package HB10_List_Hbeyden;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QManav {
	
	static List<String> urunListesi=new ArrayList<>();
	static List<Double> urunFiyatlari=new ArrayList<>();
	static double toplamOdenecekTutar;

	
	
	public static void main(String[] args) {
		/*
		 * Basit bir 5 ürünlü manav alisveris programi yaziniz.
		 *
		 * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
		 * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
		 * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
		 * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
		 * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
		 * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
		 *
		 * */
		

		
		urunListesi.add("domat-urun kodu : 1");
		urunListesi.add("elma-urun kodu : 2");
		urunListesi.add("muz-urun kodu : 3");
		urunListesi.add("biber-urun kodu : 4");
		urunListesi.add("patlican-urun kodu : 5");
		
		urunFiyatlari.add(5.0);
		urunFiyatlari.add(7.5);
		urunFiyatlari.add(11.3);
		urunFiyatlari.add(8.7);
		urunFiyatlari.add(9.2);

		System.out.println(urunListesi);
		musteriSecim();
		
		
	}

	private static void musteriSecim() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Hangi urunden almak istersiniz? ");
		int secim=scan.nextInt();
		
		System.out.println("Sectigim urunden kac kilo alacaksiniz? ");
		
		double kilo=scan.nextDouble();
		double urunTutari=urunFiyatlari.get(secim-1);
		double urunToplamTutari=kilo*urunTutari;
		
		toplamOdenecekTutar+=urunToplamTutari;
		System.out.println("Devam edecekseniz 1, kasa 2 'ye basiniz.");
		int karar=scan.nextInt();
		if (karar==1) {
			musteriSecim();
		}else kasa();
	}

	private static void kasa() {
		System.out.println("Odenecek tutar : "+toplamOdenecekTutar);
		System.out.println("===== YINE BEKLERIZ ------");
	}
}
