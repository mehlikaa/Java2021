package day39_overridingKurallari_polymorphism;

public class C02 extends C01{

	//override childa C02ye, ama private olana yazilirsa kabul etmez.
	
	public static void main(String[] args) {
		
		C02 obj1=new C02();
		obj1.privateMethod();				//child 		
		obj1.staticMethod();				// child
		
		C01 obj2=new C02();
		// obj2.privateMethod();				//ben zaten parenttaki private ulasamam ki der
														// erismem ki override edemem zaten, is not visible
		obj2.staticMethod();					// data turu C01 old icin once C01icindeki metoda bakmamiz gerekir ama pirvate 
	}	//static icin obje uzerinden gitmene gerk yok sari koyuyor
														// signature ayni olmasina ragmen ikisi farkli iki metod olarak calisir.

	public static void staticMethod() {

		System.out.println("Child class static method calisti");

	}
//    @Override  yazinca altini cizdi ben yapamam diyor. 
	private static void privateMethod() {

		System.out.println("Child class private method calisti");

	}

//	public final void finalMethod() {
//
//		System.out.println("Child class final method calisti");
//
//	}
	//fianl demek bu sonhali bir daha degisrilemez
	//dolayisiyla final olarak tanimlananbir metod override edilemez
	
	// child class ile parent class ayni packageda 
	//access modifierlar public protected yapilabilir
	
	
	
}
