package Day08_IfElseStatements;

import java.util.Scanner;

public class C02_IfElseStatements {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen bir karakter yaziniz :");
		
		char karakter=scan.next().toUpperCase().charAt(0);
		
		// Girilen karakter harf olup olmadigini kontrol
		
		if ((karakter>='A' && karakter<='Z') || (karakter>='a' && karakter<='z')) {
			System.out.println("Girdiginiz karakter, "+ karakter + "  harftir.");
		}   else {
			System.out.println("Girdiginiz karakter, "+ karakter + "  harf degildir.");
		}
			scan.close();
		
	}
}
