package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_Array {

	public static void main(String[] args) {
		// verilen bir arrayden, istenen degere sahip elementleri silip kalani yeni bir array ile 
		// olarak kaydeden ve yeni kaydedin deyip ve
		// yeni arrayi yazdirin. bir java prog

		// 3leri sil dersek, array indexi degisir, hiclik yapamayiz
		// 0 yapabiliriz, ""ve bosluk yapamayiz. 
		//yeni eleman ekllenmez yada var olanlari silemeyiz. cumku arrayin declare edilen uzunlugu degismez.
		// length degismez, yeni bir array olusturup 3ún disindakileri atabilirim
		//Bu soruda istenen elementi sildigimizde, geruye kac element kaliyor? silinecek elemandan kac tane var.
		
		
		
		int arr[]= {3,4,5,6,3,5,8,3,4,9,3,45,12,3,5,7,13};
		int silinecekElement=5;
		System.out.println("Ilk Array : "+Arrays.toString(arr));
		//sortun burda bir faydasi ok, bu arrayde var mi yok mu bakar ama kac tane var bilemez.
		// silinecek sayi adedini bulalim.
		
		int sayac=0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==silinecekElement){
				sayac++;
				
			}
		}
		
		System.out.println(sayac);
		
		int yeniArrUzunluk=arr.length-sayac;
				//artik yeni arrayí olusturabiliriz
		
		int yeniArr[]=new int[yeniArrUzunluk];
				//simdi eski arraydeki elemanlarin birer birer alip
				//silinecek elemana esit olmayanlari yeni arrayé atamaliyiz.
		
		int j=0;
		for(int i=0;i<arr.length ;i++) {
			
			if (arr[i]!=silinecekElement) {
				
				yeniArr[j]=arr[i];
				j++;	
				
			}
		}
		System.out.println("Yeni Array : "+ Arrays.toString(yeniArr));
		
	}

}
