package P03_05_StringManipulationHB;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
		/*
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */
     
    	
    	Scanner scan=new Scanner(System.in);
    	System.out.print("Email adresinizi giriniz : ");
    	
    	String email=scan.nextLine();
    	
    	if (email.contains("@")) {
    		
    		
    	}else {
        	System.out.print("Gecerli bir email adresi giriniz. ");

    	}
    }

}
