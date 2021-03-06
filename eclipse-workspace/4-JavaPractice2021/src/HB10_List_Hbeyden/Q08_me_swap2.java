package HB10_List_Hbeyden;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q08_me_swap2 {

	public static void main(String[] args) { 
		 /*
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         */
		Scanner scan=new Scanner(System.in);
		List<String> list=new  ArrayList<>();
		
		System.out.println("10 elemanli bir liste icin, giris yapiniz .");
		for (int i = 0; i < 10; i++) {
			System.out.print((i+1)+". elemani giriniz.");
			list.add(scan.next());	
		}
		System.out.println("Ilk listem    : "+list);
		
		Collections.sort(list);
		System.out.println("Sort ile listem : "+list);
		
		degistir(list);	
	}

	private static void degistir(List<String> list) {
		// swap metodu
    	String degis="";
    	degis=list.get(2);
    	list.set(2, list.get(7));
    	list.set(7, degis);
    	
    	System.out.println("Listem          : "+list);
		
	}

}
