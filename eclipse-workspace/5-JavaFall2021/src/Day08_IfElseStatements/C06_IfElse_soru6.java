package Day08_IfElseStatements;

import java.util.Scanner;

public class C06_IfElse_soru6 {

	public static void main(String[] args) {
		// Kullanicidan 2 sayi istenir
		// sayilarin ikisi de pozitif ise sayilar toplanir
		// sayilarin ikisi de negatif ise sayilar carpilir.
		// isaretleri farkli ise, farkli isaretlerle islem yapamazsin
		// Bir sayi sifira esitse, 0 yutan elamndir.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 2 sayi yaziniz : \n (2. sayi icin entera basiniz");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		if (sayi1>0 && sayi2>0) {
			System.out.println("Sayilarin toplami : "+(sayi1+sayi2));
		} else if (sayi1<0 && sayi2<0) {
			System.out.println("Sayilarin carpimi : "+ (sayi1*sayi2));
		} else if (sayi1*sayi2<0) {
			System.out.println("Farkli isaretlerle islem yapamazsin");
		} else {
			System.out.println("Bir sayi sifira esitse, 0 yutan elamandir.");
		}
		
		scan.close();
	}

}
