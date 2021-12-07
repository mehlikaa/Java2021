package Day13_stringManipulations;

import java.util.Scanner;

public class C01_startsWith_EndsWith {

	public static void main(String[] args) {
		// startswith
		//endswith
		
		//Kullancicdan bir cumle istenir
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir cumle giriniz");
		
		String cumle=scan.nextLine();
		
		if (cumle.startsWith("meh")) {
			if (cumle.endsWith("gmail.com")) {
			System.out.println("Dogru bir giris yaptiniz");
			} else {
			System.out.println("  \"@gmail.com \" ile biten,gecerli bir email adresi giriniz.");
			} 
		}  else {
			System.out.println(" \"meh \" ile baslayan bir email adresi giriniz");
		}
		
		scan.close();
	}
}

