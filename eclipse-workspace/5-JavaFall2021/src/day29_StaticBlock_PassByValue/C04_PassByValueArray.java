package day29_StaticBlock_PassByValue;

import java.util.Arrays;

public class C04_PassByValueArray {

	public static void main(String[] args) {
	
		int sayilar[]= {3, 4, 5, 6};
		
		elemanDegistir(sayilar);
		System.out.println("Eleman Degistir metodundan sonra : "+Arrays.toString(sayilar));
		
		arrayDegistir(sayilar);
		System.out.println("Array Degistir metodundan sonra : "+Arrays.toString(sayilar));
		
		
		
	}
	private static void arrayDegistir(int[] sayilar) {
	
		sayilar= new int[6];
		System.out.println("Array Degistir metodu ile : "+Arrays.toString(sayilar));
		
	}
	private static void elemanDegistir(int[] sayilar) {
	
		sayilar[0]=10;
		System.out.println("Eleman Degistir metodu ile : "+Arrays.toString(sayilar));
		

	
	}

}
