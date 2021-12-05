package CG02_Constructors;

public class CarRunner {
	

	public static void main(String[] args) {
		
		Car obj1=new Car(2020, "Ford");
		
		Car obj2=new Car(2022, "Opel", "Kirmizi", 1200, 2000,true);
		
		Car obj4=new Car("Astra", "Beyaz", 1500, 700, true, 9);
		/*
		 * int yil=8;
		String model;
		String renk;
		int motor;
		int beygir;
		boolean satilik;
		 */

		// System.out.println("Moedelim : "+obj1.model+"\nYili1 : "+obj1.yil);
		System.out.println("Moedelim : "+obj2.model+"\nYili1    : "+obj2.yil+"\nRenk     :"+obj2.renk+"\nMotor    : "+
					obj2.motor+"\nBeygir   : "+obj2.beygir+"\nSatailik Mi :"+obj2.satilik);
		
		
	}
	
	
	

	

}
