package YiyecekOtomati;

import java.util.List;
import java.util.Scanner;

public class YiyecekOtomat_runner {

	static Scanner scan = new Scanner(System.in);
	public static int secim ;
	static int adet=0;
	static boolean flag=true;
	static double toplamTutar;
	static YiyecekOtomat urunList = new YiyecekOtomat();

	public static void main(String[] args) {

		System.out.println("\n====   YIYECEK OTOMATIMIZA HOSGELDINIZ  ====\n");
		menu();

	}

	private static void menu() {

		System.out.print(
				"===    M E N U    ===\n1- Urun Numarasi ile Siparis \n2- Urun adi ile sipasris \n3- Fiyat Hesaplama\n4- Odeme\n5- Cikis\n\n==> Seciminiz : ");

		while (! ((secim > 0) && (secim < 6))) {					//(Character.isDigit(secim) &&
			System.out.print("Menu seceneklerimizden birini giriniz.\n Seciminiz : ");
			secim = scan.nextInt();
		}
		switch (secim) {
		case 1:
			urunListele();
			urunAl();
			break;
		case 2:
			urunListele();
			urunAl();
			break;
		case 3:
			toplamHesapla();
			break;
		case 4:
			odeme();
			break;
		case 5:
			cikis();
			break;
		default:
			System.out.println("Hatali Giris Switch Default") ;
		}

	}

	private static void urunListele() {
		System.out.println("\n== FIYAT  == URUN==\n----------------------------");
		
		for (int i = 1; i <= urunList.getUrun().size(); i++) {
			
			if (i > 0 && i <= 9) {
				System.out.println("  " + (i) + " -  " + urunList.getFiyat().get(i - 1) + "  |   "
						+ urunList.getUrun().get(i - 1));
			} else if (i > 9 && i <= 15) {
				System.out.println(
						(i) + " - " + urunList.getFiyat().get(i - 1) + "    |   " + urunList.getUrun().get(i - 1));
			}
		}
	}

	private static void urunAl() {

		System.out.println("Almak istediginiz urunun numarasini giriniz :  ");
		secim = scan.nextInt();
		System.out.println("Kac adet almak istiyorsunuz :  ");
		adet = scan.nextInt();
		for (int i = 0; i < urunList.getUrun().size(); i++) {
			//System.out.println (  secim + "  "+ (i+1));                         //  (int)secim ==i);                      //((urunList.getUrun().indexOf(secim))+1)==i);
			//System.out.println("Urunumuz : "+ urunList.getUrun().get(i)+ "Fiyati : "+ urunList.getFiyat().get(i));
			//if(urunList.getUrun().indexOf(secim)==i) {
			if(secim ==(i+1)) {
				System.out.println((i+1)+ "  Urunumuz : "+ urunList.getUrun().get(i)+ "Fiyati : "+ urunList.getFiyat().get(i)+ " Toplam Odenecek Miktar :  " +(urunList.getFiyat().get(i))*adet);
			}
			toplamTutar+=urunList.getFiyat().get(i)*adet;
		}

		while(flag) {
			System.out.println("Yeni bir urun almak istiyor musunuz? (E/H) : ") ;
			secim=(char)scan.nextInt();
				if((secim=='E')||(secim=='e')) {
					urunListele();
				}else if ((secim=='H')||(secim=='h')) {
					System.out.println("Odemeniz hesaplaniyor...");
						toplamHesapla();
				}else {
					System.out.println("Yanlis giris yaptiniz. Sadece; E ve H ile giris yapabilirsiniz.");
				}
		}
		
	}
	private static void toplamHesapla() {
		System.out.println("Odemeniz gereken toplam tutariniz :  "+toplamTutar+"\n---------------");
		
	}

	private static void odeme() {
		System.out.println("Odeme");
	}

	private static void cikis() {
		System.out.println("######     Y I N E      B E K L E R I Z  #######");
	}
}
