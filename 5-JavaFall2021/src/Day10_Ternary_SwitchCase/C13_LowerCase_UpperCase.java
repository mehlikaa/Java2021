package Day10_Ternary_SwitchCase;

import java.util.Locale;

public class C13_LowerCase_UpperCase {

	public static void main(String[] args) {
		// verilen stringí buyuk harflerle ve kucuk harflerle yazdirma
		
		String isim = "PINAR ÇÖsEö"; 
		// System.out.println(""+ isim.toUpperCase().charAt(0)+isim.toLowerCase().charAt(1)+isim.toUpperCase().charAt(2)+isim.toLowerCase().charAt(3));
		
		int yazdir = isim.toUpperCase().charAt(0)+isim.toLowerCase().charAt(1)+isim.toUpperCase().charAt(2)+isim.toLowerCase().charAt(3);
		System.out.println(yazdir);
		
		String yazdir2 = ""+ isim.toUpperCase().charAt(0)+isim.toLowerCase().charAt(1)+
				         isim.toUpperCase().charAt(2)+isim.toLowerCase().charAt(3);
		// BAsina "" konularak String cevrilmesi saglanir.
		
		System.out.println(yazdir2);
		
		System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr")));
		
		System.out.println(isim.toUpperCase(Locale.forLanguageTag("tr")));
	}

}