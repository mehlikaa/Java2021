package HB05_StringManipulationHB;

import java.util.Scanner;

public class Q10_isimSoiyisim_kartNo {
    public static void main(String[] args) {
        /*

         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */
    	Scanner scan=new Scanner(System.in);

    	System.out.print("Isminizi giriniz :");
    	String isim=scan.nextLine().toUpperCase(); 
    	
    	System.out.print("Soyisminizi giriniz : ");
    	String soyisim=scan.nextLine().toUpperCase(); 
    	
    	System.out.print("Kredi numaranizi (**** **** **** **** seklinde) giriniz : ");  	

    	String kartNo=scan.nextLine(); 
    
    	/// ??? neden kart numarasi yazmama izin vermiyor
    	// isim soyisim next ve kart nextLine oldugunda karti sormadan sonuca geciyor ???
    	// hepsi nextline oldugunda sorun yok 
    	
    	if(kartNo.length()<19 ||kartNo.length()>19 ) {
    		System.out.println("16 haneli bir kredi karti numarasi girmelisiniz."+kartNo.length());
    	} else {
    		System.out.println("Kredi Kart Numaraniz : **** **** **** "+kartNo.substring(15));
    		kartNo = kartNo.substring(0,15).replaceAll("\\w","*")+kartNo.substring(15);
    	}
    	
    	System.out.println("Isminiz : "+isim.charAt(0)+(isim.substring(1).replaceAll("\\w", "*")));
    	System.out.println("Soyisminiz : "+soyisim.charAt(0)+(soyisim.substring(1).replaceAll("\\w", "*")));
    	System.out.println("Kredi Kart Numaraniz : "+kartNo);
    }
}
