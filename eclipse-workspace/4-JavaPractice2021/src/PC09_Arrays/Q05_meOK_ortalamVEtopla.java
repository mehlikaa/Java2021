package PC09_Arrays;

import java.util.Arrays;

public class Q05_meOK_ortalamVEtopla {

	public static void main(String[] args) {
		/*
		 * write a java program that calculates the average value of array elements
		 * Print elements that are greater than avarage (dizi elemanlarinin ortalama
		 * degerini hesaplayan ve ortalamadan büyük olan elemanlari yazdıran bir java
		 * programi yazin) input[]= {1,2,3,4,5,6,7} Output : 4
		 */

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 10, 12, 14 };
		int topla = 0;
		int ortalama = 0;

		System.out.println("Ilk listem : " + Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			topla += arr[i];
		}
		ortalama = topla / arr.length;
		System.out.println("Ortalamasi : " + ortalama);

		System.out.print("Ortalamadan buyuk sayilar : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > ortalama) {
				System.out.print(arr[i] + " ");
			}
		}
		
	}

}
