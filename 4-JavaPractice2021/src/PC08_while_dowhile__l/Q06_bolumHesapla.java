package PC08_while_dowhile__l;

import java.util.Scanner;

public class Q06_bolumHesapla {
	static int bolum=0; //class level de bir veriable ilk degeri 0 atandi.

//////////     Anlamadim  ////////
	
	public static void main(String[] args) {
		// kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru 
		//kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
		Scanner scan = new Scanner(System.in);
		System.out.println("Bolunen sayiyi giriniz");
		int bolunen=scan.nextInt();
		
		System.out.println("Bolunen sayiyi giriniz");
		int bolen=scan.nextInt();
		
		
		System.out.print("Sonuc = "+ bolme(bolunen, bolen));
		
		}
		
		public static int bolme(int bolunen, int bolen) {
			bolum=bolunen%bolen;
		
		
		 return bolum;
		}
}
