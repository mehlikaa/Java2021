package P07_ForLoop;

import java.util.Scanner;

public class Q09_carpanlari_listele {

	// ---- me OK ----//

	public static void main(String[] args) {
		// 1 x 1 = 1
		// 1 x 2 = 2
		// 1 x 3 = 3
		// 1 x 4 = 4
		// 1 x 5 = 5
		// 1 x 6 = 6
		// 1 x 7 = 7
		// 1 x 8 = 8
		// 1 x 9 = 9
		// 1 x 10 = 10
		// Yuarıdaki çarpım tablosunu 10 a kadar ekrana yazdırınız.

		int sayi = 1;
		Scanner scan = new Scanner(System.in);

		System.out.print("Butun carpimlarini gormek ister misin? (E/H)? ");
		char sec = scan.next().toUpperCase().charAt(0);

		

		if (sec == 'E') {

			for (int i = 1; i <= 10; i++) {

				for (int j = 1; j <= 11; j++) {
					System.out.println(i + " * " + j + " = " + (i * j));
				}
				System.out.println("==");
			}

		}

		else {
			System.out.print("Hangi sayinin carpimini girmek istersiniz : ");
			sayi = scan.nextInt();

			for (int i = sayi; i < sayi + 1; i++) {
				for (int j = 1; j < 11; j++) {

					if (j < 9) {
						System.out.println(i + " *  " + j + " =  " + (i * j));
					} else if (j >= 10) {
						System.out.println(i + " * " + j + " = " + (i * j));
					}
				}

			}
		}
	}
}
