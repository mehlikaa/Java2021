package Day21_ScopeArrays;

import java.util.Arrays;

public class C05_Arrays {

	public static void main(String[] args) {
		// Soru 1: Verilen 3 elemanli bir array’in tum elemanlarini bir soldaki 
		// konuma tasiyacak bir program yazin. 
		// Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.

		int arr1[]= {1,2,3};
		int arr2[]=new int[3];
		
		arr2[0]=arr1[1];
		arr2[1]=arr1[2];
		arr2[2]=arr1[0];
		
		System.out.println("Array1 : "+Arrays.toString(arr1));
		System.out.println("Array2 : "+Arrays.toString(arr2));
		System.out.println("================================");
		
		int arr[]= {1,2,3,4,5,6,7,8,9,0};
		int kova=arr[0];		//gecici temp bir kova
		
		
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=kova;
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}

}
