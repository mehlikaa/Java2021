package Day15_Arrays;

import java.util.Arrays;

public class EC03_array {

	public static void main(String[] args) {
		//[0, 2, 3, 0, 12, 3] put the zeros to the end

		
		int arr[]= {0, 2, 3, 0, 12, 3, 5, 10, 0};
		
	System.out.println(Arrays.toString(arr));
	
	Arrays.sort(arr);	
		
	System.out.println("sort: "+ Arrays.toString(arr));   //[0, 0, 2, 3, 3, 12]
	
	
	
	int count=0;
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]==0) {
				count++;
				
			}
			System.out.println("i : "+ i + "Count: "+ count);
			
		}
		int arr2[]=new int[arr.length];
		
		for (int ii=0; ii<arr.length-count;ii++) {
			//if (arr[ii]!=0)	{
				arr2[ii]=arr[ii+count];
			//}
		}
		System.out.println("Sifirlar sona: "+ Arrays.toString(arr2));
	}

}
