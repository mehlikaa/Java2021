package Day21_ScopeArrays;

import java.util.Arrays;

public class C04_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= { 2, 4, 5, 6, 7, 8, 9};
		
		// tum elementleri yazdirma
		System.out.print("Yanyana : ");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		for (int i=0;i<arr.length;i++) {
			
			System.out.println("\nAlt alta : "+ arr[i]+" ");
			
		}
		System.out.println("Arrays.toString ile : "+Arrays.toString(arr));
		
		
	}

}      
