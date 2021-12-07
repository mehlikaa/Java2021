package P02_Soru1_Vize;

import java.util.Scanner;

public class Soru5_Nested_SayiNegatifPozitif {

	public static void main(String[] args) {
		
		//Sayi isteyiniz. 0 ve buyukse "Positif
		//Sayi 0'dan kucukse "Negatif"

		Scanner scan=new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		double sayi=scan.nextDouble();
		
		System.out.println("******* Ternary Cozum *****\n");
		
		String sonuc = (sayi>=0 ? (sayi<10 ? "Pozitif ve 10'dan kucuk sayi" : "Pozitif") : "Negatif");
		System.out.print(sonuc);
		
		System.out.print("\n\n ********  Nested If Cozumu  ********\n ");
		
		
		if (sayi>=0) {
			if (sayi<10) {
				System.out.print("Sayi Pozitif ve 10'dan kucuk");
			} else  {
				System.out.print("Sayiniz Pozitif ");
			} 
		    } else {
				System.out.print("Sayiniz Negatif ");
			}
			
			
		scan.close();
	}

}
