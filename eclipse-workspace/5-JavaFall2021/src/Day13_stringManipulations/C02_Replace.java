package Day13_stringManipulations;

public class C02_Replace {

	public static void main(String[] args) {
		// String olarak verilen 10000 sayisinin 
		// binden buyuk olup olmadigini yazdiriniz
		
		String sonuc ="10.000";
		sonuc = sonuc.replace(".","");  // .'lari kaldir. 10.000 10000 
		                                // kalici olarak degisti

		if (Integer.valueOf(sonuc)>1000) {   //
			System.out.println("Bulunan sonuc 1000'den cok");
		}  else { 
			System.out.println("Bulunan sonuc 1000'den cok");
		}
	}

}
