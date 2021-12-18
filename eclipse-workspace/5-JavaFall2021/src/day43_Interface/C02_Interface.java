package day43_Interface;

public interface C02_Interface {

	void motor();
	
	//normal classlarda access modifier yazmazsaniz , java default access modifier kabul eder
	// interfacede ise access modifier yazmazsaniz java public kabul eder.

	final public static  int sayi=0;  // kednisi otomatik final static int sayi kabul eder ve bold italik mavi yazdirir.

	
	//interface de bodisi olan bir metod yazmak isterseniz
	//Java size 2 alternatif sunar
	// 1- metodun basina deault keyword yazabilirsiniz
	//ama o access modifier degildir.
	// bir interfacein icinde ben buraya metod basina default yazarsam
	//ben bu metodda bodi kullanacagim ama bunu concrete yapmayacak.

	
	public default void kaporta() {
		System.out.println("Default keywordd sayesinde body olusturabildim");
		
	}
	
	public static void sanzuman() {  //static bild static degil
													// default ve static kelimeleri ile bodi olusturmaya izin vermis
		//interface icin ayri bir anlam yukelmis
		
		
	}
}
