package PC10_List_Hbeyden;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q03_me {
    public static void main(String[] args) {



    	
    	List<String> list=new ArrayList<>();
    	
    	Scanner scan=new Scanner(System.in);
    	
    	System.out.println("Liste atamak icin sayi giriniz.");
    	System.out.println("Yeterli sayiya ulastiginizda, q giriniz");
    	
    	int toplam=0;
    	String islem="";
    	
    	while (!islem.equalsIgnoreCase("q")) {
			System.out.print("Sayi giriniz :"); 
			islem=scan.next();
			list.add(islem);
			
		}
    	list.remove(list.size()-1);
    	System.out.println("Listim : "+list);
    	Collections.sort(list);
    	System.out.println("Listim : "+list);
    	
    	for(String w:list) {
    		int a=Integer.parseInt(w);
    		toplam+=a*a;
    	}
    	System.out.println("Kareleri : " +toplam);
    }
}

