package Day07_Basit_IfCumleleri;

import java.util.Scanner;

public class C03_Basit_IfCumleleri {

		public static void main(String[] args) {
			
	        /*
	         * Soru 3) Kullanicidan gun ismini alin ve 
	         * haftaici veya hafta sonu oldugunu yazdirin 
	            Ornek:      gun=Pazar output = “Hafta sonu”
	                        gun=Sali output = “Hafta ici”
	         *** String icin equals method’unu kullanin

	         */

			Scanner scan=new Scanner(System.in);
			System.out.println("Gun ismini giriniz.");
			String gun=scan.next().toLowerCase();
			
			if (gun.equals("pazar") || gun.equals("cumartesi")) {
			System.out.println("Haftasonu");			
			}
			
			if (gun.equals("pazartesi") || gun.equals("sali")
					      || gun.equals("carsamba")|| gun.equals("persembe")
					      || gun.equals("cuma")) {
			System.out.println("Haftaici");			
			}
			
			/*if (gun.equals("pazartesi") || gun.equals("sali")
				      || gun.equals("carsamba")|| gun.equals("persembe")
				      || gun.equals("cuma")|| gun.equals("cumartesi")
				      || gun.equals("pazar")) {
		System.out.println("Lutfen  bir gun ismi veriniz");			
		}
        */
			//String Non-primitive oldugu icin, == kullanilmaz.
			// bunun yerine equals kullanilir.
			scan.close();	
		}
}
