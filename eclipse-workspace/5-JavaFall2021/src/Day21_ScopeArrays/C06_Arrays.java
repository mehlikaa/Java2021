package Day21_ScopeArrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= {3,5,8,5,2,4};
		int toplam=0;
		for (int i=0; i<arr.length;i++) {
			toplam=arr[i];
			
		}
		System.out.println("Toplam : "+ toplam);
		
		//Arrayín tum elemanlarini kucukten buyuge 
		
		Arrays.sort(arr);
		System.out.print("Kucukten buyuge siralama : "+Arrays.toString(arr));
	
		
		// ve  buyukten kucuge yazdirin.
	
		System.out.print("\n  Buyukten kucuge siralama : \n ");
		
		for (int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
			
		}
		
		
		// ve  buyukten kucuge Array seklinde yazdirin.
		int tersArr[]=new int[arr.length];
		for (int i=0; i<tersArr.length-1;i++) {
			tersArr[i]=arr[arr.length-1-i];
			
		}
		System.out.print("\n  Buyukten kucuge siralama : \n "+Arrays.toString(tersArr));
	}

}
