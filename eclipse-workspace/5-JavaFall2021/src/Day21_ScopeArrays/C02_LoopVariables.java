package Day21_ScopeArrays;

public class C02_LoopVariables {

	public static void main(String[] args) {
		
		int sayi=10; // loopun disn=inda tanimlanan variable loopda da gecerkli old icin. tekrar ayni isimde loopta da olusturamam.
		//int i=0;
		
		//for (i=0; i<6 ;i++) {     ustte tanimlanmissa, bu sekilde kullanilabilir.
			for (int i=0; i<6 ;i++) {
			String isim="Ali";
			System.out.println(sayi+ " "+isim);

		}
		// ==========================
		// System.out.println(" Isim : "+isim);
		// System.out.println(" I : "+ i);
		// loopun icinde olusan bir variable'í loop disinda kullanamam
		//==== loop disinda da ihtiyacimiz olacaksa, looptan once olusturur ve emniyette omak icin ilk deger atamasini yapariz.
		
		for(int i=0; i<10; i++) {
					// int sayi=20 sayi variablei main methodún icinde olusturulduugndan tum main metodda gecerlidir.  
					//dolayisi ile yeniden ayni isimde bir variable olusturmazsiniz.
			
			String isim="Veli";  // baska loop icinde gecerli bir variable ismi baska loopta ayni isim kullanilabilir.
			
		}
	}

}
