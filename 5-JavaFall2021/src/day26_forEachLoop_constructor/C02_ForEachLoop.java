package day26_forEachLoop_constructor;

public class C02_ForEachLoop {

	public static void main(String[] args) {
		
		int arr[]= {3,4,5};
		int carpim=1;

		for (int e:arr){
			carpim*=e;
		
			
		}
		System.out.println("Array elemanlari carpimi: "+carpim);
	}

}
