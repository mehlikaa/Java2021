package Day14_staticKeywords;

import java.util.Arrays;

/*
 * 1) Arrays are the store multiole data in a single container
 * 2) All the data in an array must be same
 * 3) Arrays can accept only "Primitives"and "referances" as element
 *    Arrays can't accept   non-primitives as data type
 	  We can use references of string (addresses of String
	4) Array is non-primitive 
 */
public class EC02_Arrays01 {

	public static void main(String[] args) {
		// How to create array
		int arr1[]=new int[4];   // 4 : how many elements do we want to keep 
								// Java ask before
								// int[] arr1=new int[4]; possible creations int[] arr1; like main body structure
		// how to print on the console
		
		System.out.println(arr1);  //  [I@5fcfe4b2    : adresi yazdirdi return
									// it turns the address of arrays
		System.out.println(Arrays.toString(arr1));  //[0, 0, 0, 0]  default values 
	
		// how to add elements in an array
		arr1[0]=4;
		System.out.println(Arrays.toString(arr1));  // [4, 0, 0, 0]
		arr1[3]=8;
		System.out.println(Arrays.toString(arr1));  // [4, 0, 0, 0]
		
		// make second element[1] 7, third element[2] 10 and check it
		arr1[1]=7;
		System.out.println(Arrays.toString(arr1));  // [4, 7, 0, 8]
		arr1[2]=10;
		System.out.println(Arrays.toString(arr1));  // [4, 7, 10, 8]
		/*
			[I@5fcfe4b2
			[0, 0, 0, 0]
			[4, 0, 0, 0]
			[4, 0, 0, 8]
			[4, 7, 0, 8]
			[4, 7, 10, 8]
		 */
		
		// how to print a specific element on the console
		System.out.println(arr1[0]);     // 4 returns
		// System.out.println(arr1[4]);    //ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		// no red underline , not compile time error
		// if we get error message after we run the code,
		// then it is Run Time Error
		//how to get the last element
		System.out.println(arr1[arr1.length-1]);   //son indextekini verir
		
		
		// how to get the number of elements in an array
		System.out.println(arr1.length+"\n\n");    //it has 4 elemnets, length is not a method
		
		//how to put elements in ascending order , smallest to biggest
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));    // [4, 7, 8, 10] 
		
		
		// how to print the smallest and the biggest element on the console
		Arrays.sort(arr1);  		// after this [0] is the smallest, last index is the biggest one.
									// firstly we use sort() method to put elements from smallest to biggest
		System.out.println(arr1[0]);  			// the smallest      4
		System.out.println(arr1[3]);  			// the biggest 	 10
		System.out.println(arr1[arr1.length-1]);               //10
		
		
		
		
		
		
		
		
	}

}
