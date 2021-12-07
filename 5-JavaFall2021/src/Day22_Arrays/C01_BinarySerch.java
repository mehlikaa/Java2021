package Day22_Arrays;

import java.util.Arrays;

public class C01_BinarySerch {

	public static void main(String[] args) {
		
		String isimler[]= {"Hacer", "ainagul", "Emine", "Murat", "Kutlu"};
			
		//isimler arrayinde Murat ismi var mi?
		
		// array de arama yapmadan once siralama yapmaliyiz
		
		Arrays.sort(isimler); //atamasiz degisim kalici oldu mu?
								// evet kalici oldu
		
		System.out.println(Arrays.toString(isimler));
		// sort(); elementleri natural orderlara gore siralar. Sayi ie, kucukten buyuge harf ise ascii siralamasina gore
		isimler[4]="Ainagul";
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler));

		System.out.println(Arrays.binarySearch(isimler,"Murat"));   // 4
		
		System.out.println(Arrays.binarySearch(isimler,"Mehmet"));	//-5
		System.out.println(Arrays.binarySearch(isimler,"Tuba"));	//-6
		System.out.println(Arrays.binarySearch(isimler,"Kursat"));	//-4
		System.out.println(Arrays.binarySearch(isimler,"kursat"));	//-6
	}

}
