package Day03;

import java.util.Scanner;

public class C06_Scammer_nextline {
	
	public static void main(String[] args) {
		//Scanner isleminde String icin 2 method vardir.
		// scan.next() dedigimizde sadece bir kelime alir.
		// girilen
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Lutfen Isminizi yaziniz : " );
			String isim=scan.nextLine();
			
			//yeni bir obje olusturmaya gerek yok
			System.out.println("Lutfen Soysminizi yaziniz : " );
			String soyisim=scan.nextLine();
			System.out.println("Isminiz ve Soyisminiz : "+ isim + " " + soyisim);
	scan.close();
	
	}
}