package day43_Interface;

public class C03_Concrete implements C02_Interface {

	public static void main(String[] args) {
		
		C03_Concrete  concreteObje=new C03_Concrete();
		
		//interface de default keyword kullanarak olusturdugumuz, bodisi olan metodlara, child classlardan
		//child concrete classlardan obje vasitasi ile ulasabilirim.
		
		concreteObje.kaporta();
		
		// interface de static keyword kullnarak olusturdugumuz bodisi olan metodlara 
		// /...........
		C02_Interface.sanzuman();
		

	}

	@Override
	public void motor() {
		// TODO Auto-generated method stub
		
	}
	// bir interfacede static veya default keyword kullanarak bodisi olan bir metod olusturursak
	// bu interface'de implements eden conrete child classlar bu motodlari
	// implement etmej zorunda degildir/

	//sadece bodisiz implementi getirdi.

}
