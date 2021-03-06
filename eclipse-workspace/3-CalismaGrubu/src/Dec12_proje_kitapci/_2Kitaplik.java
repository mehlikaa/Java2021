package Dec12_proje_kitapci;

import java.util.Scanner;

public class _2Kitaplik {

	static Scanner scan = new Scanner(System.in);
	static int secim = 0;

	public static void main(String[] args) {

		System.out.println("\n======Kitapligimiza Hosgeldiniz======");

		menu();

	}

	private static void menu() {
		System.out.print("\t  \nHangi islemi yapmak istersiniz?" + "\n------------------------------------"
				+ " \n1-Kitap ekle\n" + "2-Numara ile kitap goruntule\n" + "3-Bilgi ile kitap goruntule\n"
				+ "4-Numara ile kitap sil\n" + "5-Tum kitaplari listele\n" + "6-Cikis\n=>Seciminiz :");

		secim = scan.nextInt();

		switch (secim) {
		case 1:

			kitapEkle();
			menu();
			break;

		case 2:
			// numaraIleKitap();
			menu();
			break;

		case 3:
			// bilgiIleKitapSorgula();
			menu();
			break;

		case 4:
			// numaraIleKitapSil();
			menu();
			break;

		case 5:
			tumKitaplariListele();
			menu();
			break;

		case 6:
			System.out.println("====      YINE BEKLERIZ      ======");
			break;
		default:
			System.out.println("Yanlis giris => Yeni seciminizi yaziniz : ");
			menu();
			break;
		}

	}

	private static void kitapEkle() {
		
		System.out.print("Girmek istediginiz Kitabin adini giriniz :");
		String yeniKitap = scan.next();
		System.out.println( "Eklenecek Kitap : "+yeniKitap);
		_2Kitap kitapEkle = new _2Kitap();
		kitapEkle.setKitaplar(yeniKitap);
		
		//kitapEkle.setKitapNo(kitapEkle.setKitapNo(kitapEkle.getKitapNo()+1));
		

		// System.out.println("Yeni Kitap listemizi gormek ister misiniz? (E/H): ");
//	if (scan.next().equalsIgnoreCase("E")) {
//		 tumKitaplariListele() ;
//	} else { 
//		System.out.println("Yanlis giris sizi menuye aliyorum. ");
//		menu();
//	}
		//menu();
	}

	private static void tumKitaplariListele() {
		Kitap kitap = new Kitap();
		System.out.println("  Sira No         Kitap Adi     \n========================");
		for (int i = 0; i < kitap.kitaplar.size(); i++) {
			System.out.println("\t" + kitap.kitapNo.get(i) + "\t | \t" + kitap.kitaplar.get(i));
		}
		menu();
	}

}
