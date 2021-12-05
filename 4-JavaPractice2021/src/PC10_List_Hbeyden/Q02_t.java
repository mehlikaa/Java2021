package PC10_List_Hbeyden;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q02_t {

    public static void main(String[] args) {
     //2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
     //listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
     //Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
     //   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]


    	String isim[][]={{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
    	
    	yeniList(isim);
    	
    	
    }
    public static void yeniList(String[][] isim) {
    	List<String> list1=new ArrayList<>();
    	
    	for(int kat=0;kat<isim.length;kat++) {
    		for (int daire = 0; daire < isim[kat].length; daire++) {
				list1.add(isim[kat][daire]);
				
			}
    	}
    	
    	System.out.println("Ilk listem : "+ list1);
    	
    	Collections.sort(list1);
    	System.out.println("Siralamadan sonra : "+list1);
    }

}
