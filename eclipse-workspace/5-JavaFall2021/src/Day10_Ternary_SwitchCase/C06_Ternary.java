package Day10_Ternary_SwitchCase;

public class C06_Ternary {
	
	public static void main(String[] args) {
		
		// Soru 2 : Kullanicidan bir harf isteyin
		// buyuk harf ise consola  "Buyuk harf"
		// kucuk harf ise consola  "Kucuk harf"
		//  harf degil ise, consola  "Lutfen harf giriniz."

		char krk = 'G';
		String sonuc = (krk>='a' && krk <= 'z' ? "Kucuk harf" : (krk>='A' && krk <= 'Z' ? "Buyuk harf" : 
			            "Lutfen harf giriniz"));
		System.out.println(sonuc);
		
		
		
	}
}
