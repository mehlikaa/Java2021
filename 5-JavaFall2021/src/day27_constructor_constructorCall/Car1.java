package day27_constructor_constructorCall;

public class Car1 {

	
	int yil = 2000;
	String renk;
	String model;
	int km;
	boolean satilikMi;
	

	public Car1(int km, String model, String renk, String yil, boolean satilikMi) {
		
		// atama yapacagimiz tum ozellikleri paramete olaarak yolladik
		
	} // 5 ozelligi degirstiren bir konstructor urettigimde, Java default constí siler.
		// bana etkisi ,deaful bos constructori kullanan objeler kodlar coker.
		// bu durumda daha onceden yazilan


	public Car1() {
		// bos cons. bunun olusmasini istiyor
		// bos cons. uretmenin syntaxí Class adi + () + {}
		// Car1(){}   yada public eklenebilir
	}





	public Car1(int i) {
		
		km=i;

	}


	public Car1(int i, int j) {
		//      yil       km
		yil=i;
		km=j;
	}


	public void hiz(int hiz) {
		System.out.println("araba saatte " + hiz + " km yapar");
	}

	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak " + yakit + " kullanir");
	}
}
