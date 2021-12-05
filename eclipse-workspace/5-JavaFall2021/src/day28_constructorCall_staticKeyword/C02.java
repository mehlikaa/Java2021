package day28_constructorCall_staticKeyword;

public class C02 {

	int x=5;
	static int y=10;
	
	
	// 3 tane obje olusturalim ve degisimleri gozlemleyelim
	
	public static void main(String[] args) {
		
		C02 obje1=new C02();
		System.out.println("Obje1 icin x: "+ obje1.x+ "   Obje1 icin static y: "+y);
		
		obje1.x++;
		y++;
		
		System.out.println("Obje1 icin x: "+ obje1.x+ "   Obje1 icin static y: "+y);

//---------------
		// ayni class icinde iken static variable'lara ulasmak icin obje'ye ihtiyac yoktur
				// kullanirsak Java CTE vermez fakat "static variable'a static yoldan ulas" diye bizi uyarir
				
		C02 obje2=new C02();
		
		System.out.println("Obje2 icin x: "+ obje2.x+ "   Obje2 icin static y: "+y);
		
		obje2.x++;
		y++;
		
		
		
		System.out.println("Obje2 icin x: "+ obje2.x+ "   Obje2 icin static y: "+obje2.y);
		
		C02 obje3=new C02();
		obje3.x=20;
		y=40;
		
		System.out.println("\nObje1 icin x: "+ obje1.x+ "   Obje1 icin static y: "+y);
		System.out.println("Obje2 icin x: "+ obje2.x+ "   Obje2 icin static y: "+y);		
		System.out.println("Obje3 icin x: "+ obje3.x+ "   Obje3 icin static y: "+y);
		
	}

}
