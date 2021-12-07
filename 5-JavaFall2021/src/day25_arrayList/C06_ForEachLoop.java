package day25_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ForEachLoop {

	public static void main(String[] args) {
	
		//index ile hic ugrasmadan bir array veya listedeki tum elemanlari
		// gizden gecirmek isteriz.
		
		int arr[]= {1,2,3,5,3,2,7};
		
		// bu arrayi esnek bir list yapmak istiyorum.
		// esnek olmasa asList yapilabilirdi
		
		List<Integer> yeniList=new ArrayList<>();
		
		// for(int i=0; i<arr.length;i++) {
		// 	yeniList.add(arr[i]);
		// } 
		System.out.println("Listem : "+Arrays.toString(arr));
		// System.out.println("Listem : "+yeniList);
		// index ile atadik ama indexle ugrasmak istemiyorsaniz.
		//esch ben sectim isim; arr deki her bir int bana getir
		for(int each : arr ) {
			yeniList.add(each);
		}
		
		System.out.println("Array: "+Arrays.toString(arr));
		System.out.println("Each ile Listem : "+yeniList);
		// eger bir arrayin tum elementleri ile islem yapacaksak
		// indexle ugrasmadan
		
		
		
		// eger bir listin veya arrayin tum elemanlarini elden gecirmek istiyorsak ve
		// siralama onemli degilse
		// for-each loop kullaniriz.
	}	

}
