package Dec12_proje_kitapci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2Kitap {

	private static List<Integer> kitapNo=new ArrayList<>(Arrays.asList(1001,1002,1003,1004,1005,1006,1007,1008,1009,1010));
	
	private static List<String> kitaplar=new ArrayList<>(Arrays.asList("Calikusu","Falaka","Sefiller","Pinokyo","Insan Ne Ile Yasar?","Beyaz Gemi","Fatih Harbiye", "Mor Salkimli Ev", "Yaban","Sinekli Bakkal"));

	public static List<String> getKitaplar() {
		return kitaplar;
	}

	public static void setKitaplar(List<String> kitaplar) {
		
		Kitap.kitaplar = kitaplar;
	}

	public static List<String> getKitaplar1() {
		return kitaplar;
	}

	public static List<Integer> getKitapNo() {
		return kitapNo;
	}

	public void setKitaplar(String yeniKitap) {
		System.out.println("Sen ne is yaparsin?");
		Kitap.kitaplar = kitaplar;
		
	}

	public static void setKitapNo(List<Integer> kitapNo) {
		_2Kitap.kitapNo = kitapNo;
	}


	
	
	
}
