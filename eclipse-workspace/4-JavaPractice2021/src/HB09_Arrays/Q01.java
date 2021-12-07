package HB09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
	// kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	// ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	// java programi yazin
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Kac indexli bir array olusturmak istersiniz? ");
		int arrx=scan.nextInt();

		int arr[]=new int[arrx];
		
		for (int i=0;i<arr.length;i++) {
			System.out.print("Arrray'in "+(i+1)+". elemanini giriniz.");
			arr[i]=scan.nextInt();
			
		}
		Arrays.sort(arr);
		
		System.out.print(Arrays.toString(arr));
		System.out.print("Array'in en buyuk ve kucugu arasindaki fark : "+(arr[arrx - 1] - arr[0])); 
	}

}
