package Day10_Ternary_SwitchCase;

public class C10_SwitchCase_Soru3 {

	public static void main(String[] args) {
		
		// Soru3 : Kullanicidan bir sayi girmesini isteyin
		//  Girilen sayi
		// 10 ise “Iki basamakli en kucuk sayi 
		// 100 ise “uc basamakli en kucuk sayi”
		// 1000 ise “dort basamakli en kucuk sayi”
		// diger durumlarda “Girdigin sayiyi degistir” yazdirin
		
		int sayi=1000;
		
		switch(sayi) {
		
		case 10:
			System.out.println("Sayiniz en kucuk 2 haneli sayidir.");
			break;
		
		case 100:
			System.out.println("Sayiniz en kucuk 3 haneli sayidir.");
			break;
			
		case 1000:
			System.out.println("Sayiniz en kucuk 4 haneli sayidir.");
			break;
			
		case 10000:
			System.out.println("Sayiniz en kucuk 5 hanelisayidir.");
			break;
		
			default:
				System.out.println("Gecerli(10-100-1000-10000-100000) bir sayi giriniz");
				
			
				
		
		}
	}
}
