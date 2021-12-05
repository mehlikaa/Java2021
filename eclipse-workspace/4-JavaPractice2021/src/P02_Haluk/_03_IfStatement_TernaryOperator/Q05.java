package P02_Haluk._03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// Kullanicidan  yasini ve kilosunu alaliniz
		// 18 yasindan kucuk ise kan bagisi yapamaz
		// 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		// 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
// ME
		Scanner scan=new Scanner(System.in);
		System.out.print("Yasinizi giriniz");
		int yas=scan.nextInt();	

		
		if (yas<18) {
			System.out.print("18 yas alti, \n Bagis yapamazsiniz.");			
		} else {
			System.out.print("Kilonuzu giriniz");
			int kilo=scan.nextInt();
			
			if (kilo<50) {
			System.out.print("Kilonuz yeterli degil. \n Bagis yapamazsiniz.");
			} else {
			System.out.print("Bagis yapabilirsiniz.");
			}		
		}

	}

}
