package day23_MultiDimensionalArrays;

public class C04_MDArray_Soru2 {

	public static void main(String[] args) {
		
		//	Soru 2: Asagidaki MDArrayin ic arraylerindeki son  elemanlarin carpimini
		// ekrana yazdiran bir program yaptirin.
		// {{1,2,3,4},{4,5,2},{6,3}}

		int arr[][]= {{1,2,3,4},{4,5,2},{6,3}};
		
		int sonuc=1;
		
		for(int i=0;i<arr.length;i++) {
			sonuc*=arr[i][arr[i].length-1];
			
		}
		System.out.println("Sonuc "+sonuc);	//90     son elementleri ekledikten sonra 24
	}

}
