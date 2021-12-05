package P07_ForLoop;

import java.util.Scanner;

public class Q07_kare_matris {

// ---- me OK ----//	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("pozitif bir tam sayı giriniz : ");
		int sayi = scan.nextInt();

		for (int i = 1; i <= sayi; i++) {
			for (int j = 1; j <= sayi; j++) {
				if (i == j) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}

}
