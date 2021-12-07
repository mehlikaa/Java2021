package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays_birlestirme {

	public static void main(String[] args) {
		
		// Verilen iki arrayi birlestiren ve sonucu 
		// birlesikarray adinda arraye kaydeden bir metod olusturunuz.
		// main method icinde yeni arrayi siralayiniz.
		
		int arr1[]= {3,5,7,10};
		int arr2[]= {2,4,6,8,9};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		int birlesikArr[]=birlestir(arr1,arr2); //birlestirilecek degerleri vermem lazim
		
		System.out.println(Arrays.toString(birlesikArr));
		Arrays.sort(birlesikArr);
		System.out.println(Arrays.toString(birlesikArr));
		
	}

	private static int[] birlestir(int[] arr1, int[] arr2) {
		
		int birlesikArr[]=new int[arr1.length+arr2.length]; //maindekini tanimadigi icin aynisini decleare edttik\
		System.out.println(Arrays.toString(birlesikArr));
		for(int i=0;i<arr1.length;i++) {
			
				birlesikArr[i]=arr1[i];
			}
		for(int i=0;i<arr2.length;i++) {
			
			birlesikArr[i+arr1.length]=arr2[i];
		}
		
		
		return birlesikArr;
	}

}
