package day25_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_contains {

	public static void main(String[] args) {
		
			//verilen bir arrayde tekrar eden elementleri sadece birer tane yazarak,
			//unique elementlerden olusan bir array haline getirelim.
		int arr[]= {2,3,4,5,3,6,2,5,3,7,4,8,5,9,1,0,3,5};
		
		// arrayimin 2,3,4,5,6,7,8,91,0 haline gelmesini istiyorum.
		
		List<Integer> tekrarsiz=new ArrayList<>();
		
		int tekrar;
		
		for(int i=0;i<arr.length;i++) {
			
			if(!tekrarsiz.contains(arr[i])) {
				tekrarsiz.add(arr[i]);
			}
			
		}
		System.out.println("Tekrasiz List : "+ tekrarsiz);		//[2, 3, 4, 5, 6, 7, 8, 9, 1, 0]
		
		int tekrarsizArray[]=new int[tekrarsiz.size()];
		
		System.out.println(Arrays.toString(tekrarsizArray));	// [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		
			for(int i=0;i<tekrarsizArray.length;i++) {
			tekrarsizArray[i]=tekrarsiz.get(i);			//element almak icin get
			}
			
			System.out.println("Tekrasiz Array : "+Arrays.toString(tekrarsizArray)); // yeni element index eklenemez
	}

}
