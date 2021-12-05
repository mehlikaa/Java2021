package day31_dateAndTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C06_Varargs_me {

	public static void main(String[] args) {

//		int x = 3;
//		int y = 5;
//		int z = 9;
//		int t = 5;
//		int s = 1;

		Scanner scan = new Scanner(System.in);

		System.out.print("Kac sayi girmek istersiniz ");
		int adet = scan.nextInt();

		int arr[] = new int[adet];
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < adet; i++) {
			System.out.println((i + 1) + ". sayiyi giriniz : ");
			int x = scan.nextInt();
			list.add(x);
			arr[i] = x;
		}
		sumList(list);
		sumArr(arr);
		
	}

	private static void sumList(List<Integer> list) {

		int toplam = 0;
		for (int s : list) {
			toplam += s;
		}
		System.out.println("Toplam List: " + toplam);
	}

	private static void sumArr(int[] arr) {

		int toplam = 0;
		for (int s : arr) {
			toplam += s;
		}
		System.out.println("Toplam Arr: " + toplam);
	}
	
	


	public static void sum(int... list) {
		int toplam = 0;
		for (int s : list) {
			toplam += s;
		}
		System.out.println("Toplam : " + toplam);
	}

	public static void carp(int... sayi) {
		int carpimlar = 1;
		for (int c : sayi) {
			carpimlar += c;
		}
	

}
}