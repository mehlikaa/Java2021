package HB05_StringManipulationHB;

import java.util.Scanner;

public class Q06_contains_replace_hotmailGmailDegis {
    public static void main(String[] args) {
       /*
       kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */
    	
    	// --me--
    	Scanner scan=new Scanner(System.in);
    	System.out.print("Ëmail adresinizi giriniz :");
    	String email= scan.next();
    	
    	if (email.contains("@gmail.com")) {
    		System.out.println("Dogru bir gmail adresi girdiniz.");
    	}	else if (email.contains("@hotmail.com")) {
    		System.out.println("Hotmail adresi girdiniz. Hemen duzeltiyorum.");
    		System.out.println(email.replace("hot","g"));
    	} else {
    		System.out.print("Gecerli bir email adresi giriniz.");
    		
    	}
      scan.close(); 
      // ---- me ----
    }
}
