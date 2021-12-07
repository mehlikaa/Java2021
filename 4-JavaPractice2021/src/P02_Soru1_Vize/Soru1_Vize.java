package P02_Soru1_Vize;

import java.util.Scanner;

public class Soru1_Vize {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);     // kullanicidan veri istenir.
		System.out.print("Vize notunuzu giriniz : "); //kod kozmetigi, ayni satirda yazsin
		double vize=scan.nextDouble();
		
		// System.out.print("Vize sinavi yuzdesini giriniz : ");
		// double vizeYuzdesi=scan.nextDouble();
		
		System.out.print("Final notunuzu giriniz : ");
		double fnl= scan.nextDouble();
		
		//System.out.print("Vize sinavi yuzdesini giriniz : ");
		// double fnlYuzdesi=scan.nextDouble();
		
		// double gecmeNotu= (vize*vizeYuzdesi/100 + fnl*fnlYuzdesi/100)/2 ;
		double gecmeNotu= (vize*0.40 + fnl*0.60)/2 ;
		System.out.println("gecmeNotu : "+ gecmeNotu);
			
		if (gecmeNotu>=90) {
			System.out.println("Gecme notunuz : AA" );
		} else if (gecmeNotu>= 80) {
			System.out.println("Gecme notunuz : BA" );	
		} else if (gecmeNotu>= 70) {
			System.out.println("Gecme notunuz : BB" );	
		} else if (gecmeNotu>= 60) {
			System.out.println("Gecme notunuz : CB" );
		} else if (gecmeNotu>= 50) {
			System.out.println("Gecme notunuz : CC" );
		} else if (gecmeNotu>= 40) {
			System.out.println("Gecme notunuz : DC" );
		} else if (gecmeNotu>= 30) {
			System.out.println("Gecme notunuz : DD" );
		} else  {
			System.out.println("Gecme notunuz : FF |n Kaldiniz :(" );
			
		scan.close();
		}
	}

}
