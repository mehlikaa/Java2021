package R01;

import java.util.Scanner;

public class rC01 {

	static int topla = 0;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Uc sayi girilecek. \nBirinci sayiyi giriniz : ");
		int sayi1 = scan.nextInt();
		System.out.print("Ikinci sayiyi giriniz : ");
		int sayi2 = scan.nextInt();
		System.out.print("Ucuncu sayiyi giriniz : ");
		int sayi3 = scan.nextInt();

		System.out.print("Sayilarin toplami ==> " + sayi1 + "+" + sayi2 + "+" + sayi3 + "=");
		sum(sayi1, sayi2, sayi3);

		scan.close();

		
		
	}

	private static void sum(int sayi1, int sayi2, int sayi3) {

		System.out.println(topla = (sayi1 + sayi2 + sayi3));

	}

}