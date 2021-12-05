package calismaGrubu;

import java.util.Arrays;

public class CG01 {

	public static void main(String[] args) {

		int arr1[][] = { { 1, 2 }, { 3, 4, 5 }, { 6 } };
		int arr2[][] = { { 7, 8, 9 }, { 10, 11 }, { 12 } };

		System.out.println(Arrays.deepToString(arr1));
		System.out.println(Arrays.deepToString(arr2));
		int i = 0;
		int j = 0;
		int i2 = 0;
		int j2 = 0;

		for (i = 0; i < arr1.length; i++) {

			if (arr1[i].length <= arr2[i].length) {

				for (j = 0; j < arr1[i].length; j++) { // arr1[0][0]

					System.out.println("Toplam [" + i + "][" + j + "] : " + arr1[i][j] + "+" + arr2[i][j] + "="
							+ (arr1[i][j] + arr2[i][j]));

				}
			} else {
				
				for (j = 0; j < arr2[i].length; j++) { // arr1[0][0]

					System.out.println("Toplam [" + i + "][" + j + "] : " + arr1[i][j] + "+" + arr2[i][j] + "="
							+ (arr1[i][j] + arr2[i][j]));

				}
			}

		}
	}
}
