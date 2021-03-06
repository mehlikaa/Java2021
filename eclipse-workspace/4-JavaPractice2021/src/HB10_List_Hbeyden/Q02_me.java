package HB10_List_Hbeyden;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02_me {

	public static void main(String[] args) {
	  	 //2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
	     //listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
	     //Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
	     //   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

		String[][] isimler={{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
		System.out.println("Ilk arrayim : "+ Arrays.deepToString(isimler));
		yeniList(isimler);
		
	

	}

	private static void yeniList(String[][] isimler) {
		
		List<String> list=new ArrayList<>();
		System.out.println("Ilk listem : "+ list);
		for (int kat = 0; kat < isimler.length; kat++) {
			for (int daire = 0; daire < isimler[kat].length; daire++) {
					list.add(isimler[kat][daire]);	
			}
		}
		
		System.out.println("Yeni Listem : "+ list);
		String[] sonArr=new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			sonArr[i]=list.get(i);
		}
		System.out.println("Son array  : "+ Arrays.toString(sonArr));
		
		System.out.println(" ");
		
		for (int i = 0; i < sonArr.length; i++) {
			System.out.print(sonArr[i]+" ");
		}
	}

}
