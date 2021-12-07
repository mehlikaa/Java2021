package Day10_Ternary_SwitchCase;

public class C09_SwitchCase {

	public static void main(String[] args) {
		// Harfe gore notlari yazdirma
		
		char not='C';
		
		switch(not) {
		
		case 'A':
			System.out.println("85-100 arasi");
			break;
			
		case 'B':
			System.out.println("60-85 arasi");
			break;		
			
		case 'C':
			System.out.println("50-60 arasi");
			break;
			
		case 'D':
			System.out.println("50'den kucuk ");
			break;
		
		default:
			System.out.println("Gecersiz Not, Gecerli bir giris yapiniz.");
			break;
		}

	}

}
