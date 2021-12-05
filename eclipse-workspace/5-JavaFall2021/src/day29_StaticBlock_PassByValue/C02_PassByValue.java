package day29_StaticBlock_PassByValue;

public class C02_PassByValue {

	public static void main(String[] args) {
		// biz 100 tlye satilan bi rurun icin, 2 farrkli indirim uygulayan iki metod olusturalim.
		
		int fiyat=100;
		
		indirimYap25(fiyat);
		System.out.println("Metoddan sonra main metoddaki fiyat : "+ fiyat);
		indirimYap10(fiyat);
		System.out.println("Metoddan sonra main metoddaki fiyat : "+ fiyat);
		indirimYap25(fiyat);
		System.out.println("Metoddan sonra main metoddaki 2. fiyat : "+ fiyat);
	
		C02_PassByValue(fiyat);
		System.out.println("Metoddan sonra main metoddaki 2. fiyat : "+ fiyat);
		
		fiyat=150;
		System.out.println("Metoddan sonra main metoddaki 2. fiyat : "+ fiyat);
		
	}
	
	
	
	




	private static void indirimYap25(int fiyat) {
		
		fiyat*=0.75;
		System.out.println("%25 indirimli fiyat : "+fiyat);
		
	}
	
	private static void indirimYap10(int fiyat) {
		
		fiyat*=0.90;
		System.out.println("%10 indirimli fiyat : "+fiyat);
		
	}

	private static void C02_PassByValue(int fiyat) {
		
		fiyat *= 0.90;
		System.out.println("Constructordaan %10 indirimli fiyat : "+fiyat);
		
	}

}
