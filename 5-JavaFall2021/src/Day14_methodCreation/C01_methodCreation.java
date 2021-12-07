package Day14_methodCreation;

public class C01_methodCreation {

	public static void main(String[] args) {
		// Verilen iki sayinin toplamini ve carpimini yapip yazdiran
		// iki ayri method olusturun
		
		// method olusturmak icin 4 adim takip edilmeli
		// 1- method call yazalim
		// 2. adim methoda arguman yazacak miyiz? karar ver
		
		int sayi1=44;
		int sayi2=55;
		
		toplama(sayi1,sayi2);  //1. method call
		
		//3. adim, 1. ve 2. adim yaptiktan sonra javadan yardim alarak 
		// call deki toplama uzaerine gelince create method tiklanarak
		// otomatik method olusturulabilircreate
		
		carpma(sayi1, sayi2);
	}

	private static void carpma(int sayi1, int sayi2) {
		// 
		System.out.println(sayi1*sayi2);
	}

	private static void toplama(int sayi1, int sayi2) {
		// 4. adim erisim duzenleyici 
		// access modifier return type
		System.out.println("Sayilarin toplami : "+ (sayi1+sayi2));
	}

}
