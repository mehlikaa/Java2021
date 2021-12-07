package HB05_StringManipulationHB;

import java.util.Scanner;

public class Q03_indexOf_LastIndexOf_3kelimeli_Isminin_basHarfleri {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.

    	Scanner scan=new Scanner(System.in);
    	System.out.print("3 kelimeden olusan isminizi giriniz : ");
    	
    	String isim=scan.nextLine(); //ilk harf charAt(0) verir
    								// 
    	
    	char ilkHarf=isim.toUpperCase().charAt(0);
    	char ikinciHarf=isim.toUpperCase().charAt(isim.indexOf(" ")+1);
    	char ucuncuHarf=isim.toUpperCase().charAt(isim.lastIndexOf(" ")+1);
    	// 
    	System.out.println("Isminizin bas harfleri : "+ilkHarf+"."+ikinciHarf+"."+ucuncuHarf+".");
    	
    	
    	scan.close();   
    }       
}
