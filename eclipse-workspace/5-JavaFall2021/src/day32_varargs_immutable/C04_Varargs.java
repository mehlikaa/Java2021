package day32_varargs_immutable;

public class C04_Varargs {

	public static void main(String[] args) {

		kafanaGoreIslem(5, 10, 13, 0);

	}

	private static void kafanaGoreIslem(int sayi1, int sayi2, int sayi3, int sayi4, int... sayilar) {
		// varargsin eleman olmasa da( hiclik aldi) itiraz etmez. 
		// int lari eslestirir ve kalirsa kalanlari varargs a verir
		
		
		// private static void kafanaGoreIslem(int sayi1, int sayi2, int sayi3, int sayi4, int sayi5 int... sayilar) 
	// kabult etmiyor
		
		int toplam = 0;

		for (int each : sayilar) {

			toplam += each;

		}
		System.out.println("\nGirilen sayilarin toplami : " + toplam);
		System.out.println("Ilk sayi ile diger sayilarin toplamini carp (5*13) : " + toplam * sayi1);


	}

}
