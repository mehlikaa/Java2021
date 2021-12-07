package HB07_ForLoop;

public class Q02_charAsciiKod_yazdir {
	public static void main(String[] args) {

// 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.

		for (int i = 0; i <= 255; i++) {

			char harf = (char) i;

			System.out.println(i + " - " + harf);
		}

		
		
		
		
		// ---- me OK ---- daha kisa //
		for (int i = 0; i < 256; i++) {

			System.out.println(i + " - " + (char) i);
		}

	}
}
