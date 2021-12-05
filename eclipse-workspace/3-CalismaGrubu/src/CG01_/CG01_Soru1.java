package CG01_;

import java.util.Scanner;

public class CG01_Soru1 {

	public static void main(String[] args) {
		// Iki farkli string deger tanimlanir
		// ikisini birlestirip yazdiralim
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Birinci kelimenizi giriniz.");
		String cumle1=scan.next();
		
		System.out.print("Ikinci kelimenizi giriniz.");
		String cumle2=scan.next();
		
		System.out.println(cumle1+" "+cumle2+ "\n");
		
		System.out.println(cumle1.concat(" ").concat(cumle2).toUpperCase());
		
		System.out.println(cumle1.concat(" ").concat(cumle2).toUpperCase().replaceAll("\\w", "*"));
		scan.close();
		
	}

}
