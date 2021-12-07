package CG01_;

import java.util.Scanner;

public class CG05_Soru6 {

	public static void main(String[] args) {
		// isi ve soyisim istenir
		// merhaba diye karsilaniryazilir

		Scanner scan=new Scanner(System.in);
		System.out.print("Isminizi giriniz : ");
		String isim=scan.next();
		
		System.out.print("Soyisminizi giriniz : ");
		String soyisim=scan.next();
		
		System.out.println("Merhaba "+isim+" "+soyisim);
		
		// ???? String degistir=isim.replaceAll(0,"[a-z]");
		
		System.out.print("Meerhaba "+isim.concat(" ").concat(soyisim.toUpperCase()));
	scan.close();
	
		
	}

}
