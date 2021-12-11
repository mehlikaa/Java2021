package day38_overriding;

public class Baliklar extends Animals {

	public static void main(String[] args) {

		Baliklar balik1=new Baliklar();
		balik1.beslenme();    //bu classta bu metoda yok ve parenttan bilgiyi alir.
	
		balik1.hareket();		// kendisinde bu meod var mi bakar. Parenta giitmez.Kendi verisini alir.
	
		balik1.solunum();		// kendisinde bu meod var mi bakar. Parenta giitmez. Kendi verisini alir.

	}

	public void hareket() {
		System.out.println("Baliklar yuzerek hareket eder.");
	}

	public void solunum() {
		System.out.println("Baliklar solungaclari ile nefes alir.");
	}
}
