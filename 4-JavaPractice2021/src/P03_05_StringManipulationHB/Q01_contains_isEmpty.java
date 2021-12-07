package P03_05_StringManipulationHB;

import java.util.Scanner;

public class Q01_contains_isEmpty {
    public static void main(String[] args) {
        //ME - Kullanıcıdan alacağını bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
    	
    	Scanner scan=new Scanner(System.in);
    	System.out.print("Bir string giriniz : ");
    	
    	String str=scan.nextLine();
    	
    	boolean varMi=str.contains(" ");
    	
    	System.out.println("Girilen string'te bosluk var mi?"+varMi);
    	

        // Kullanıcıdan alacağını bir stringin bos olup olmadığını kontrol ediniz.
    	
    	System.out.println("Girilen string bos mu?" + str.isEmpty());
    	
    

    	// --me --
    	boolean varMisin=str.contains(" ");
    	System.out.println("--me--Girilen string'te bosluk var mi?"+varMisin);
    	
       System.out.println("--me--Girilen string bos mu? "+str.isEmpty());   //hiclik kontorlu
   		// ---- me ----
       scan.close();
    }
}

