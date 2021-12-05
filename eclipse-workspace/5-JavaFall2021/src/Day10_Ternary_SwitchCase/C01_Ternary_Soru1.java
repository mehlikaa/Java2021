package Day10_Ternary_SwitchCase;

import java.util.Scanner;

public class C01_Ternary_Soru1 {

	public static void main(String[] args) {
		//Kullanicidan iki sayi yazmasini isteyin
		// buyuk olmayani yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Birinci sayiyi giriniz : ");
		double sayi1= scan.nextDouble();
		System.out.print("Ikinci sayiyi giriniz : ");
		double sayi2= scan.nextDouble();
			
		System.out.println(sayi1>sayi2 ? sayi2 : sayi1);
		
		scan.close();
	}

}
