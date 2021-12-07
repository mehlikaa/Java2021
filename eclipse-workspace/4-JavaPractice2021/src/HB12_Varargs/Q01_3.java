package HB12_Varargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q01_3 {

	public static void main(String[] args) {
		
//		Scanner scan=new Scanner(System.in);
//		String concat="";
//		
//		//System.out.print ("Bir harf girip entera basiniz, cikmak icin q'ya basiniz.");
//			char bas='a';
//			System.out.print("Harf giriniz : ");
//			bas=scan.next().charAt(0);
//			
//			List<String> list=new ArrayList<>();
//			concat(list);
		
		concat("h","a","c","e","r");
		concat("Hacer", " hanim", " basarili", " qa");
	}

	private static void concat(String ... str) {
	
		String yeniStr="";
		
		for(String w:str) {
			//yeniStr+=str;
			yeniStr=yeniStr.concat(w);
		}
		System.out.println("Concatlanmis : "+ yeniStr);
	}

}
