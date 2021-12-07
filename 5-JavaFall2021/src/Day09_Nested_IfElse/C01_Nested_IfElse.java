package Day09_Nested_IfElse;

import java.util.Scanner;

public class C01_Nested_IfElse {

	public static void main(String[] args) {
		
	//	Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
	// Kullanicidan bir sifre girmesini isteyin
	// Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. 
	// Ilk harf A ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.
	// Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. 
	// Ilk harf z ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.
		
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen bir sifre giriniz.");
	
	char ilkkarakter=scan.next().charAt(0);
	if (ilkkarakter>='A' && ilkkarakter>='Z') { //buyuk harfleri secmis olacak
		if(ilkkarakter=='A') {
			System.out.println("Gecerli Sifre ");
		} else {
			System.out.println("Gecersiz Sifre ");
		}
		
		
	} else if(ilkkarakter>='a' && ilkkarakter>='z') { //buyuk harfleri secmis olacak
		
		if(ilkkarakter=='z') {
			System.out.println("Gecerli Sifre ");
		} else {
			System.out.println("Gecersiz Sifre ");
		}
	}
	else {    //geriye kalan tum karakterler icin harfleri secmis olacak
		System.out.println("Gecerli bir Sifre olmasi icin, harfle baslamalisiniz");
	}
	
	
	
	scan.close();
	
	}
	
	
}
