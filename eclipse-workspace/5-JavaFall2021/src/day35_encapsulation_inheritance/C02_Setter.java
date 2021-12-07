package day35_encapsulation_inheritance;

public class C02_Setter {

	public static void main(String[] args) {
		//ogretmenler ogrencinin notunu girsin ama tum notlari goremesin sadece
		// gecip gecmedigini gorsun.
		
		C01 ogr1=new C01();
		
		System.out.println(ogr1.isGecerMi());
		 // ogr1.isGecerMi()=10;			atama yapamam izin yok sadece get

		ogr1.setNot(60);		//metod ise  degeri (parametre) olarak yazilir.
		System.out.println(ogr1.isGecerMi());
	}

}
