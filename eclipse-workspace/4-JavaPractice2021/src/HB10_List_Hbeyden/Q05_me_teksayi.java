package HB10_List_Hbeyden;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q05_me_teksayi {
	public static void main(String[] args) {
		// Kullanıcıdan alacağınız 6 elemanlı bir dizinin
		// sadece tek elemanlarını ayrı diziye bir metodda atayarak
		// main de yazdırınız.

		Integer arr[] = new Integer[6];

		tekElemanlar(arr);
	}

	private static void tekElemanlar(Integer[] arr) {

		List<Integer> list = new ArrayList<>();

		Scanner scan = new Scanner(System.in);

		int i = 0;
		do {
			System.out.print((i + 1) + ". sayiyi giriniz: ");
			arr[i] = scan.nextInt();

			if ((arr[i] % 2) == 1) {
				list.add(arr[i]);
			}
			i++;
		} while (i < 6);

		Arrays.sort(arr);
		Collections.sort(list);
		System.out.print("Arayim " + Arrays.toString(arr));
/*
		Integer teksayi[] = new Integer[list.size()];

		for (int j = 0; j < list.size(); j++) {
			teksayi[j] = list.get(j);
		}
		System.out.println("\nSon Tek Sayi Listem : " + Arrays.toString(teksayi));
*/
	}
}
