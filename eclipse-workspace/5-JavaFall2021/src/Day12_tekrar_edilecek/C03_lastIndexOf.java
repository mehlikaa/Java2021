package Day12_tekrar_edilecek;

import java.util.Scanner;

public class C03_lastIndexOf {

	public static void main(String[] args) {
		//Kullanicidan bir cumle ve bir harf isteyin
		// harin cumlede var olup olmadigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz.");
		
		String cumle=scan.nextLine();
		System.out.println("Lutfen varligini kontrol etmek icin bir harf giriniz");
		
		char krk=scan.next().charAt(0); 
		
		int index= cumle.lastIndexOf(krk);
		
		if (index==(-1))   {
			System.out.println("Bu cumlede bu harf kullanilmamis"); 
			
		} else {
			System.out.println("kullanilmistir");
			
		}

	}

}
