package CG01_;

import java.util.Scanner;

public class CG07_Soru8 {

	public static void main(String[] args) {
		// Kullaniciya gunde kac saat uyudugu sorulur
		// ayda yilda kac gununuz uyudugu hesaplanir
		// 40 yilda kac gununuz uykuyla geciyor
		
		Scanner scan=new Scanner(System.in);
		System.out.print("1 gunde kac saat uyuyrsunuz?");
		double uykusaati=scan.nextDouble();
		
		double ay_uyku=(uykusaati*30)/24;  //5 ise 6.25 olmali
		double yil_uyku=ay_uyku*12;                          // 6 ise 7.5
		
		System.out.println("Ayda "+ ay_uyku + " saatiniz uykuda geciyor");
		System.out.println("Yilda "+ yil_uyku + " saatiniz uykuda geciyor");
		System.out.println("40 yilda "+ yil_uyku*40 + " saatiniz uykuda geciyor");
		
		
	}

}
