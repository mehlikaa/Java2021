package day32_varargs_immutable;

public class C05_varargs {

	// her metodda sadece bir varargs bulunabilir.
	
	
	public static void main(String[] args) {
		
		topla("Ali Can", 2, 8, 10, 13, 15, 2);


		// vargs list gibi davranir, aslinda array metodlari ile calisir.
		// sadece 1 varargs konulablir
		// hep baslikta en sona yazilmalidir.

	}

	// private static void topla(int... sayilar, int son) {
		// kabul etmiyor, 
		// uyanlari varargs'a verdi, hepsini aldi ve son integera kalmadi.
		// ayni veri turunde birsey ekleyemezsiniz.
		
	
	// private static void topla(int... sayilar, String str) {
	// varargs once farkli parametreler kullanilabilir ama sonra parametre yazilamaz
	// yazarsaniz, varargs son parametre olmali uyarir. CTE verir.
	
	// baska varargs da olamaz. bir tane yeter
	
	private static void topla(String str, int... sayilar) {
		// baska parametreler once gelebilir
	
		int toplam = 0;

		for (int each : sayilar) {

			toplam += each;

		}
		System.out.println("Girilen sayilarin toplami : " + toplam);
	}


		System.out.println("\nGirilen sayilarin toplami : " + toplam);
		System.out.println("Ilk sayi ile diger sayilarin toplamini carp  : " + toplam * sayi1);


	}

}
