package Day22_Arrays;

import java.util.Arrays;

public class C03_Split {

	public static void main(String[] args) {
		// "Java ogrendim, #cok para ?kazandim./"
		//cumlesinin kelimelerini , ozel karakterlerle ve noktalama isaretleri olmadan 
		// harf sirasina gore, yazdiralim.
		
		String cumle="Java ogrendim,  #cok para ?kazandim. ";
		
		String kelimeler[]=cumle.split(" ");
		System.out.println(Arrays.toString(kelimeler)); //[Java, ogrendim,, #cok, para, ?kazandim.] 
		
		int arr[]= {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr)); // ,space normal array yazimi olmasa da ekler.

		for (int i=0; i<kelimeler.length;i++) {
			kelimeler[i]=kelimeler[i].replaceAll("\\W", "");
			//System.out.println(kelimeler[i]);
		}
		System.out.println(Arrays.toString(kelimeler));   // array yazdirma
		
		// array degil kelimelerini yazdrimak icin
		kelimeler[0].replaceAll("\s","");
		for(int i=0;i<kelimeler.length;i++) {
			System.out.print(kelimeler[i]+" ");	// cumle oncesindaki hiclik boslugu nasil kaldiririrz
			
		}
	}

}
