package day29_StaticBlock_PassByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {
// Java 'da list array gibi objeler icin de Passby Value gecerlidir.
	//Yeni farkli bir metodda array veya liste yeni deger atamasi yaparsaniz
	//orjinal array ve list degismez 
	
	
	public static void main(String[] args) {
		// bir list olusturalim :)
		// sonra list elemanlarini degistir. metodu yazip orada 
		// list elemanlarindan bazilarini degistirelim.
		// main metoda dondukten sonra yeniden listi yazdiralim.
		
		List<String> harfler=new ArrayList<>();
		
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
		
		System.out.println("Metoddan once : "+ harfler);	
		listElemanlarDegistir(harfler);
		System.out.println("Metoddan sonra  : "+ harfler);
		
		ListDegistir(harfler);
		System.out.println("Tum list degistir dedik ama sonra  : "+ harfler);
	}

	private static void ListDegistir(List<String> harfler) {
		
		harfler=new ArrayList<>();
		
	}

	private static void listElemanlarDegistir(List<String> harfler) {
		
		harfler.set(0, "D");
		System.out.println("Metodda degistirdigimiz ile"+ harfler);	
		}

}
