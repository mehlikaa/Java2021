package CG02_Constructors;

public class Car {

	int yil = 8;
	String model;
	String renk;
	int motor;
	int beygir;
	boolean satilik;
	int sayi;

	public Car(int yil1, String model) {

		this.model = model;
		this.yil = yil1;
	}

	Car() {

	}

	public Car(int yil, String model, String renk, int beygirc, int t) {
		beygir = beygirc;

	}

	public Car(int i, String string, String string2, int j, int k, boolean b) {

		yil = i;
		model = string;
		renk = string2;
		motor = j;
		beygir = k;
		satilik = b;

	}
	

	public Car(String string, String string2, int i, int j, boolean b, int k) {

	}

}
