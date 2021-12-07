package HB08_while_dowhile__l;

import java.util.Scanner;

public class Q08_me {

	// ---- me ----// ok
	public static void main(String[] args) {
		// Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.
        Scanner scan = new Scanner(System.in);
        int enbSayi = 0;
        int count = 0;
        
        while(count<5) {
        	System.out.print((count+1)+". sayiyi giriniz : ");
        	int sayi=scan.nextInt();
        	
        	if(sayi>enbSayi) {
        		enbSayi=sayi;
        		
        	}
        	count++;
        	
        }
        System.out.print("En buyuk sayimiz : "+enbSayi);

        
	}

}
