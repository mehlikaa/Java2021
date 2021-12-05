package Day15_methodCreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// kullanicidan ismini ve soyismini isteyin
		// iki farkli method olusturun methodlardan biri girilen kelimeleri
		//   ilk harf buyuk, digerleri kucuk olacak sekilde birlestirsin
		// Ikinci method Isim ve soyismin ilk harfleri buyuk harf,
		//   kalan harfler * olacak sekilde birlestirsin
				
		// kullaniciya isminin acik olarak yazilmasi veya gizlenmesi tercihi sorun
		// ve programin kalan ksminda isim ve soyismi kullanicinin istedigi sekilde kullanin
		
		Scanner scan=new Scanner(System.in);
		 System.out.print("Lutfen isminizi giriniz : ");
		 String isim=scan.next();
		 System.out.print("Lutfen soyisminizi giriniz : ");
		 String soyisim=scan.next();
		 
		 // acikIsim(isim,soyisim);
		 // isimGizle(isim,soyisim);
		 System.out.print("Bilgileriniz acik mi verimesini isterseniz; 1'e, gizli verilmesini isterseniz; 2'ye basiniz");
		 int tercih=scan.nextInt();
		 
		 String birlesmisIsim=null;     //simdilik bos olsun, ama farkindayim diye null yazmalisin
		 								// yerine ""hiclik kullanimini program kabul eder ama geri null dendiginde anlasilir olur
		 if (tercih==1) { 
			 birlesmisIsim=acikIsim(isim,soyisim);
		 } else if (tercih ==2) {
			 birlesmisIsim=isimGizle(isim,soyisim);
		 } else {
			 System.out.print("Lutfen, 1 yada 2 degerinden birini giriniz.");
		 }
		 System.out.print("Kullanicinin tercihi: "+birlesmisIsim);
	}
	private static String isimGizle(String isim, String soyisim) { //*li isism soyisim donecek
		
		isim=isim.substring(0, 1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
		soyisim=soyisim.substring(0, 1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");
		
		return isim+" "+soyisim; 
		
		
		
	}

	public static String acikIsim(String isim, String soyisim) { //bana ne geri donecek
		
		isim=isim.substring(0, 1).toUpperCase()+isim.substring(1).toLowerCase();		   // ilk harfi alip buyuk karakter yaptim
		soyisim=soyisim.substring(0, 1).toUpperCase()+soyisim.substring(1).toLowerCase();
		
		return isim+" "+soyisim;                //ne donecek return istiyor muttlaka
		
		
	}

}
