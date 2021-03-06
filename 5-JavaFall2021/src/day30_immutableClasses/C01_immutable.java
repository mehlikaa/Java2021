package day30_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_immutable {

	public static void main(String[] args) {
		
		// string immutable bir class iken list mutabledir
		// atamasiz ref degismez
		String str="Ali";
		str.toUpperCase();
		System.out.println("Upprecaseden sonra : "+str);						   				 //Ali
		System.out.println("Uppercase print icinde : "+ str.toUpperCase());   			//ALI
		System.out.println("Simdi sadece str : "+ str);						   //Ali
		
		System.out.println("==============");
		
		List<String> list=new ArrayList<>();    					 //list mutable degistirirleblir
		System.out.println("Ilk listim : "+ list);							// atamasiz deger degisebilir
	
		list.add("Ali");
		System.out.println("Ilk ismi ekle listim : "+ list);
		
		list.add("Deli");
		System.out.println("2. ismi ekle listim : "+ list);
		
		list.set(0, "veli");
		System.out.println("Degistir listim : "+ list);
		
		list.clear();
		System.out.println("Silindi mi : "+ list);
	
	
	}

}
