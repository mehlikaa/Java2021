package P03_05_StringManipulationHB;

import java.util.Scanner;

public class Q04_substringCharAt_4harfSayi_terstenYazdirma {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin
    	
    	// -- me --
    	Scanner scan=new Scanner(System.in);
    	System.out.print("4 harfli bir kelime girin :");
    	String kelime=scan.next();
    	
    	if (kelime.length()>4) {
    		System.out.print("Kelimeniz 4 harften fazla olmamali");
    	} else if (kelime.length()<4) {
       		System.out.print("Kelimeniz 4 harften az olmamali");
       	} else {
       		//char bir=kelime.charAt(0);
       		
       		System.out.println(kelime.substring(3)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.charAt(0));
       		System.out.println(kelime.substring(3)+kelime.charAt(2)+kelime.charAt(1)+kelime.charAt(0));
       		System.out.println(kelime.charAt(3)+kelime.charAt(2)+kelime.charAt(1)+kelime.charAt(0)); //neden sayi donduruyor?
       	}
       	scan.close();
       	// ----me ----
    }
}
