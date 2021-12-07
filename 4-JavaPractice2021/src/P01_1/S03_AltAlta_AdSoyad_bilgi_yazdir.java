package P01_1;

import java.util.Scanner;

public class S03_AltAlta_AdSoyad_bilgi_yazdir {

	public static void main(String[] args) {
		
		/* Kullanicinin ad soyad yas boy kilosunu alt alta yazdirma
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.print("Isminizi giriniz ; ");
		String isim=scan.nextLine();
		
		System.out.print("Soyisminizi giriniz ; ");
		String soyisim=scan.nextLine();
		
		System.out.print("Yasinizi giriniz ; ");
		int yas=scan.nextInt();
		
		System.out.print("Boyunuzu giriniz ; ");
		int boy=scan.nextInt();
		
		System.out.print("Kilonuzu giriniz ; ");
		int kilo=scan.nextInt();
		
		System.out.println("Isminiz ;"+isim+"\n"
		                  +"Soyisminiz ;"+soyisim+"\n"
				          +"Yasiniz ;"+yas+ "\n"
		                  +"Boyunuz ; "+boy+"cm\n"
				          +"Kilonuz ; "+kilo+"kg");
		// ** double degerler icin Mac'te . kullanilir.
		
		
		scan.close();
	}

}
