package day26_forEachLoop_constructor;

public class C03_denemeler {

	public static void main(String[] args) {
		
		String ss="Hello";
		String t= new String(ss);
		
		if(ss==t) {
			System.out.println("qaa");
		} else System.out.println("aaaaaaaaaA");
		

		int arr[][] = { {1, 2}, {3}, {4, 5, 6} };
		int sum = 0;	
			for(int[] each : arr) {			
					//for(int z : each){
				System.out.println(each);
						 //sum = sum + z;
					}
			
					}	
//			System.out.println("Arr length "+ arr.length+ " "+ arr[1].length+" "+arr[2].length);
//		System.out.println(sum);
//		
//		System.out.println(arr.clone());
//	}

}
