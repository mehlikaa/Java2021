package day27_constructor_constructorCall;

public class C02_ParametreliConstructor {

	public static void main(String[] args) {

		// Java'nin olusturdugu default constructor ile obje olusturabiliyoruz,
		// ama her obje icin yeniden deger atamasi yapmak uzun oluyor
		// istersek parametreli constructorlar olusturup
		// daha obje olustururken istedigim ozellikleri atayabilirim.

		// olmaz
		// Car1 car1=new Car1(int km, String model, String renk, String yil, boolean
		// satilikMi);

		Car1 car1 = new Car1(50000, "Vectra", "Kirmizi", "2015", true); // neden alti kirmizi

		Car1 car2 = new Car1(350000); // int km

		System.out.println(car2.km);	//35000

		Car1 car3 = new Car1();

		System.out.println(car3.km);	//0
		
		Car1 car4 = new Car1(1000);

		System.out.println(car4.km);	//1000
		
		// yil ve km yi parametre olarak girebilecegeim bir cons.  daha olusturanbilir yim?
		
		Car1 car5 = new Car1(2015, 1500);
		System.out.println("Yil : "+car5.yil+ "\nModel : "+ car5.km+"\nModel :"+car5.model); 
				//Yil : 2015	Model : 1500	Model :null(default)
		
		
	}

}
