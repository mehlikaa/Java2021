package HB05_StringManipulationHB;

import java.util.Scanner;

public class Q03_substring_indexOf_ilkharflerBuyuk {

	public static void main(String[] args) {
		// Verilen ismin ilk harfleri buyuk yapma
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Isim ve soyisminizi giriniz : ");
		String isim=scan.nextLine();
		
		char ilkHarf=isim.toUpperCase().charAt(0);
		char ikinciHarf=isim.toUpperCase().charAt(isim.indexOf(" ") +1);
		char dorduncuHarf=isim.toUpperCase().charAt(isim.lastIndexOf(" ") +1);
		String ilkIsmiKes=isim.substring(isim.indexOf(" ")+1);
		char ucuncuHarf=ilkIsmiKes.toUpperCase().charAt(ilkIsmiKes.indexOf(" ") +1);
		
		System.out.println(ilkIsmiKes);		

		System.out.println("Isminizin ilk harfleri : "+ilkHarf+ "."+ikinciHarf+ "."+ucuncuHarf+"."+dorduncuHarf+".");
	}

}
