package day25_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_sort {

	public static void main(String[] args) {
		
	List<String> isimler=new ArrayList<>();
	
	isimler.add("Kutlu");
	isimler.add("Emrah");
	isimler.add("Ferhat");

	System.out.println(isimler);
	
	Collections.sort(isimler);
	System.out.println(isimler);
	
	isimler.add("filiz");	// natural order
							// ascii kodalrda once buyuk harfler sonra kucuk karakterler gelir
	
	Collections.sort(isimler);
	System.out.println(isimler);
	}

}
