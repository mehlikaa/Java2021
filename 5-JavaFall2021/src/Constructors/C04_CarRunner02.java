package Constructors;

public class C04_CarRunner02 {

	public static void main(String[] args) {
		// ilk deger atamasi yapmadan bos bir car olusturmak istiyorsak
		// default constructor yeterli olur
		
		C01 car1=new C01();
		// farkli classslrda ayni isimde methodlar olusturulabilir
		// ama car1é ait butun degerleri tek tek atamam gerekir
		
		car1.ilanNo=1003;
		car1.fiyat=10000;
		car1.marka= "Toyota";
		car1.model="Corolla";
		car1.yil=2021;
		//eger obj olustururken deger de atamak istersek , oarametreli constructior olusturmamiz gerekir..
		// parametreli constructor olusturmamiz gerekir
		// parametresiz de olmali (bulunsun)
		C01 car2=new C01(1004,"Honda", "civic", 2010 , 20000) ;
			
			System.out.println(car2.fiyat + ",\n"+car2.ilanNo+ ",\n"+car2.marka+",\n"+car2.model+ ","+car2.yil);
				// 0,0,null,null,0
		    	// eslestirecek atama yapacak bir araciya ihtiyac var
				// constructorlar da localdir C01ín local
		
		C01 car3=new C01(1005,"Mercedes",50000);
			System.out.println(car3.fiyat + ",\n"+car3.ilanNo+ ",\n"+car3.marka+",\n"+car3.model+ ","+car3.yil);
		//50000, 1005, Mercedes, null,0   // son 2 default degerler cunku verilmedi , default degerler atayabiliriz
		// 50000, 1005, Mercedes, Girilmedi,0 , son iki default atandigi icin artik default degerleri atadi
	
			C01 car4=new C01();
			System.out.println(car4.fiyat + ",\n"+car4.ilanNo+ ",\n"+car4.marka+",\n"+car4.model+ ","+car4.yil);
		
	}

}
