package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C03_MDArray_Metodla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MDArray,tum elemanlarinin carpimini ekrana yazdiran
		//metod yazdirma
				
		int arr1[][]= {{1,2,3,3,2},{4,5,6},{3,4,87,6}};		//arr[outer] [inner]
				
				
		carpimYazdir(arr1);
				
			
	}

	private static void carpimYazdir(int[][] arr1) {
		int carp=1;
		
		for(int i=0;i<arr1.length;i++) {			//outer
			for(int j=0;j<arr1[i].length;j++) {		//inner
				carp*=arr1[i][j];
				System.out.print(arr1[i][j]+"  ");
			}
		}													// M D Array icin
		System.out.println("\n"+Arrays.deepToString(arr1));		//deepToString(arr);
		System.out.println("Sayilarin carpimi : "+ carp);

		
	}

}
