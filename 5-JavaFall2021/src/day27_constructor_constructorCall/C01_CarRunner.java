package day27_constructor_constructorCall;

import day26_forEachLoop_constructor.Car;

public class C01_CarRunner {
	public static void main(String[] args) {
		// Dunku Car clss'indan bir obje olusturmak istedigimizde
		// java Car class'ini icinde bulundugumuz class'a import etmek ister

		Car1 car = new Car1();
		System.out.println(car.yil);
		// ancak baska package'da oldugu icin icinde oldugumuz class'dan
		// Car class'indaki variable'lara ulasabilmem icin variable'in axcess modifier'i
		// public olmalidir

		Car1 car1 = new Car1();
		System.out.println("\nCar1 :\n" + car1.km + " \n" + car1.model + " \n" + car1.renk + " \n" + car1.yil + " \n"
				+ car1.satilikMi);
		// 0 null null 2000 false

		car1.km = 75000;
		car1.model = "Corolla";
		car1.renk = "Kirmizi";
		System.out.println("\nCar2 :\n" + car1.km + " \n" + car1.model + " \n" + car1.renk + " \n" + car1.yil + " \n"
				+ car1.satilikMi);
		// 75000 Corolla Kirmizi 2000 false

		Car1 car3 = new Car1();
		car3.km = 40000;
		car3.satilikMi = true;
		System.out.println("\nCar3 :\n" + car3.km + " \n" + car3.model + " \n" + car3.renk + " \n" + car3.yil + " \n"
				+ car3.satilikMi);

	}
}