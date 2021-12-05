package Day03_homeworks;

import java.util.Scanner;

public class H02_Karenin_Cevresi_Alani {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Karenin bir kenar uzunlugunu giriniz ;");
		int kenar=scan.nextInt();
		int cevre=kenar*4;
		int alan=kenar*kenar;
		
		System.out.println("Bir kenari "+ kenar + " olan karenin ");
		System.out.println("Cevresi ; "+ cevre);
		System.out.println("Alani ; "+ alan);
		
		scan.close();
	}
}
