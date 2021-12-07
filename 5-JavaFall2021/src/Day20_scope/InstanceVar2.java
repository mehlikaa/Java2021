package Day20_scope;

public class InstanceVar2 {

	String adres="Ankara";
	String dogumyeri;
	double notOrtalamasi;
	double yasOrt=12.3;
	char cinsiyet ='E';
	char karakter;
	boolean ogrenciMi=true;
	boolean izinliMi;
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// instance variablelara man metoddan direk ulasilablir mi?
		//Hayir. Nasil ulasilir? Obje olusturarark
		//Nasil olusturabilirim. Class ismi ile
		
		InstanceVar2 ali=new InstanceVar2();
		
		System.out.println("Ädres : "+ ali.adres);			// atanmis , Ädres : Ankara
		System.out.println("Dogum yeri  : "+ ali.dogumyeri); //deger atanmamis : null
		System.out.println("Not ortalamasi  : "+ ali.notOrtalamasi);	// Not ortalamasi  : 0.0
		System.out.println("Yas Ortalamasi  : "+ ali.yasOrt);	// Yas Ortalamasi  : 12.3
		System.out.println("Cinsiyet  : "+ ali.cinsiyet);		// Cinsiyet  : E
		System.out.println("Karaketer   : "+ ali.karakter);		// Karaketer   :    //bos
		System.out.println("Ogrenci mi  : "+ ali.ogrenciMi);	// Ogrenci mi  : true
		System.out.println("Izinli mi  : "+ ali.izinliMi);		//Izinli mi  : false

	}
	
	
public static void staticMetod() {
	// instance variablelara static methoddan direk ulasilamaz. Hayir
	//Nasil ulasilabilir? Obje olusturarak
	
}


public void staticOlmayanMetod() {
	// instance variablelara static methoddan direk ulasilabilir.
	// evet
	
}
	
}
