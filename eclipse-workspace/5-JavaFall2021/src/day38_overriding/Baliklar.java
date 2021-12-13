package day38_overriding;

public class Baliklar extends Animals {

	public static void main(String[] args) {

		Baliklar balik1=new Baliklar();
		balik1.beslenme();    //bu classta bu metoda yok ve parenttan bilgiyi alir.
	
		balik1.hareket();		// kendisinde bu meod var mi bakar. Parenta giitmez.Kendi verisini alir.
	
		balik1.solunum();		// kendisinde bu meod var mi bakar. Parenta giitmez. Kendi verisini alir.
		
		// 3 metod call oldugunda , kendisinde ise alir, yoksa parenttan alir.
		
		
		//Child classtaki bir metod parent classtan bir metodu override yapiyorsa istersek, annotation, 
		//notasyon @Override ile edebiliriz.
		// Etmesek de kod calisir. Ama declare ettigimizde overriden parenttaki metodu 
		// hep kontrol eder ve bir degisiklik olursa CTE verir.  parenttan o metodu silemeyiz.
	}
	
// overriding
	@Override
	public void hareket() {
		System.out.println("Baliklar yuzerek hareket eder.");
	}

	public void solunum() {
		System.out.println("Baliklar solungaclari ile nefes alir.");
	}
	
	
//	public void solunum() {
//		System.out.println("Baliklar solungaclari ile nefes alir.");
//		System.out.println("Ayni isimde ve signitureda iki metod yazmamiza java izin vermez cte");
//	}
	
	
}
