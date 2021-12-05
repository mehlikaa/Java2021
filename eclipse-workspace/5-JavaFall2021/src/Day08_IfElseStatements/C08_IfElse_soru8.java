package Day08_IfElseStatements;

import java.util.Scanner;

public class C08_IfElse_soru8 {

	public static void main(String[] args) {
		// Soru 8 : Kullanicidan maas icin bir teklif isteyin
		/* ve asagidaki degerlere gore cevap yazdiriniz.
		 * Teklif 80000'in uzerinde ise, "Kabul ediyorum "
		 * Teklif 60.000- 80.000 arasinda ise, "Konusulabilir "
		 * Teklif 60.000'in altinda ise, "Malesef kabul edemem."yazdiriniz.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Maas icin bir teklif giriniz : ");
		
		int teklif=scan.nextInt();
		
		if (teklif>80000) {
			System.out.println("Kabul ediyorum.");
		}
		else if (teklif>60000) {
			System.out.println("Konusulabilir.");
		}
		else {
			System.out.println("Malesef kabul edemem.");
		}
		scan.close();
	}

}
