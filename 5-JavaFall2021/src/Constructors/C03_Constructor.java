package Constructors;

public class C03_Constructor {

	int sayi=10;
	String isim ="Mehmet";
	
	public static void main(String[] args) {
		// sayi statik degil olmadigi icin main metodda kullanamam
		//deneme metodu statik olmadigi icin main metoddan cagiraam
		//deneme();         cagiramiyor
		//sayi=20;            kabul etmiyor
		
		C03_Constructor obj1=new C03_Constructor();
		
		obj1.deneme();
		// ayni classtada olsa ayni classtaki metodlara variablelara 
		
// variable ve metod obje olusturarak kullanabiliriz
		// static olan mainden static olmayanlara ula;amiyorduk
		//static olmayanlara , mainden ulasabiliriz
		

	}
	
	private void deneme() {  //sadece bu class icinde kullanilir
		// access modifierda birsey yazmazsak default oluyordu ve 
		// ayni package da kullanilabilir
		
		System.out.println("deneme method claisti");
	}

}
