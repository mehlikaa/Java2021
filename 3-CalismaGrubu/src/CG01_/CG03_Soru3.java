package CG01_;

import java.util.Scanner;

public class CG03_Soru3 {

	public static void main(String[] args) {
		// Iki farkli tamsayi datali iki variable olusturalim ve bunlarin 
		// toplamlarini yazdiralim
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Bir sayi giriniz :");
		int sayi1=scan.nextInt();
		
		System.out.print("Ikinci sayimizi giriniz");
		int sayi2=scan.nextInt();
		
		
		System.out.println(sayi1+sayi2);
		scan.close();

	}

}
