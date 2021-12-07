package Day14_staticKeywords;

import java.util.Arrays;

public class EC02_Arrays_example {

	public static void main(String[] args) {
		// Create a String Array, put "Ali", "Veli", "Mete", "Can" as elements 
		// sort the elements
		// find the last element after sort() method

		// int arr1[]=new int[4];
		String arr5[]={ "Ali", "Veli", "Mete", "Can"};
		System.out.println(Arrays.toString(arr5));
		System.out.println("==SORT of string array ");
		
		Arrays.sort(arr5);
		System.out.println(Arrays.toString(arr5));
		
	}

}
