package day24_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_List {

	//Day23 ==> C01_Array ayni sorunun array cozumu

	public static void main(String[] args) {
		// Verilen bir array'den istenen degere sahip elementleri silip
				// kalani yeni bir array olarak kaydedin
				// ve sonra yeni array'i yazdirin
				
		int arr[]= {3,4,5,6,3,5};
		int silinecekEleman=5;
				
		System.out.println(Arrays.toString(arr));
		
		List<Integer> gecici=new  ArrayList<>();	// data turu list
		
		for (int i=0;i<arr.length;i++) {
			
			if (arr[i]!=silinecekEleman) {
				gecici.add(arr[i]);
			}
		}
		
		System.out.println("List  : "+ gecici); //list olarak istenmeyen eleman haric tum elemanlari goruruz.
		
		// sonucu array olarak istiyorsak
		// listedekileri yeni array'e ekleyebiliriz.
		
		int yeniArr[]=new int[gecici.size()];
		
		for(int i=0;i<yeniArr.length;i++) {
			
			yeniArr[i]=gecici.get(i);
		
		}
		//yeni arrayi yazdir
		System.out.println("Array : "+ Arrays.toString(yeniArr));
		
		
		Arrays.sort(yeniArr);
		System.out.println("Array sort : "+ Arrays.toString(yeniArr));
		
				
	}

}
