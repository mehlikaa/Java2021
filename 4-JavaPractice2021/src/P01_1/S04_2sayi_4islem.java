package P01_1;

import java.util.Scanner;

public class S04_2sayi_4islem {
	public static void main(String[] args) {
	//Kullanicidan 2 tam sayi alip, dort islem yaptiralim
	
	Scanner scan=new Scanner(System.in);
	
	System.out.print("Birinci sayinizi giriniz ; ");
	int sayi1=scan.nextInt();
	
	System.out.print("Ikinci sayinizi giriniz ; ");
	int sayi2=scan.nextInt();
    // UZUN YONTEM	
	int topla=sayi1+sayi2;
	int fark=sayi1-sayi2;
	int carp=sayi1*sayi2;
	int bol=sayi1/sayi2;
	
	System.out.println("Sayilinizin Toplami ; "+topla);
	System.out.println("Sayilinizin Farki   ; "+fark);
	System.out.println("Sayilinizin Carpimi ; "+carp);
	System.out.println("Sayilinizin Bolumu  ; "+bol);
	//	
	System.out.println("\n");
	//2.YONTEM
	System.out.println("Sayilinizin Toplami ; "+(sayi1+sayi2));
	System.out.println("Sayilinizin Farki   ; "+(sayi1-sayi2));
	System.out.println("Sayilinizin Carpimi ; "+(sayi1*sayi2));
	System.out.println("Sayilinizin Bolumu  ; "+(sayi1/sayi2));
	//
	System.out.println("\n");
	// 3.YONTEM
	System.out.println("Sayilinizin Toplami ; "+(sayi1+sayi2)+
			           "\nSayilinizin Farki   ; "+(sayi1-sayi2)+
			           "\nSayilinizin Carpimi ; "+(sayi1*sayi2)+
			           "\nSayilinizin Bolumu  ; "+(sayi1/sayi2));


	
	scan.close();
	}

}
