package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {

	public static void main(String[] args) {
		
		List<String> harfler=new ArrayList<>();
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");
		
		System.out.println("Listenin ilk hali "+ harfler);
		
		System.out.println(harfler.remove(1));		//  Z 
			//  harfler.remove(1);    gider 1 indexindeki elemani bulur siler 
			// ve delil olarak sana verir.
		
			//ben sildim, Listeyi gormek istersen yazdir.
		System.out.println("Listenin remove z ile hali "+ harfler);	  // Listenin remove z ile hali [A, F, D]
	
		System.out.println(harfler.remove(2));	// D 'yi sildim ona gore
		System.out.println("Listenin remove 2 ile hali "+ harfler);		// Listenin remove 2 ile hali [A, F]
		// System.out.println(harfler.add("ZZZ"));		//true eklendi ok
		
		// harfler.remove("F"); 	// indexi bilmiyorum , fí bul s'l
		System.out.println(harfler.remove("F"));    // true doner,   gorevimi yaptim
		System.out.println(harfler.remove("B"));	//false doner   listede B yok silemedim.
		System.out.println("Listenin son hali "+ harfler);		//Listenin son hali [A]
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		System.out.println("Listenin son hali "+ harfler);	//Listenin son hali [A, A, Z, F]
		
		System.out.println(harfler.remove("A"));
		System.out.println("Listenin son hali "+ harfler);
		
		System.out.println(harfler.add("A"));
		System.out.println("Listenin son hali "+ harfler);
		
		//System.out.println(harfler.removeAll("A"));	//harf olmuyor, collection istiyor
		System.out.println("Listenin son hali "+ harfler);
		
		harfler.removeAll(harfler);		//listeyi siler
		System.out.println("Listeni sil "+ harfler);
		
		System.out.println("===============");
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");
		
		List<String> silinecekHarfler=new ArrayList<>();

		silinecekHarfler.add("A");
		silinecekHarfler.add("C");
		silinecekHarfler.add("F");
		
		
		System.out.println("Harfler           "+ harfler);		     // Harfler           [A, Z, F, D]
		System.out.println("Silinecek harfler "+ silinecekHarfler);	// Silinecek harfler [A, C, F]
		
		System.out.println(harfler.removeAll(silinecekHarfler));	//true
		
		System.out.println("Harfler           "+ harfler);		     // Harfler           [A, Z, F, D]
	// eger listemiz integerlardan olusuyorsa,
		//java remove(index) ve remove(object) method lari karistirmasin diye
		//girilen sayiyi index olarak kabul eder.
		
		System.out.println(harfler.remove(1));
		System.out.println("Harfler           "+ harfler);
	
	}
}
