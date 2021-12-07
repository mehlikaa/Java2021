package Day07_Basit_IfCumleleri;

import java.util.Scanner;

public class C01_Basit_IfCumleleri {
	
	public static void main(String[] args) {
		
		/* Soru2- Kullanicidan gun isimlerinin ilk harflerini izleyin.
		 * ve o harfle baslayan gun isimerini yazdirin.
		 * ornek: ilkHarf=P output="Pazar, Pazartesi veya Persembe
		 *ilkHarf=S output="Sali"
		 *Buyuk Kucuk harf problem olmamasi icin, 
		 *     toUpperCase methodu kullanilir.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen gun isimlerinden birinin ilk harfini yaziniz. ");
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		
		if (ilkHarf=='P') {
			System.out.println("Pazar, Pazartesi ve PErsembe");	
		}
		if (ilkHarf=='S') {
			System.out.println("Sali");	
		}
		if (ilkHarf=='C') {
			System.out.println("Carsamba");	
		}
		if (ilkHarf!='C'&&ilkHarf!='P'&&ilkHarf!='S'){
				System.out.println("Lutfen, ('P','S'veya 'C') gun isimlerinden birinin bas harfini yaziniz.");
		}
		scan.close();	
	}
}
