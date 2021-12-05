package DAY05;

import java.util.Scanner;

public class C03_Modulus {

		public static void main(String[] args) {
		//kullanicidan 3 basamakli bir sayi alip
		// rakamlar toplamini yazdiran bir program yazdirma
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Lutfen 3 basamakli bir sayi girniz.");
			
			int sayi=scan.nextInt();
			// sayi 573 olsun
			int rakamlarToplami=0;
			int rakam=sayi%10; //birler basamagini verir. 3
			
			rakamlarToplami+=rakam;
			
			sayi/=10;
			rakam=sayi%10;
			rakamlarToplami+=rakam;
			
			sayi/=10;
			rakam=sayi%10;
			rakamlarToplami+=rakam;
			
			//System.out.println(sayi);
			System.out.println(" Sayinizin Rakamlar Toplami ; "+rakamlarToplami);
			
			
			scan.close();
			
		}
}
