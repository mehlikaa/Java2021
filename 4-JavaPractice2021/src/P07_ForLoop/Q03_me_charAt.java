package P07_ForLoop;

import java.util.Scanner;

public class Q03_me_charAt {

	public static void main(String[] args) {
		
		/*Girilen bir stringdeki a harfi sayısını bulunuz.ama c harfine gelirse
		  döngüden çıkılsın
		 
		  Bugün hava oldukca güzel.-> 2 str.CharAt(0)
		 
		 */ 
		
		
// ---- me OK ----//
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("bir metin giriniz : ");
		String str = scan.nextLine();
		
		int aMiktar=0;
		for(int i=0;i<str.length();i++) {
			
			if(str.toLowerCase().charAt(i)=='a') {
				aMiktar++;
			}else if(str.toLowerCase().charAt(i)=='c') { 
				System.out.println("C gordum Lutfen cikalim");
				break;
			}
		}
		System.out.println(aMiktar+ " adet a harfi bulunmaktadir.");
	}

}
