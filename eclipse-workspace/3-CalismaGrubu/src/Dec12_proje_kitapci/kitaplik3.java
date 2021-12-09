package Dec12_proje_kitapci;

import java.util.Scanner;

public class Kitaplik {

	static Scanner scan = new Scanner(System.in);
	static int secim = 0;

	public static void main(String[] args) {

		System.out.println("\n======Kitapligimiza Hosgeldiniz======");
		menu();

	}

	public static void menu() {
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
			numaraIleKitapSorgu();
			menu();
			break;

		case 3:
			kelimeIleKitapSorgu();
			
			break;

		case 4:
			numaraIleKitapSil();
			menu();
			break;

		case 5:
			tumKitaplariListele();
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

	public static void kitapEkle() {
		System.out.print("Girmek istediginiz Kitabin adini giriniz :");
		String yeniKitap = scan.next();											// nextLine kullanamiyorum ??????????

		Kitap kitapEkle = new Kitap();
		kitapEkle.kitaplar.add(yeniKitap);
		kitapEkle.kitapNo.add(kitapEkle.kitapNo.size()+1);
		
		System.out.println("Eklenen kitap : " + kitapEkle.kitapNo.size() + " - "
				+ kitapEkle.kitaplar.get(kitapEkle.kitaplar.size() - 1));
		System.out.println("Kitaplar: "+kitapEkle.kitaplar);

		System.out.println("Yeni Kitap listemizi gormek ister misiniz? (E/H): ");
		if (scan.next().equalsIgnoreCase("E")) {
			tumKitaplariListele();
		} else {
			System.out.println("Yanlis giris sizi menuye aliyorum. ");
			menu();
		}	
	}
	
	@SuppressWarnings("static-access")
	public static void numaraIleKitapSorgu() {
		Kitap numaraIleAra=new Kitap();
	System.out.println("Hangi numarali kitabi ariyorsunuz?");
	int numaraKitap=scan.nextInt();
	for (int i = 0; i <numaraIleAra.kitapNo.size()-1 ; i++) {
		if(numaraIleAra.kitapNo.get(i)==numaraKitap) {
			System.out.println("Aradiginiz numaradaki kitabiniz : "+numaraIleAra.kitapNo.get(i)+" - "+numaraIleAra.kitaplar.get(i));
			
			System.out.println("Menuyu gormek ister misiniz? (E/H): ");

			String sec = scan.next();
			if (sec.equalsIgnoreCase("e")) {
				menu();
			} else if (sec.equalsIgnoreCase("h")) {
				System.out.println("====      YINE BEKLERIZ      ======");          
					
		     } else {
				System.out.println("Yanlis giris sizi menuye aliyorum. ");
				menu();
			}
		} 
	}
	
		
	}

	
	@SuppressWarnings("static-access")
	public static void kelimeIleKitapSorgu() {
		//////
		Kitap numaraIleAra=new Kitap();
		System.out.print("Istediginiz kitabin ismini yaziniz : ");
		String isimIleSorgu=scan.next();
		for (int i = 0; i <numaraIleAra.kitaplar.size()-1 ; i++) {
			
			if(numaraIleAra.kitaplar.get(i).contains(isimIleSorgu)) {
				System.out.println("Aradiginiz isimdeki kitabiniz : "+numaraIleAra.kitapNo.get(i)+" - "+numaraIleAra.kitaplar.get(i));
				System.out.println("====="+numaraIleAra.kitaplar.get(i));
				
			}else {System.out.println("Aradiginiz kelime ile bir kitap bulamadim.");
		}	
				System.out.println("Menuyu gormek ister misiniz? (E/H): ");

				String sec = scan.next();
				if (sec.equalsIgnoreCase("e")) {
					menu();
				} else if (sec.equalsIgnoreCase("h")) {
					System.out.println("====      YINE BEKLERIZ      ======");          
						
			     } else {
					System.out.println("Yanlis giris sizi menuye aliyorum. ");
					menu();
			     }
				}
			}
	


	public static void numaraIleKitapSil() {
		int sil = 0;

		System.out.println("Hangi sira numarasindaki kitabi silmek istersiniz ?");
		sil = scan.nextInt();

		Kitap silKitap = new Kitap();

		if ((sil > 0) && (sil < silKitap.kitapNo.size())) {
			silKitap.kitapNo.remove(Kitap.kitapNo.size() - 1); // sonuncu sira numarasini sildim.
			silKitap.kitaplar.remove(sil - 1);
		} else {
			System.out.println("Yanlis giris yaptiniz...islemi basa aliyorum.");
			numaraIleKitapSil();
		}

	}

	public static void tumKitaplariListele() {
		Kitap kitap = new Kitap();
		System.out.println("  Sira No         Kitap Adi     \n========================");
		for (int i = 0; i < kitap.kitaplar.size(); i++) {
			System.out.println("\t" + kitap.kitapNo.get(i) + "\t | \t" + kitap.kitaplar.get(i));
		}
		System.out.println("Menuyu gormek ister misiniz? (E/H): ");

		String sec = scan.next();
		if (sec.equalsIgnoreCase("e")) {
			menu();
		} else if (sec.equalsIgnoreCase("h")) {
			System.out.println("====      YINE BEKLERIZ      ======");          
				
	     } else {
			System.out.println("Yanlis giris sizi menuye aliyorum. ");
			menu();
		}
	}

}
