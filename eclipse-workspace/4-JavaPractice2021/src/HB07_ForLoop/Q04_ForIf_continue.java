package HB07_ForLoop;

import java.util.Scanner;

public class Q04_ForIf_continue {

	public static void main(String[] args) {
		
        // Kullanıcıdan 5 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        // bu soruyu continue kullanarak çözünüz.

	// ---- me OK ----//
		
		
        Scanner scan=new Scanner(System.in);
        
        int topla=0;
        int sayi=0;
        
        for(int i=0;i<5;i++) {
        	System.out.print("Bir sayi giriniz : ");
        	sayi=scan.nextInt();
        	if(sayi>5&&sayi<11) {
        		System.out.println("5-10 arasinda toplanmayacak.");
        		continue;
        	}
        	topla+=sayi;
        }
        
        System.out.println("Toplam : "+topla);
        
	}

}
