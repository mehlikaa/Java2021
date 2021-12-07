package Day21_ScopeArrays;

public class C03_Array {

	public static void main(String[] args) {
		
		// Soru 1: Elemanlari “Ali” , “Veli”, “Ayse” ve “Fatma” olan
		// bir array olusturun ve bu  array’i yazdirin.
		
		String arr[]=new String[4];
		arr[0]= "Ali";
		arr[1]="Veli";
		arr[2]="Ayse";
		arr[3]="Fatma";
	
		String arr2[]= {"Ali","Veli","Ayse","Fatma"};
		arr2[0]="Can";
		arr2[2]="Gul";
		
		System.out.println(arr2[2]);
		// System.out.println(arr2[5]); //Error: ArrayIndexOutOfBoundsException: index sinirin disinda
		
		

	}

}
