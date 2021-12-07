package Day10_Ternary_SwitchCase;

import java.util.Scanner;

public class C04_Ternary_Soru4 {

	public static void main(String[] args) {
		
		// Kullanicidan sayi istenir
		// Sayi negatif mi pozitif mi yazdirilir.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz.");
		
		double sayi=scan.nextDouble();
		
		System.out.println(sayi<0 ? "Negatif Sayi" : "Pozitif Sayi");
		// kabul etmedi 
		// sayi>0 ? System.out.println("Negatif Sayi") : System.out.println("Pozitif Sayi");
		// sadece sonuc dondurmek istiyor
		
		
		
		
		
		scan.close();

	}

}
