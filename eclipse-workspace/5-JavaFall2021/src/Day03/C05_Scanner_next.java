package Day03;

import java.util.Scanner;

public class C05_Scanner_next {

	public static void main(String[] args) {
		//Kullanicidan isim ve soyismini ayri ayri isteyip 
		// girilen ismi asagidaki gibi yazdiriniz
		//Girilen isim : Mehmet Bulutluoz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen Isminizi yaziniz : " );
		String isim=scan.next();
		
		//yeni bir obje olusturmaya gerek yok
		System.out.println("Lutfen Soysminizi yaziniz : " );
		String soyisim=scan.next();
		System.out.println("Isminiz ve Soyisminiz : "+ isim + " " + soyisim);
	scan.close();
	}

}
