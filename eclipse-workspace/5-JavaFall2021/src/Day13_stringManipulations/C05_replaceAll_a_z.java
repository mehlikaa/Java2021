package Day13_stringManipulations;

import java.util.Scanner;

public class C05_replaceAll_a_z {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir cumle giriniz.");
		String cumle=scan.nextLine().toUpperCase().replaceAll("[a-z]", "*");

		String yildiz_cumle=cumle.toLowerCase().replaceAll("[a-z]", "*");
		System.out.println(yildiz_cumle);
		
	}

}
