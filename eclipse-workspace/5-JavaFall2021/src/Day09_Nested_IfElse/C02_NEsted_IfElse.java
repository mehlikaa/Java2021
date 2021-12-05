package Day09_Nested_IfElse;

import java.util.Scanner;

public class C02_NEsted_IfElse {
	
	public static void main(String[] args) {
		// Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. 
		// Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin. 
		// Son rakamı 0 ise ekrana “5’e bölünen  çift sayı” yazdırın. 
		// Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın. 
		// Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 4 basamakli bir sayi giriniz.");
		
		int sayi=scan.nextInt();
		
		if (sayi<1000 || sayi>9999) { // 4 basamakli olmayan sayilari eleyecek
			System.out.println("Dort basamakli pozitif sayi girmelisiniz.");
			
		} else {                // 4 basamakli sayilari yakalayacak
			
			if (sayi%5==0) {    // 5é tam bolunenler
				
				if(sayi%10==0) {     //son rakamimiz 0 ise
					System.out.println("5 bolunen cift sayi");
				} else {             //son rakamimiz 0 degil ise
					System.out.println("5 bolunen tek sayi");
				}
				
				
			} else {           // 5é tam bolunemeyenler
				System.out.println("5'e bolunemiyor, \n Tekrar deneyiniz");
				
			}	
		}	
		
		scan.close();
	}
}
