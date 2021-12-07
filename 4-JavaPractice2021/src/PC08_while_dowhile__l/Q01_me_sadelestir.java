package PC08_while_dowhile__l;

import java.util.Scanner;

public class Q01_me_sadelestir {

	public static void main(String[] args) {
		// verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code yazin
		// Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
		// 153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
// -- me -- //
		Scanner scan = new Scanner(System.in);

		System.out.print("Bir sayi giriniz : ");
		int sayi = scan.nextInt();

		int hane = 0;
		int arms = 0;

		int sayiat = sayi;
		while (sayiat > 0) {
			hane++;
			sayiat /= 10;
		}
		System.out.println(hane + " haneli bir sayi ");
		// ============Kac haneli ise o kadar ustu olmali 3 ise 3 uslu, 4 haneli ise 4
		// uslu

		int sayisakla = sayi;
		for (int i = 1; i <= hane; i++) {
			if (hane >= 7) {
				System.out.println("Lutfen en fazla 6 haneli bir sayi giriniz.");
				break;
			} else if (hane == 2) {
				arms += (sayi % 10) * (sayi % 10);
				sayi /= 10;
			} else if (hane == 3) {
				arms += (sayi % 10) * (sayi % 10) * (sayi % 10);
				sayi /= 10;
			} else if (hane == 4) {
				arms += (sayi % 10) * (sayi % 10) * (sayi % 10) * (sayi % 10);

				sayi /= 10;
			} else if (hane == 5) {
				arms += (sayi % 10) * (sayi % 10) * (sayi % 10) * (sayi % 10) * (sayi % 10);

				sayi /= 10;

			} else if (hane == 6) {
				arms += (sayi % 10) * (sayi % 10) * (sayi % 10) * (sayi % 10) * (sayi % 10) * (sayi % 10);

				sayi /= 10;
			}
		}

		if (sayisakla == arms) {
			System.out.print("Sayimiz " + sayisakla + " bir armstrong sayidir.");
		} else {
			System.out.print("Sayimiz " + sayisakla + " bir armstrong sayi degildir.");
		}

	}
}
