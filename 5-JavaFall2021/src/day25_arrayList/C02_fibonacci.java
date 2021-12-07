package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_fibonacci {

	public static void main(String[] args) {
		// verilen bir sayiadn kucuk  fibonacci sayilarini bir list olarak kaydedelim

		int sinir=700;
		
		List<Integer> fibonacci=new ArrayList<>();
		
		fibonacci.add(1);
		fibonacci.add(1);
		
		
		System.out.println(fibonacci);	// [1, 1]
			
		int sayi=0;
		
		while(sayi<sinir) {
			sayi=fibonacci.get(fibonacci.size()-2)+fibonacci.get(fibonacci.size()-1);
		fibonacci.add(sayi);
		}
		
		if(sayi>100) {
			fibonacci.remove(fibonacci.size()-1);
			
		}
		
		System.out.println("Son : "+fibonacci);
	}

}
