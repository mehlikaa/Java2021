package Day03_homeworks;

import java.util.Scanner;

public class H05_06_isim_soyisim {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Isminizi yazar misiniz?");
		String isim=scan.next();
		System.out.println("Soyisminizi yazar misiniz?");
		String soyIsim=scan.next();
		
		System.out.println("Isminiz ; "+isim);
		System.out.println("Soyisminiz ; "+soyIsim);
		System.out.println("Kursumuza katiliminiz alinmistir. Tesekkur ederiz.");
		System.out.println(" ");
		System.out.println("Isminiz ve Soyisminiz ;; "+isim +" "+ soyIsim);
		System.out.println("Kursumuza katiliminiz alinmistir. Tesekkur ederiz.");
	scan.close();
	
	}

}
