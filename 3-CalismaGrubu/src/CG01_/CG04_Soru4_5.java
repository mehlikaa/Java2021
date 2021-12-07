package CG01_;

import java.util.Scanner;

public class CG04_Soru4_5 {

	public static void main(String[] args) {
		// bir integer ve bir double tanimlanir
		// swap ile icleri degistirilerek yazdirilir.

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Int bir sayi giriniz :");
		int intSayi=scan.nextInt();
		
		System.out.println("Double bir sayi giriniz :");
		double doubleSayi=scan.nextDouble();
		System.out.println("Birinci Sayi: "+intSayi + "\n "+ "Ikinci Sayi: "+doubleSayi);
		
		double sayi=(int)doubleSayi;
		doubleSayi=intSayi;
		intSayi=(int) sayi;
		
		System.out.println(" *****  SWAP ********");
		System.out.println("Birinci Sayi: "+intSayi + "\n "+ "Ikinci Sayi: "+doubleSayi);
		scan.close();

	}

}
