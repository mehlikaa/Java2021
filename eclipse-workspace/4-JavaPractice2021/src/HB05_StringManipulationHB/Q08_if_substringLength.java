package HB05_StringManipulationHB;

import java.util.Scanner;

public class Q08_if_substringLength {
    public static void main(String[] args) {
        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
    	
    	//-- me -- girilen herhangi bir kelime icin
    	Scanner scan=new Scanner(System.in);
    	System.out.print("Bir kelime giriniz : ");
    	
    	String kelime=scan.next();
    
    	if (kelime.length()>=3) {
    		kelime=kelime.substring(kelime.length()-2);
    		System.out.print(kelime+kelime+kelime);
    	} else { 
    		System.out.print("Kelimeniz : "+ kelime.toUpperCase());
    	}
    	scan.close();
    	// ---- me ----
    }
}
