package P02_Soru1_Vize;

import java.util.Scanner;

public class Soru3_VucutKitleIndeksi {

	public static void main(String[] args) {
		
		// Kullanicidan boyunu cm ve kilosunu kg degerini alarak; BMI (VKE) hesaplanir
		// BMI = kilo(kg) / (boy/100*boy/100)(cm)
		//		BMI<=20 oldukca zayifsiniz
		// 20< BMI < =25 Normal sinirlardasiniz 
		// 25< BMI < =30  Sisman kategorisindesin
		// 30< BMI        Obez grubundasiniz
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen boyunuzu girinis : ");
		double boy=scan.nextDouble();
		System.out.print("Lutfen kilonuzu girinis : ");
		double kilo =scan.nextDouble();
		
		double bmi= kilo / (boy/100*boy/100);
		System.out.println(bmi);
		
		if (bmi<=20) {
			System.out.print("Oldukca zayifsiniz ");
		} else if (20<bmi && bmi<=25) {
			System.out.print("Normalsiniz ");
		} else if (25<bmi && bmi<=30) {
			System.out.print("Sisman kategorisindesiniz ");
		} else  {
			System.out.print("Obez grubundasiniz ");
		}
		scan.close();
	}   

}
