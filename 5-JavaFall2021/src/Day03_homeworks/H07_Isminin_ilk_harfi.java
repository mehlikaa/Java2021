package Day03_homeworks;

import java.util.Scanner;

public class H07_Isminin_ilk_harfi {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Isminizi yazar misiniz :");
		char isim=scan.next().charAt(0);
		
		System.out.println("Isminizin ilk harfi ; "+isim);
		//System.out.println("Isminizin ilk harfi ; "+
		
		scan.close();
		
		
	}
}
