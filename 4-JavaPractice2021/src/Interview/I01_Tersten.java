package Interview;

import java.util.Arrays;
import java.util.Scanner;

public class I01_Tersten {

	public static void main(String[] args) {
		
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Bir metin giriniz :");
		 String cumle=scan.nextLine();
		
		System.out.println(cumle);
		cumle=cumle.trim().replaceAll("\\s", "&");
																System.out.println(cumle);
		String arr[]=new String[cumle.length()];
	
		for (int i = 0; i < arr.length; i++) {
			arr[i]=cumle.substring(cumle.length()-1-i,cumle.length()-i);
			//System.out.println(cumle.length()-1-i); 
			}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("=====bitti=======");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].replace("&", " "));
		}
	
	}

}
