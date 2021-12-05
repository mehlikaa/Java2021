package Day03_homeworks;

import java.util.Scanner;

public class H04_Dikdortgen_Prizma {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Dikdortgenler Prizmasinin kisa kenar uzunlugunu yazin. ");
		int kisaKenar=scan.nextInt();
		System.out.println("Dikdortgenler Prizmasinin uzun kenar uzunlugunu yazin. ");
		int uzunKenar=scan.nextInt(); 
		System.out.println("Dikdortgenler Prizmasinin yukseklik uzunlugunu yazin. ");
		int yukseklik=scan.nextInt();
		System.out.println("Dikdortgenler Prizmasinin olculeri ; " + kisaKenar + ", " + uzunKenar + ", " + yukseklik);
		int hacim=kisaKenar*uzunKenar*yukseklik;
		System.out.println("Dikdortgenler Prizmasinin Hacmi : "+hacim);
		
		scan.close();
	}

}
