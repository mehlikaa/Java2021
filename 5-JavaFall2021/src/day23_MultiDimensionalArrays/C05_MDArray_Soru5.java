package day23_MultiDimensionalArrays;

import java.util.Scanner;

public class C05_MDArray_Soru5 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir cumle giriniz :");
		
		String cumle=scan.nextLine();
		
		System.out.println("Cumlem : "+cumle);
		
		String kelimeler[]=cumle.split(" ");   // " "ile keleime kelime, ""hiclik ile karakter karakter ayrilir.
		
		System.out.println("Cumlemiz : "+ kelimeler.length+"adet kelimeden olusuyor");
	}

}
