package HB13_stringBuilder;

import java.util.Scanner;

public class Q01 {
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
    	StringBuilder sb=new StringBuilder(scan.nextLine());
    	System.out.println("Metnimiz          : "+ sb);
    	
    	StringBuilder sbtut=sb;
    	// StringBuilder sbters=sb.reverse();
    	 //System.out.println("Metnimizin tersi : "+ sbters);
    	
    	//System.out.println(sb+" "+sb.reverse());
    	if(sb==sb.reverse()){
    		System.out.println("Metnimiz bir polindromdir. ");
    	} else {
    		System.out.println("Polindrom bir metin degildir. ");
    	}
    }

}
