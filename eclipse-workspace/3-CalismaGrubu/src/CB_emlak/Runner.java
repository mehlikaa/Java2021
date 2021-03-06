package CB_emlak;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

	static String patronId = "1";
	static String patronSifre = "1";

	static String calisanId = "2";
	static String calisanSifre = "2";

	static Scanner scan = new Scanner(System.in);

	static int listeNo;
	static String evTipi;
	static String il;
	static int odaSayisi;
	static double fiyat;
	static String stokDurumu;

	static ArrayList<Emlak> envanter = new ArrayList<>();
	static ArrayList<Emlak> satilanlar = new ArrayList<>();

	public static void main(String[] args) {

		String sifre = "";
		String id = "";
		boolean girisBasariliMi = true;
		System.out.println("SILA Emlak Iyi Gunler Diler");
		
		while (girisBasariliMi) {
		System.out.print("ID    :");
		id = scan.next();
		System.out.print("Sifre  :");
		sifre = scan.next();
		
		if (id.equals(patronId) && sifre.equals(patronSifre)) {
			girisBasariliMi = false;
			patron();
		} else if (id.equals(calisanId) && sifre.equals(calisanSifre)) {
			girisBasariliMi = false;
			calisan();
		} else {
			System.out.println("Giris Basarisizdir ");
		}
	}
	}
	private static void calisan() {
			
			System.out.println("Gunaydin Emekci ");
			while (true) {
				System.out.print("\n1-Ekle \n2-Listele \n3-Cikis \nSecenek : ");
				int secenek=scan.nextInt();
				
				switch (secenek) {
				case 1: 
					Emlak emlak1=new Emlak(listeNo, evTipi, il,odaSayisi, fiyat, stokDurumu);
					envanter.add(emlak1);
					break;
				case 2: 
					System.out.println("==============");
					System.out.print("Envanter : ");
					for (int i = 0; i < envanter.size(); i++) {
						envanter.get(i).ListeleEmlak();
					}
					System.out.print("Toplam emlak sayiniz : "+envanter.size());
					break;
				case 3: 
					System.out.print("Gulle gule yine bekleriz");
							break;
					
	
				default:
					System.out.println("Yanlis giris");
					break ;
				}
				
			}
		}

	private static void patron() {
		System.out.println("Gunaydin Patron :) ");

		while(true) {
			
			System.out.print("\n1-Ekle  \n2-Listele   \n3-Sil    \n4-Duzenle   \n5-Cikis \n6-Aylik satisi gor \nSecenek : ");
			
			int secenek=scan.nextInt();
			
			switch (secenek) {
			case 1:
				Emlak emlak1=new Emlak(listeNo, evTipi, il,odaSayisi, fiyat, stokDurumu);
				envanter.add(emlak1);
				System.out.println("Selam eklendi mi?");
				break;
				
			case 2:
				System.out.println("==============");
				System.out.println("Envanter : ");
				for (int i = 0; i < envanter.size(); i++) {
					envanter.get(i).ListeleEmlak();
				}
				System.out.println("Toplam emlak sayiniz : "+envanter.size());
				break;
				
			case 3:
				System.out.println("Satildi ise"); 
				int silinen=scan.nextInt()-100;
				satilanlar.add(envanter.get(silinen));
				envanter.remove(silinen);
				break;
				
			case 4:
				for (int i = 0; i < envanter.size(); i++) {
					envanter.get(i).ListeleEmlak();
				}
				System.out.println("Hangi urunu duzenleyelim :");
				int duzenlenecek=scan.nextInt()-100;
				if(duzenlenecek<envanter.size()) {
					System.out.print("Neyi duzenlemek istersiniz? : \n1-Ev Tip \n2-il \3-Oda Sayisi \n4-Fiyat \n5-Stock Durumu");
				int neyi=scan.nextInt();
					switch (neyi) {
					case 1:
						System.out.print("Ev tipini duzenleyiniz :");
						envanter.get(duzenlenecek).setEvTipi(scan.next());
						break;
					case 2:
						System.out.print("Ilinizi duzenleyiniz :");
						envanter.get(duzenlenecek).setIl(scan.next());
						break;
					case 3:
						System.out.print("Oda sayisini duzenleyiniz :");
						envanter.get(duzenlenecek).setOdaSayisi(scan.nextInt());
						break;
					case 4:
						System.out.print("Oda sayisini duzenleyiniz :");
						envanter.get(duzenlenecek).setStokDurumu(scan.next());
						break;
						
					case 5:
						System.out.println("Giris Basasrisiz");
						break;
				}
				}
				break;
				
			case 5:
				System.out.println("Iyi gunler");
				break;
			
			case 6:
				
				for (int i = 0; i < satilanlar.size(); i++) {
					satilanlar.get(i).ListeleEmlak();
				}
				break;
			}
					
		}
	}

}
