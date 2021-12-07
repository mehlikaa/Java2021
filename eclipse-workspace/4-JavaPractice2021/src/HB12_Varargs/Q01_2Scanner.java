package HB12_Varargs;

import java.util.Scanner;

public class Q01_2Scanner {

	public static void main(String[] args) {
		//  verilen Stringleri birlestiren concat isimli bir method olusturunuz
		// input : "m", "e", "r", "v", "e";
		// output : merve

		Scanner scan=new Scanner(System.in);
		String concat="";
		
		//System.out.print ("Bir harf girip entera basiniz, cikmak icin q'ya basiniz.");
		char bas='a';
		while(bas!='q') {
			System.out.print("Harf giriniz : ");
			bas=scan.next().charAt(0);
			
			if(bas=='q'||bas=='Q') {
				//System.out.println("Q ile ciktiniz");
				break;
			}else if ((bas>= 'a')||(bas<='z')) {
				concat+=bas;
			} else {
				System.out.println("Bir harf giriniz lutfen");
			}
				
		}		// concat("m","e","r","v","e");
		System.out.println("Girdiginiz harflerin birlesimi: "+ concat);
	}


	private static void concat(String... isim) {
		
		String concat="";
		
		for(String i: isim) {
			concat+=i;
		}
		System.out.println(concat);
	}

	}


