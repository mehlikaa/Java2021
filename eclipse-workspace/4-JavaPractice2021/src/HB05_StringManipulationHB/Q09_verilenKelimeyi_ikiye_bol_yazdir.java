package HB05_StringManipulationHB;

import java.util.Scanner;

public class Q09_verilenKelimeyi_ikiye_bol_yazdir {

    public static void main(String[] args) {

		/*
				StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */
    	// -- me --
    	Scanner scan=new Scanner(System.in);
    	System.out.print("Karakter sayisi cift olan bir kelime giriniz : ");
    	
    	String kelime=scan.next();
    	String kes1=null;
    	String kes2=null;
    	int length=0;
    	
    	length=kelime.length();
    	kes1 = kelime.substring(0,(length/2));
    	kes2= kelime.substring(length/2);
    	
    	System.out.println("Kelimenizin iki bolumu : "+ kes1+" "+kes2);
    	// --daha kisa
    	System.out.print("----tekrar--");
    	System.out.print("\nKelimenizin iki bolumu(kisa) : "+kelime.substring(0,(length/2))+" "+kelime.substring(length/2));
    	
       
    	scan.close();
       
    }
}
