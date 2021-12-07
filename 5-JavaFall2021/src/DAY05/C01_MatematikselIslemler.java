package DAY05;

public class C01_MatematikselIslemler {

	public static void main(String[] args) {
		
		System.out.println(4*(2+5)/2); //14
		System.out.println(4*(2+5)/3); //9
		//sayilarin hepsi int old icin, int sonuc verir.
		// virgulden sonrasini siler.
		
	//sonucu virgullu yazdirmak istersek
		
		double sonuc=4*(2+5)/3; // once islemle 9ú buldu ve sonra doubleá atadi.
		
		System.out.println(sonuc);
		
		sonuc=(double)(4*(2+5)/3);
		
		System.out.println(sonuc);
		
		sonuc=4*(2+5)/3;
		
		System.out.println(sonuc);
		
		double sonuc2=0;
		sonuc2=(double)4*(2+5)/3; // 4ún yanina yazip, 4 double yapildiginda 
		System.out.println(sonuc2);
		
		// Virgullu sonucu oldugu gibi yazdirabilmek icin, 
		// sayilardan biri double tanimlanmali.
		int sayi1=5;
		int sayi2=2;
		double sayi3=2;
		
		System.out.println(sayi1/sayi2);   //5/2=2
		System.out.println(sayi1/sayi3);   //5/2=2.5
		System.out.println(sayi1+sayi3/sayi2);   //6.0
		
	
		
	}

}
