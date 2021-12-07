package Day13_stringManipulations;

import java.util.Scanner;

public class C7_Soru7_sifreSorusu_ilkkaraktersonrasi_yildiz {

	public static void main(String[] args) {
		//  Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve
		//  asagidaki gibi yazdirin
        //  isim-soyisim : M***** B*******
        //  kart no : **** **** **** 1234

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz");
		String isim=scan.next();
		
		System.out.println("Lutfen soyisminizi giriniz");
		String soyisim=scan.next();
		
		System.out.println("Lutfen kredi karti numaranizi bosluk olmadan giriniz");
		String kartNo=scan.next();
		
		String isimFormatli=isim.substring(0, 1).toUpperCase()+isim.substring(1).replaceAll("\\w", "*");
				
		String soyisimFormatli= soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w", "*");
		
		String kartNoFormatli= kartNo.substring(12);
		
		System.out.println("Isminiz ve soyisminiz :"+ isimFormatli + soyisimFormatli);
		System.out.println("Kart numaraniz : **** **** **** "+ kartNoFormatli);
		
		
		scan.close();
	}

}

 