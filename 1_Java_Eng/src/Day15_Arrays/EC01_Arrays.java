package Day15_Arrays;

import java.util.Arrays;

public class EC01_Arrays {
	
	public static void main(String[] args) {
		
		/* Create an array, whose elements are "Ali ", "Bekir", "Zehra", "Yasin", "Mary"
		 * and then print the elements in alphabetical order on the console
		 * in different lines
		 */
		
		//        longer way
		//String arr[]=new String[5];
		//System.out.println(Arrays.toString(arr));   // output : [null, null, null, null, null]
		
		/* 	arr[0]="Ali";
		   	arr[1]="Zehra";
			arr[2]="Bekir";
			arr[3]="Yasin";
			arr[4]="Mary";
		 								*/
		
		// How to write in a shorter way
		String arr[]= {"Ali ", "Bekir", "Zehra", "Yasin", "Mary"}; 
		System.out.print(Arrays.toString(arr));       // [Ali , Bekir, Zehra, Yasin, Mary]
		Arrays.sort(arr);
		System.out.println("\nAfter sort :\n"+ Arrays.toString(arr));   //[Ali , Bekir, Mary, Yasin, Zehra]
		/*	Ali 
			Bekir
			Mary
			Yasin
			Zehra
		 */
		for (int i=0; i<arr.length ; i++) {
			System.out.println(arr[i]);
			
		}
		
		/* 	Zehra
			Yasin
			Mary
			Bekir
			Ali 
		 */
		//print the elements in reversed alphabetical order on the console in different lines
		
		for (int i=arr.length-1; i>=0 ; i--) {
			System.out.println(arr[i]);
			
		}
		
	}
}
