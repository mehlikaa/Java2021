package P03_05_StringManipulationHB;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /*
         * Kullanicidan(Scanner) bir isim(string) isteyiniz ve isim sadece 3(lenght) harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

    	Scanner scan=new Scanner(System.in);
    	System.out.print("3 harfli bir isim giriniz : ");
    	
    	String isim=scan.nextLine();
    	
    	System.out.println("*******     If ile cozum      *******");
    	
    	char c1=isim.charAt(0);      // ilk harfi al
    	char c2=isim.charAt(1);      // ikinci harfi al
    	char c3=isim.charAt(2);      // ucuncu harfi al
    	
    	// if (isim.length()<=3) {
    	//	System.out.println("Girdiginiz isim 3 harfli olmali");   UC HARFTEN ASAGISINI KONTROL
    	//} else 
    	if (isim.length()==3) { 
    		if (c1!=c2 && c2!=c3 && c1!=c3) {   //harfler uniq mi? bir defa mi kullanildi.
    			System.out.println("Girilen isim 3 harfli ve unique.");
    		} else { 
    			System.out.println("Girilen isim 3 harfli ve ama unique degil.");
    		}
    	} else {
    		System.out.println("Girilen isim 3 harfli degildir.");
    	}
    	
    	
    	System.out.println("\n *******   Ternary ile cozum      *******");

    	String sonuc=isim.length()==3 ? ((c1!=c2 && c2!=c3 && c1!=c3) ? "Girilen isim: 3 harfli ve unique" : 
    		"Girilen isim: 3 harfli ve unique degil"): "Uc harfli bir isim degil";
    	System.out.println(sonuc);
    	
    	scan.close();
    }   
}