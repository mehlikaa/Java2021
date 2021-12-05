package Day09_Nested_IfElse;

public class C03_TernaryOperator {

	public static void main(String[] args) {
		
		int x=10;
		
		String tekMiCiftMi = x/2== 0 ? "Cift Sayi" : "Tek Sayi" ;   // cift
		
		System.out.println(x%2==0 ? "Cift Sayi" : "Tek Sayi");
		
		// Iki turlu kullanilabilir
		// ya donen sonuca gore bir variable olusturup assign ederiz.
		// veya direk syso icine yazip sonucu yazdiririz
		
		
		// eger ternary de donecek sonuclar ayni datanturunden degilse
		// atama yapamayiz, sadece syso ile yazdirabiliriz
		
		System.out.println(x>5 ? "Aferin" : 4);    // Aferin
		
		// String sonuc == x>5 ? "Aferin"; 

	}

}
