package Day08_IfElseStatements;

import java.util.Scanner;

public class C07_IfElse_Not {

	public static void main(String[] args) {
		// Not istenir
	 	/*  0'an kucuk ve 100'den buyuk ise ; "Lutfen gecerli bir not giriniz."
	 	 * 50'den kucuk ise "D"
	 	 * 50-60 arasi "C"
	 	 * 60- 80 "B"
	 	 * 80 ustu ise "A
	 	 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen notunuzu giriniz :");
		
		double not=scan.nextDouble();
		
		if (not<0 || not>100) {
			System.out.println("Lutfen gecerli bir not giriniz.");
		
		}  else if (not<50) {
			System.out.println("Notunuz : D ");
		}  
		
			else if (not<60) {
			System.out.println("Notunuz : C ");
		}  
			else if (not<80) {
			System.out.println("Notunuz : B ");
		}
			else {
			System.out.println("Notunuz : A ");
		}
		scan.close();
		
	}

}
