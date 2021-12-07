package Day15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EC02_Array {

	public static void main(String[] args) {
		
		// get the array elements from user and create an array
		// 2) MAke the second element first, first element last, last element second
		// [Ali, Veli, Mete, Efe, Kemal] ==> [Veli, Kemal, Mete, Efe, Ali]
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the length of the array ");
		int lengthArr=scan.nextInt();
		
		String arr[]=new String[lengthArr];
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the "+ (i+1)+". element");
			arr[i]=scan.next();
		}
		System.out.println(Arrays.toString(arr));
		// Arrays.sort(arr);
		// System.out.println(Arrays.toString(arr));
		
		String arrNew[]=new String[arr.length];
		
		arrNew[0]=arr[1];
		arrNew[1]=arr[arr.length-1];
		// arrNew[2]=arr[2];
		// arrNew[3]=arr[3];
		arrNew[arrNew.length-1]=arr[0];
		
		// for(int i=2; i<=arr.length-2;i++) {
		// 	arrNew[i]=arr[i];
		// }
		
		// System.out.println(Arrays.toString(arrNew));
		
		System.out.println("===============");
		
		
		for (int i=0; i<arr.length;i++) {
		
			if(i==0 || i==1 || i==arr.length-1) { 
			continue;
			}
		arrNew[i]=arr[i];
		}
		System.out.println("New : "+ Arrays.toString(arrNew));
		
		
		
		
	}

}
