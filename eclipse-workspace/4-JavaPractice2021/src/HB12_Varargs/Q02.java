package HB12_Varargs;

import java.util.ArrayList;
import java.util.Arrays;

public class Q02 {
	public static void main(String[] args) {
		         // verilen int lerden ilki haric tum sayilari toplayan ve
				// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.

		//List<Integer> sayi1=new ArrayList<>(Arrays.asList( 2,5,12, 14, 8, 19));
		//list degil array calisilabilir
		
		toplaCarp( 2,5,10,15,20);
		toplaCarp( 2,5,12, 14, 8, 19);
		
	}

	private static void toplaCarp(int i, int... sayilar) {
		int topla=0;
		for(int x:sayilar) 
		{
			topla+=x;
		}
		
		System.out.println("Birden sonraki sayilarin, toplamii: "+ topla);
		System.out.println("Birden sonraki sayilarin, toplami ile ilk sayinin carpimi: "+ topla*i);
	}

}
