package day32_varargs_immutable;

public class C02_3_varArgs {

	public static void main(String[] args) {

		topla(2, 8, 10, 13, 15, 2);

		kafanaGoreTopla(2, 8, 10, 13, 15, 2);

		// vargs list gibi davranir, aslinda array metodlari ile calisir.
		// sadece 1 varargs konulablir
		// hep baslikta en sona yazilmalidir.

	}

	private static void topla(int... sayilar) {
		int toplam = 0;

		for (int each : sayilar) {

			toplam += each;

		}
		System.out.println("Girilen sayilarin toplami : " + toplam);
	}

	private static void kafanaGoreTopla(int sayi1, int... sayilar) {

		int toplam = 0;

		for (int each : sayilar) {

			toplam += each;

		}
		System.out.println("\nGirilen sayilarin toplami : " + toplam);
		System.out.println("Ilk sayi ile diger sayilarin toplamini carp  : " + toplam * sayi1);

	}

}
