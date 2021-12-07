package Day10_Ternary_SwitchCase;

import java.util.Scanner;

public class C02_Ternary_Soru2 {

	public static void main(String[] args) {
		
		// Soru 2 : Kullanicidan bir tamsayi aliniz ve 
		//Tek mi cift mi oldugunu yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz.");
		
		int sayi=scan.nextInt();
		
		System.out.println(sayi%2==0 ? "Cift Sayi" : "Tek Sayi");
		
		scan.close();
		

	}

}
