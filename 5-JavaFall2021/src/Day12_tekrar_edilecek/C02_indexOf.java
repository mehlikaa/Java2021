package Day12_tekrar_edilecek;

import java.util.Scanner;

public class C02_indexOf {

	public static void main(String[] args) {
		
		//        kopyala
		 // Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, 
        //      kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //      - Girilen kelime cumlede kullanilmamis.
        //      - Girilen kelime cumlede 1 kere kullanilmis.
        //      - Girilen kelime cumlede 1’den fazla kullanilmis.
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        
        String cumle=scan.nextLine();
        System.out.println("Lutfen varligini kontrol etmek icin bir kelime giriniz");
        
        String kelime=scan.next();
        
        int index=cumle.indexOf(kelime);
        
        if (index<0) {
            System.out.println("Girilen kelime cumlede kullanilmamis");
        } else if (cumle.indexOf(kelime, index+1)==(-1)){
            
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
            
        }else {
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
        }

       

		// Soru 2:  ME

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz.");
		
		String cumle=scan.nextLine();
		System.out.println("Lutfen varligini kontrol etmek icin bir kelime giriniz");
		
		String kelime=scan.next();
		
		int index=cumle.indexOf(kelime);
		
		if (index<0) {
			System.out.println("Girilen kelime cumlede kullanilmamistir.");
		} else if (cumle.indexOf(kelime, index+1)<0) {		
			
			System.out.println("Girilen kelime cumlede kullanimistir.") ;
		} else {
			System.out.println("Olmadi else");
		}
	}

}