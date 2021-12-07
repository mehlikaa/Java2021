package PC09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_me {
	// kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	// ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	// java programi yazin
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Kac indexli bir array olusturmak istersiniz? ");
		int arrx=scan.nextInt();
		int enb=0;
		int enk=0;
		
		int arr[]=new int[arrx];
		int x=0;
		while(x<arrx) {
			System.out.print(x+". index degerini giriniz.");
			arr[x]=scan.nextInt();
			x++;
		}
	/* 
			// System.out.print(x+". index degerini giriniz.");
			if (arr[x]>=enb) {
				enb=arr[x];
			}
			
//	      ?????????????
			if (arr[x]<enk) {
				enk=arr[x];
			}
			
			x++;
		}
		
		System.out.println("Arrayimiz: "+Arrays.toString(arr));
		System.out.println("Arrayimizin en buyugu : "+enb);
		System.out.println("Arrayimizin en kucugu : "+enk);

*/		
	Arrays.sort(arr);
	System.out.println("Arrayimiz: "+Arrays.toString(arr));
	System.out.println("Arrayimizin en buyugu ve kucugu arsindaki fark : "+(arr[arrx-1]-arr[0]));
			
	}

}
