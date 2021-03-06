package PC10_List_Hbeyden;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
    /*
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulunuz. Sonucu ekrana yazdırınız.
    */
    List<String> list=new ArrayList<>();
    Scanner scan=new Scanner(System.in);
    
    System.out.println("Listeye eklemek istediginiz sayilari giriniz. q ile cikiniz.");
    
    int toplam=0; 
    String islem="";
   
    while(!islem.equalsIgnoreCase("q")) {
    	System.out.print("Sayi giriniz : ");
    	islem=scan.next();
    	list.add(islem);	
	}
    list.remove(list.size()-1);
    
    System.out.println("Listem : "+list);
    Collections.sort(list);
    System.out.println("Sorttan sonra Listem : "+list);
    
    int karetop=0;
    
    for (String w:list) {
		int a=Integer.parseInt(w);
		karetop+=a*a;
		System.out.println("a : "+a + "  Karetoplami : "+karetop);
	}
    
    System.out.println("Kare Toplamlari"+karetop);
    }
}
