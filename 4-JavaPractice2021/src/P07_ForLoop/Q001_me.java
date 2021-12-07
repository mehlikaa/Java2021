package P07_ForLoop;

public class Q001_me {

	public static void main(String[] args) {
		/*
		 * sayacı ritmik ilerleyen ve adım sayısı belli ise FOR kullanılır. DEĞİLSE
		 * While kullanılır, Eğer döngüye bir kez mutlaka girilecekse DO_WHILE
		 * kullanılır.
		 * 
		 * Problem Tanımı 100'den 0'a kadar 13'e tam bölünebilen sayıları ve
		 * toplamlarını ekrana yazdırınız (büyükten küçüğe).
		 * 
		 * Ekran Çıktısı 91 78 65 52 39 26 13
		 */
		// ---- me OK ----//
		
		
		
		
		int toplam = 0;

		for (int i = 100; i > 0; i--) {
			// System.out.println(i);
			if (i % 13 == 0) {
				toplam += i;

				System.out.print(i + " ");
			}
		}
		System.out.println("\nSayilarin toplami : " + toplam);
	}

}
