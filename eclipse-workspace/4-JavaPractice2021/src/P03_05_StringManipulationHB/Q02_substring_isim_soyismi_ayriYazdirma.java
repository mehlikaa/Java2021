package P03_05_StringManipulationHB;

import java.util.Scanner;

public class Q02_substring_isim_soyismi_ayriYazdirma {
    public static void main(String[] args) {
        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        // ad ayrı soyad ayrı sekilde ekrana yazdırınız.
    	
    	// --me --
    	Scanner scan=new Scanner(System.in);
    	System.out.print("Isim ve soyisiminizi giriniz :");
    	
    	String isimSoyisim=scan.nextLine();
    	
    	String isim=isimSoyisim.substring(0,isimSoyisim.indexOf(" "));
    	String soyisim=isimSoyisim.substring(isimSoyisim.indexOf(" ")+1);
      
       System.out.println("Isim :"+isim.toUpperCase().charAt(0)+isim.substring(1)+"\nSoyisim :"+soyisim.toUpperCase().charAt(0)+soyisim.substring(1));
       scan.close();
       //----me ----
    }
}
