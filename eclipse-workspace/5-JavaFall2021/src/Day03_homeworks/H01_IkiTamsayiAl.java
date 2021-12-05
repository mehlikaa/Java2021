package Day03_homeworks;

import java.util.Scanner;

public class H01_IkiTamsayiAl {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("1. sayiyi giriniz ...");
		int sayi1 = scan.nextInt();
		
		System.out.println("2. sayiyi giriniz ...");
		int sayi2 = scan.nextInt();
		
		int sayiToplam =sayi1+sayi2;
		int sayiFark = sayi1-sayi2;
		int sayiCarp=sayi1*sayi2;
		
		System.out.println("Iki sayinin toplami ;"+sayiToplam);
		System.out.println("Iki sayinin farki ;"+sayiFark);
		System.out.println("Iki sayinin carpimi ;"+sayiCarp);
		
		scan.close();
	}
}
