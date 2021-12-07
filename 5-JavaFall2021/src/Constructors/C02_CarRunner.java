package Constructors;

public class C02_CarRunner {

	public static void main(String[] args) {
		// hangi bilgiler icin, kaliptan ogrenecegim
		C01 car1 = new C01(); // iki c01 arasindaki fark, ilk c01; 
		    /* bir esitlikte, sol taraf, declaration, neler soylemem gerek: Data turu ve variable ismi
			variable olusturmak icin, String str="Mehmet"; 
			
	Data turu class ismi olabilir.
	primitive data turlerini Java olusturmustur.Primitive data turu olusturamayiz.
	biz data turunde , bir variable olustururuz.
	Ama Non primitive java yada biz olusturabilriz.
	
	C01 car1 yazdigimizda hem class ismi hem de Nonprimitive dayta turudur.
	String gibi hem class hem non primitive dir
	---
	new C01(); esitligin sag tarafi deger olusturma idi
	new bir keyword ve yeni bir obje olusturacagimizi beyan eder.
	c01() ise class ismi ile ayni ve parantezli(method olsa return type ve kucuk harfle baslmali)
	c01() bir constructordur
	bircok constructor olabilir. Parametresiz olani kullanmis oluyoruz
	
	 kaliptan faydalanmak icin, obje olusturdum.
	 
		*/
		car1.fiyat=10000;
		car1.ilanNo=1001;
		car1.marka= "Toyota";
		car1.model="Corolla";
		car1.yil=2021;
		// variable lar birsey yazdirmaz.sadece deger atamasi yapar. 
		System.out.println(car1.fiyat + ","+car1.ilanNo+ ","+car1.marka+ ","+car1.model+ ","+car1.yil);
		
		
		car1.maxHiz(200);    // methodumuz
		car1.yakit("dizel"); //methodumuz
		// methodlarin ne yapacagini method belirler. yazdirabilir.vpoid yazdirir
		
		
	}
}
