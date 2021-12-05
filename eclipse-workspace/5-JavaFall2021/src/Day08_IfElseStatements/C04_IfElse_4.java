package Day08_IfElseStatements;

import java.util.Scanner;

public class C04_IfElse_4 {

	public static void main(String[] args) {
		
		//Bir ucgenin uc kenar uzunlugunu alin
		// olculer esit ise ekrana Ëskenar Ucgen"yazdirin
		// Degilse
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Ucgenin kenar olculerini giriniz : \n (ilk keanr olcusunden sonra enterá basiniz)");
		int k1=scan.nextInt();
		int k2=scan.nextInt();
		int k3=scan.nextInt();

		//     System.out.print("Ucgenin 1. kenar olcusunu giriniz :");
		//     int k1=scan.nextInt();
		//       System.out.print("Ucgenin 1. kenar olcusunu giriniz :");
		//       int k2=scan.nextInt();
		//         System.out.print("Ucgenin 1. kenar olcusunu giriniz :");
		//         int k3=scan.nextInt();
		
		//  if ((k1==k2) && (k1==k3) && (k2==k3)) {
		if ((k1==k2) && (k2==k3)) {
			System.out.println("Ucgeniniz Eskenar Ucgendir.");
		}
		else {
			System.out.println("Ucgeniniz Eskenar Ucgen degildir.");
		}
		
		scan.close();
	}

}
