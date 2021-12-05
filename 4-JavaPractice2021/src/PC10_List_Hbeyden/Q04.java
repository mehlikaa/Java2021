package PC10_List_Hbeyden;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
	public static void main(String[] args) {
		// Bir öğretmenden girmek istediği kadar notu alınız, ve
		// ortalamayı geçen öğrenci sayısını bulunuz.

		// boyut belli degil list

		List<Integer> listNotlar = new ArrayList<>();
		// cikmak icin vs harf kullanmak mantikli bunun icin String sonra int cevir
		Scanner scan = new Scanner(System.in);

		String devamkee;
		do {
			System.out.print("Not giriniz.");
			int ogrNot = scan.nextInt();
			listNotlar.add(ogrNot);
			System.out.println("Devamkee: E/H ");
			devamkee = scan.next();
			listNotlar.add(ogrNot);

		} while (devamkee.equalsIgnoreCase("E"));

		int toplam = 0;

		for (int i = 0; i < listNotlar.size(); i++) {
			toplam += listNotlar.get(i);
		}
		double ortalama = toplam / listNotlar.size();

		int ortamaGecenSayisi = 0;
		for (int i = 0; i < listNotlar.size(); i++) {
			if (listNotlar.get(i) > ortalama) {
				ortamaGecenSayisi++;
			}
		}
		
		System.out.println("Girilen notlarin  otalamasi : "+ ortalama);
		System.out.println("Ortalamayi gecen sayisi :"+ortamaGecenSayisi);

	}
}
