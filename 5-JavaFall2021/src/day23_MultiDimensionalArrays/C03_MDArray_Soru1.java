package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C03_MDArray_Soru1 {

	public static void main(String[] args) {
		//MDArray,tum elemanlarinin carpimini ekrana yazdiran
		int arr1[][]= {{1,2,3,3,2},{4,5,6},{3,4,87,6}};		//arr[outer] [inner]
		
		int carp=1;
		
		for(int i=0;i<arr1.length;i++) {			//outer
			for(int j=0;j<arr1[i].length;j++) {		//inner
				carp*=arr1[i][j];
				System.out.print(arr1[i][j]+"  ");
			}
		}													// M D Array icin
		System.out.println("\n"+Arrays.deepToString(arr1));		//deepToString(arr);
		System.out.println("Sayilarin carpimi : "+ carp);
		
		System.out.println("======= 3.luu======");
		int arr3[][][]= {{{1,2,3,3,2},{4,5,6},{3,4,87,6}},{{2,2},{2,4,5},{1,1,1}}};	
		for(int i=0;i<arr3.length;i++) {			//outer
			for(int j=0;j<arr3[i].length;j++) {	
				for(int k=0;k<arr3[i][j].length;k++) {
					System.out.print(arr3[i][j][k]+"-");;	
				}
			}
		}
		
		
		System.out.print("\n Ahanda uclu Arrayim\n "+Arrays.deepToString(arr3));
		
		
		
		//int arr[][]= {{1,2,3},{4,5,6}};
	}

}
