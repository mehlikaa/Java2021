package Day10_Ternary_SwitchCase;

public class c05_NestedTernary {

	public static void main(String[] args) {
		
		// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir.
		//  Eger calisan erkekse 65 yasindan buyuk oldugunda emekli olabilir.

		// her seferinde scanner olusturmak yerine 
		// test datalarimizi variable olarak da olusturabiliiriz
		// ve kod yazimi bittiginde, bu test datalarini degistirerek
		// kodlarimizi test edebiliriz
		
		char cinsiyet ='E';
		int yas= 67 ;
		
		String sonuc = cinsiyet=='K' ? (yas>=60 ? "Emekli olabilirsiniz." :"Emekli olamazsiniz.") : (yas>=65 ? "Emekli olabilirsiniz." :"Emekli olamazsiniz.") ;
		
		System.out.println(sonuc);
		
	}

}
