package P02_Soru1_Vize;

import java.util.Scanner;

public class Soru2_2Sayiyi_IstenenIslemYaptir {

	public static void main(String[] args) {
	
	//Soru1 Kullanicidan 2 sayi istenir
	// Dort islemden istenen islem yaptirirlir
	
	Scanner scan=new Scanner(System.in);
	System.out.print("Birinci sayinizi yaziniz  : ");
	double sayi1=scan.nextDouble();
	
	System.out.print("Ikinci sayinizi yaziniz  : ");
	double sayi2=scan.nextDouble();
	
	System.out.println("Hangi islemi yaptirmak istersiniz? \n"
			       + "Toplama => 1 \nCikarma => 2 \nCarpma icin => 3 \nBolme => 4 ");
	int islem=scan.nextInt();
	
	if (islem==1) {
		System.out.print("Toplama isleminizin sonucu : "+ (sayi1+sayi2));
		
		} else if (islem==2) {
			System.out.print("Cikartma isleminizin sonucu : "+ (sayi1-sayi2));
		} else if (islem==3) {
			System.out.print("Carpma isleminizin sonucu : "+ (sayi1*sayi2));
		} else if (islem==4) {
			System.out.print("Bolme isleminizin sonucu : "+ (sayi1/sayi2));
		} else {
			System.out.print("Gecerli bir giris yapiniz.");
		}
	scan.close();
	}
			
}

