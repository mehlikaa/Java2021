package HB13_stringBuilder;

import java.util.Scanner;

public class Q01_HB {

	public static void main(String[] args) {	
		/*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I 
	        It is not a palindrome"

		 */
    	
    	Scanner scan=new Scanner(System.in);
    	System.out.print("Bir metin giriniz : ");
    	String metin=scan.nextLine();
    	
    	StringBuilder sB=new StringBuilder(metin);
    	
    	String tersMetin=sB.reverse().toString();
    	
    	if(metin==tersMetin) {
    		System.out.println("Oldu");
    	}

// 
Scanner ekran=new Scanner(System.in);
System.out.println("Kontrol edilecek bir cümler girin ;");

StringBuilder sb=new StringBuilder(ekran.nextLine());
System.out.println("Sümlenin tersi"+sb.reverse());
if (sb.toString().equalsIgnoreCase(sb.reverse().toString())) {
System.out.println(sb+" Cümlesi polidrondur");
}else {
System.out.println(sb+"cümlesi polidron degildir.");
}
    ekran.close();
    
	}
}

