package day42_Abstract;

public class Ustabasi extends Isci {

	public void statu() {
		System.out.println("Bu classdaki tum perseonel ustabasidir. Imza ustabasi");
	}
	public void maas() {
		System.out.println("Bu classdaki tum kisiler aylik 1000 tl alir. Imza ustabasi");
	}
	public void mesai() {
		System.out.println("Ustabasi ariza durumunda ariza coulunceye kadar calisir.. Imza ustabasi");
	}
	
	//obje olusturdugumuz en alttaki classlardaki ozellikleri yada metodlari override edince 
	
// ama clasik parent child ilskisinde , tum metodlari override etme mecburiyeti yoktur.
	
	// Java parent classlardaki tum metodlari override etmek mecburiyeti kazandirmak icin,
	// abstract class yapisini olusturmustur.
	
	// yani bir classi abstract olarak tanimlarsaniz child classlar tum metodlari
	// override etmek zorunda kalacak
	
	// dolayisi ile abstract yaptigimiz parent classlar sadece kalip gorevi yapacaklar.
	public static void main(String[] args) {
		Ustabasi ust1=new Ustabasi();
		ust1.statu();
		ust1.maas();
		ust1.mesai();
	}

	
	
	
}
