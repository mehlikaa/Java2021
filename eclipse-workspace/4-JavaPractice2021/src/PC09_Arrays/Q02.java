package PC09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
// beraber      //static bir array ornegi       //dinamik de alinabilir

        //multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
        // ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
        //input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

    	
		Scanner scan=new Scanner(System.in);
		System.out.print("Kac katli olusturmak istersiniz? ");
		int kat=scan.nextInt();

		int arr[]=new int[arr];
		
		for (int i=0;i<arr.length;i++) {
			System.out.print("Arrray'in "+(i+1)+". elemanini giriniz.");
			arr[i]=scan.nextInt();
			
		}
    	
    	
    	
    	//== alt ok ======ustte dinamik lusturmaca
    	
    	
    	int arr1[][]= {{10,20,30},{4},{6,7,20}}; 	//apartman
    	
    	int yeniArr[]=new int[arr1.length];
    	int toplam=0;
    	
    	for (int kat=0; kat<arr1.length;kat++) {
    	
    		for (int daire=0; daire<arr1[kat].length;daire++) {
    			yeniArr[kat]+= arr1[kat][daire];
    				  		
    		}
    	}
    	
    	System.out.println(" "+Arrays.toString(yeniArr) );  
    }
}
