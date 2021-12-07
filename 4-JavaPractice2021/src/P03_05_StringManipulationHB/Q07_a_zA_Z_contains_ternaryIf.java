package P03_05_StringManipulationHB;

import java.util.Scanner;

public class Q07_a_zA_Z_contains_ternaryIf {

	public static void main(String[] args) {
        /*
         Kullanicidan(Scanner) bir isim(string) isteyiniz ve isim sadece 3(lenght) harfli olmalidir ternary
         kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         Test data: ali eme all
         */
// -- me --
    	Scanner scan=new Scanner(System.in);
    	System.out.print("3 harfli bir isim giriniz : ");
    	
    	String isim=scan.next();
		char i1=isim.charAt(0);
		char i2=isim.charAt(1);
		char i3=isim.charAt(2);

    	if (isim.contains("[a-zA-Z]")) {
    	
    		if (isim.length()>=4 || isim.length()<3) {
    			System.out.print("3 karakterli bir isim girmelisiniz");
    		} else {
    			System.out.print("YES! 3 karakterli bir isim");

    			System.out.println((i1!=i2 && i2!=i3 && i1!=i3) ? ("\nIsminiz unique"):("\nSorry, Isminiz unique harfli degil"));
    		} 		
    		
    		String sonuc=null;
    		sonuc=isim.length()==3 ? ((i1!=i2 && i2!=i3 && i1!=i3) ? "\nIsminiz, 3 harfli ve unique" : "\nSorry, Isminiz 3 harfli ama unique degil") : "Yanlis giris"; 
    		System.out.println(sonuc);
    		}
    	    else {
    	    	System.out.println("Sayi giremezsiniz");
    		}
    	scan.close();
    	// ---- me ----
	}

}
