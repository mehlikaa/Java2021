package day31_dateAndTime;

import java.time.LocalDateTime;

public class C03_localDateTime {

	public static void main(String[] args) {
		
		LocalDateTime tarihSaat= LocalDateTime.now();	//2021-12-02T12:40:10.159808
		System.out.println(tarihSaat);
		tarihSaat.toString();
		System.out.println(tarihSaat.toString());  // stringe cevirir 
																	// String manipulation kullanilabiilir
	
		System.out.println(tarihSaat.toString().startsWith("2021"));		// true
	
		
	
	
	
	}

}
