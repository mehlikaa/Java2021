package Day22_Arrays;

import java.util.Arrays;

public class C02_Split {

	public static void main(String[] args) {
		// "Java ogrenmek cok guzel"
		// cumlesinin kelimelerini ters sirada yazdirin
		
		String cumlem="Java ogrenmek, cok guzel ";
		
		System.out.println(cumlem);
		String arr1[]=cumlem.split(",");
		String arr2[]=cumlem.split(" ");
		String arr3[]=cumlem.split("");
		
		System.out.println(", ile : "+Arrays.toString(arr1));
		System.out.println(" \" \"  ile : "+Arrays.toString(arr2));
		System.out.println(" \"\" ile : "+Arrays.toString(arr3));
		
		System.out.println("================");
		
		String cumle="Java ogrenmek cok guzel ";
		
		String kelimeler[]=cumle.split(" ");
		System.out.println(" \" \"  ile : "+Arrays.toString(kelimeler));
		
		for (in i=0)
		for loop alinacak
		
	}

}
