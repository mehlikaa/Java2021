package day36_inheritance;

import day35_encapsulation_inheritance.Isci;

public class UstaBasi extends Isci {

	UstaBasi(int x){
		System.out.println(x+ "  Ustabasi parametresiz cons ");
		
	}
	
	public static void main(String[] args) {
		
		UstaBasi ust1=new UstaBasi(3);
		// eger child icinde iseniz Java, her constructorun icine Super Child ekler.
	}

}
