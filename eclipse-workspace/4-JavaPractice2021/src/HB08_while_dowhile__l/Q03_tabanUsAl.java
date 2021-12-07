package HB08_while_dowhile__l;

import java.util.Scanner;

public class Q03_tabanUsAl {

	public static void main(String[] args) {
        // Kullanicidan 2 sayi alaliniz.
        //1. sayi taban
        //2. sayi Ust
        //1 sayinin ussunu hesaplatan code create edinim.
        // 3, 3  sonuc = 27

        //2  3 = 2*2*2=8
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Bir sayi giriniz : ");
		int sayi=scan.nextInt();
		System.out.print("Bir ust degeri giriniz : ");
		int us=scan.nextInt();
		
		int sonuc=1;
		while(us!=0)
		{	
			sonuc*=sayi;
			us--;
			
		}
        System.out.println("Cevap: " + sonuc);

        scan.close();
	}

}
