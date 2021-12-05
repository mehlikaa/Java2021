package Day10_Ternary_SwitchCase;

public class C07_switchCase {
	public static void main(String[] args) {
		// gun numarasi girip gun ismini yazdirma
		
		
		int gunNo = 5;
		
		switch (gunNo) {   //baslayacagi yeri soyler ve sonrasini yazadirir.
		
		case 1 :
			System.out.println("Bugun gunlerden; Pazartesi");
			break;
		case 2 :
			System.out.println("Bugun gunlerden; Sali");
			break;
		case 3 :
			System.out.println("Bugun gunlerden; Carsamba");
			break;
		case 4 :
			System.out.println("Bugun gunlerden; Persembe");
			break;
		case 5 :
			System.out.println("Bugun gunlerden; Cuma");
			break;
		case 6 :
			System.out.println("Bugun gunlerden; Cumartesi");
			break;
		case 7 :
			System.out.println("Bugun gunlerden; Pazar");
			break;
		default:
			System.out.println("1'de 7é kadar bir deger giriniz.");
			
		}
		
	}

}
