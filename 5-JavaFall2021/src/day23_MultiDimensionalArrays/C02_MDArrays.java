package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C02_MDArrays {

	public static void main(String[] args) {
		// MultiDimensional Arrayler ic ice konulmus arrayler demektir.
		// array olusturmak icin iki yontem vardi. Once deklare edip sonra deger atmak . Bu uzun
		//
		int arr[][]=new int[3][2]; //outer arrayi 3 elamnli, her bir inner array ise 2 elemanli olan MDArray olusturulur.
				// bu yontemle olusturdugumuzda inner arraylerin hepsi ayni boyutta olmalidir.
				
		
		System.out.println(Arrays.toString(arr)); // outerin icinde, primitive olmali ama icinde bir non-primitive array var. 
													// [[I@5fcfe4b2, [I@6bf2d08e, [I@5eb5c224]
		
		
		System.out.println(Arrays.toString(arr[0]));	// [0, 0]
		
		System.out.println(Arrays.deepToString(arr)); //	deepToString
		arr[0][1]=5;
		arr[1][0]=2;
		arr[2][1]=2;
		System.out.println(Arrays.deepToString(arr)); //[[0, 5], [2, 0], [0, 2]]
		
		//2.yontemle DMarray olusturma, farkli element sayilarina ihtiyacimiz oldugunda
		
		int arr2[][]= {{0},{1,2,3},{6,7,8,9}};
		System.out.println(Arrays.deepToString(arr2));	//[[0], [1, 2, 3], [6, 7, 8, 9]]
		System.out.println(Arrays.toString(arr2[1]));	// [1, 2, 3]
		System.out.println(arr2[2][1]);					// 7
	}

}
