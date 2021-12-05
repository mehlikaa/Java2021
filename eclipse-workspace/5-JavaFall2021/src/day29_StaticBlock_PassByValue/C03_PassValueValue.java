package day29_StaticBlock_PassByValue;

public class C03_PassValueValue {

	public static void main(String[] args) {
		// Main method'dan diger method'lara veya diger method'lardan main method'a 
		// bir variable gonderirseniz Java orjinal variable'lari degil
		// onlarin degerlerini(value) goturur, orjinal variable'in degeri degismez
		
		int fiyat=100;
		
		System.out.println("%25 ile  fiyatim : "+indirimYap25(fiyat));
		
		System.out.println("Benim fiyatim : "+ fiyat );
		
		fiyat=indirimYap25(fiyat);
		
		System.out.println("Atamadan sonra main metoddaki fiyat : "+ fiyat);
		
		System.out.println("%10 ile  fiyatim : "+indirimYap10(fiyat));
	}



	private static int indirimYap25(int fiyat) {
		
		fiyat*=0.75;
		return fiyat;
		
	}
	
	private static int indirimYap10(int fiyat) {
		
		fiyat*=0.90;
		return fiyat;
		
	}



}

