package CG01_;

import java.util.Scanner;

public class CG02_Soru2 {

	public static void main(String[] args) {
		// Bir string tanimlayalim
		// bu degiskeni yeni bir degisken ile birlestirelim ve 
		// ilk deger atama yapialim ve yazdiralim
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir cumle giriniz :");
		String cumle=scan.nextLine();
		
		System.out.println("Eklenecek kelimiznizi giriniz :");
		String kelime=scan.nextLine();
		cumle=cumle.concat(" ").concat(kelime);
		
		System.out.println(cumle);
		scan.close();

	}

}
