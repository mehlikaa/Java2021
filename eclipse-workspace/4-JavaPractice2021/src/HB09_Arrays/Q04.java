package HB09_Arrays;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		/* beraber derste yaptik anladim
		 *  verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
		 * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
		 * int istenenToplam=9;
		 */        
			// dinamik icin sayi istenir
				Scanner scan=new Scanner(System.in);
				System.out.println("Toplamlarinin kac olmasini istersiniz? ");
				int istenenToplam=scan.nextInt();
				
				
		int arr[]={5,7,-6,4,2,15,3,8,1};
		 // int istenenToplam=9;           /static ustteki dinamik
		
		for(int i=0;i<arr.length;i++) {		// arr icini kontrol
			
			for(int j=i+1;j<arr.length;j++) {		// arr icini kontrol
				if(arr[i]+arr[j]==istenenToplam) {
					System.out.println(arr[i]+" + "+arr[j]+" = "+istenenToplam);
				}
			}
		}
	}

}
