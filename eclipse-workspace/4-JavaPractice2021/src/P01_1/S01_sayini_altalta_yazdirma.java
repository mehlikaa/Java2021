package P01_1;

import java.util.Scanner;

public class S01_sayini_altalta_yazdirma {
	public static void main(String[] args) {
		//verilen sayinin rakamlarini yukaridan asagi yazdirma
		//ex ; input ; 12345
		// output 1
		//        2
		//        3
		//        4
		//        5
		
		Scanner scan=new Scanner(System.in);

		
		System.out.println("Sayinizi yaziniz ; ");
		int sayiniz=scan.nextInt();
		
		int birler=sayiniz%10;
		//  System.out.println(birler);
		sayiniz/=10;

		
		int onlar=sayiniz%10;
		//  System.out.println(onlar);
		sayiniz/=10;
		
		int yuzler=sayiniz%10;
		//  System.out.println(yuzler);
		sayiniz/=10;
		
		int binler=sayiniz%10;
		//  System.out.println(binler);
		sayiniz/=10;
		
		int onbinler=sayiniz%10;
		// System.out.println(onbinler);
		sayiniz/=10;
		
		System.out.println(onbinler);
		System.out.println(binler);
		System.out.println(yuzler);
		System.out.println(onlar);
		System.out.println(birler);
		
		
		scan.close();
		
	}

}
