package day25_arrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C04_Array_asList {

	public static void main(String[] args) {
		
		// verilen arrayi arrays classindan yardim alarak.
		//liste cevirebiliriz.
		
		String arr[]= {"A","b","C","d"};
		
		List<String> arraydenList=Arrays.asList(arr); 
		
		System.out.println("Arrayden list : "+ arraydenList);
		
		// Collections.sort(arraydenList);
		// System.out.println(arraydenList);
		
			//	arraydenList.add("F");		// RTE verdi. UnsupportedOperationException
			//	System.out.println(arraydenList); 	// syntax hatasi yok.
	//bu sekilde Arrays classten yardim alarak arrayi liste cevirisek
		// boyutu array gibi sabi olur. 
		// add, remove, clear calismaz. boyut degsikiligi yapilmaz
		// UnsupportedOperationException : desteklenmeyen islem hatasi verir. 
		
		arr[1]="Z";
		System.out.println(Arrays.toString(arr));
		System.out.println("Arrayden list : "+ arraydenList);
		
		arraydenList.set(3, "D");
		System.out.println("Arrayim "+ Arrays.toString(arr));
		System.out.println("Arrayden list : "+ arraydenList);
		
		// gorunurde farkli olsa da artik ayni hareket ediyorlar.
		
		Arrays.sort(arr);		
		System.out.println("Arrayim "+ Arrays.toString(arr));
		System.out.println("Arrayden list : "+ arraydenList);
	}

}
