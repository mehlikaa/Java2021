package Day04_Monday_Oc25;

public class c03_dataCasting {
	
	public static void main(String[] args) {
		
		byte sayi1=44;
		short sayi2=sayi1;
		
		// esitligin sol tarafi short, sag tarafi byte
		// iki data turu farkli old halde itiraz etmiyor
		//cunku atama yapilan variable'in data turu(short),
		// atanan degerin veri turunden buyuk old icin sorun olusmaz.
		
		System.out.println("Sayi2 ; " + sayi2);
		
		int sayi3=55;
		double sayi4=sayi3;
		System.out.println("sayi4 ; "+sayi4);
		/* atanan degerin data turu, deger atanan variable'in data turunden kucukse
		 * Java casting'i otomatik yapar
		 * bu isleme Auto Widening denir. 
		 */
	}
}
