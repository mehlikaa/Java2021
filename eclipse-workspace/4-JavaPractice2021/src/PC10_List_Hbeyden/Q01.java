package PC10_List_Hbeyden;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01 {

    public static void main(String[] args) {
        /*
         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir program yaziniz
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

		List<String> list1=new ArrayList(Arrays.asList("Ali","Veli","Fatma","Omer"));
		List<String>list2=new ArrayList<>();
		
		List<Integer> list=new ArrayList(Arrays.asList(3,5,3,2,1,4));
		System.out.println("Deneme List  : "+ list);
		List<Integer> listim =new ArrayList<>();
		
		for(Integer me:list) {
			System.out.println("Denemem List  : "+ list);
			listim.add(list);
			System.out.println("Denemem List  : "+ list);
		}
		
		for(String w:list1) {
			if (!w.toLowerCase().contains("a")) {
				list2.add(w);
		
			} 
		}
		System.out.println("List 1 : "+ list1);
		System.out.println("List 2 : "+ list2);

    }


}
