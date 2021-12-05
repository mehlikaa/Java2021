package Day12_tekrar_edilecek;

import java.util.Scanner;

public class C01_indexOf {
	
	public static void main(String[] args) {
		
		//Kullanicidan bir cumle ve bir harf isteyin.
		// harfin cumlede var olup olmadigini yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz.");
		
		String cumle=scan.nextLine();
		System.out.println("Lutfen varligini kontrol etmek icin bir harf giriniz");
		
		char krk=scan.next().charAt(0); // girilen karakterin indexini verir.
		int index=cumle.indexOf(krk);
		
		if (index<0) {
			System.out.println("Girdiginiz harf cumlede yok"); 
			
		} else { 
			System.out.println("Girdiginiz harf cumlede var.");
		}
		
		
	}

}
