package Day07_Basit_IfCumleleri;

import java.util.Scanner;

public class C04_If {
	
	public static void main(String[] args) {
		
		// Soru 4; Kullanicidan dikdortgenin kenar uzunluklarini isteyin.
		//         ve dikdortgenin kare olup olmadigini yazdiriniz.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen dikdortgenin bir kenar uzunlugunu giriniz");
		
		double kenar1=scan.nextDouble();
		
		System.out.println("Lutfen dikdortgenin bir kenar uzunlugunu giriniz");
		
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("Girilen degerler, kare olcusudur.");
		}
		
		if (kenar1!=kenar2) {
			System.out.println("Girilen degerler, dikdortgen olcusudur.");
		}
		scan.close();
	}
}
