package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Add_ArrayList {

	public static void main(String[] args) {
		
		List <String> isimler=new ArrayList<>();
		
		System.out.println("Bos liste : "+ isimler);     //Bos liste : []
		
		isimler.add("Ali");
		
		System.out.println("Bir eleman : "+ isimler);    // Bir eleman : [Ali]
	
		isimler.add("Veli");
		
		System.out.println("Iki eleman : "+ isimler); 	// Bir eleman : [Ali, Veli]
		
		isimler.add(1, "mehlika");
		System.out.println("Araya eleman ekleme : "+ isimler);	//Araya eleman ekleme : [Ali, mehlika, Veli]
		
		// isimler.add(5);   // String data turu disinda old icin kabul etmiyor String istiyor
		List <String> isimler2=new ArrayList<>();
		
		System.out.println("Bos liste : "+ isimler2);     //Bos liste : []
		
		isimler2.add("Gunter");
		System.out.println("Bir ekli liste : "+ isimler2);
		
		isimler2.add("Emrah");
		System.out.println("Iki ekli liste : "+ isimler2);	// Iki ekli liste : [Gunter, Emrah]
		
		isimler.addAll(3, isimler2);
		System.out.println("Listeleri ekle : "+ isimler);		// Listeleri ekle : [Ali, mehlika, Veli, Gunter, Emrah]
		
		isimler.addAll(1, isimler2);
		System.out.println("Listeleri ekle : "+ isimler);	// Listeleri ekle : [Ali, Gunter, Emrah, mehlika, Veli, Gunter, Emrah]
		
		isimler.addAll(isimler2);
		System.out.println("Liste indexi vermeden Listeleri ekle : "+ isimler);  //Liste indexi vermeden Listeleri ekle : [Ali, Gunter, Emrah, mehlika, Veli, Gunter, Emrah, Gunter, Emrah]

		
		//  System.out.println(isimler+isimler2);       olmuyor
	}

}
