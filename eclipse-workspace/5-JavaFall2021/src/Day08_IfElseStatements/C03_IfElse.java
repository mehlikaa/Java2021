package Day08_IfElseStatements;

import java.util.Scanner;

public class C03_IfElse {

	public static void main(String[] args) {
		
		//Kullaniciya yasi sorulur. 
		// 65'ten kucuk ise, "Emekli olamazsiniz, calismaya devam"
		// 65'ten buyuk ve esit ise,  "Emekli Olabilirsini."
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Yasinizi giriniz : ");
		int yas=scan.nextInt();
		
		if  (yas<65) {
			System.out.println("Emekli olamazsiniz, calismaya devam");
		}
		else {
			System.out.println("Emekli olabilirsiniz");
			
		}
		scan.close();

	}

}
