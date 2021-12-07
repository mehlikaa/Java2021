package Day21_ScopeArrays;


public class C01_LocalVariables {
	
	String okulIsmi;
	
	
	
	public static void main(String[] args) {
		
		//Java local varible lara default deger atamasi yapmaz
		// kodlarimizda sorun yasamamak icin
		// olusturdugumuz local variable lara uygun bir deger atamamizda fayda var
		
		int sayi = 0;	//int sayi; dersek ve initialize etmezsek Java CTE veriyor
		System.out.println(sayi);
		
		// int sayi;  		// bir localde ayni isimde, farkli tur bile olsa, birden fazla vaiable OLUSTURLAMAZ
		// String sayi;		// ayni isim jjava buna izin vermez
		
		String isim="Ali";
		
		
		
		
	}	
	
	
	public static void staticMethod() {
			//sayi;
			//bir localde olustiurulan variable (methodlarin static olup olmadigina bagli olmaksizin
			//) farkli local'de kullanilamaz.
			//=========================//
			@SuppressWarnings("unused")  //sari alti cizgili isimín uzerine gelip supresss... tikladim farkindayim devam et dedik
			String isim="Veli";
		}
		
	

}
