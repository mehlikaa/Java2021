package Day10_Ternary_SwitchCase;

import java.util.Scanner;

public class C03_Ternary_Soru3 {

	public static void main(String[] args) {
		
		//      // kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz.");
		
		double sayi=scan.nextDouble();
		
		double mutlakDeger=sayi>=0 ? sayi : sayi*(-1) ;
		
		System.out.println(mutlakDeger);
		
		scan.close();
				
				
				}

}
