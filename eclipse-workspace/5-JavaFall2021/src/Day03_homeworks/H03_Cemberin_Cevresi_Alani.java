package Day03_homeworks;

import java.util.Scanner;

public class H03_Cemberin_Cevresi_Alani {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Cemberin yaricapini yaziniz.");
		double yaricap=scan.nextDouble();
		double cevre= 2 * 3.14*yaricap;
		double alan=yaricap*yaricap*3.14;
		System.out.println("Cemberin cevresi ; "+ cevre);
		System.out.println("Dairenin Alani ; "+ alan);
		
		scan.close();
	}
}
