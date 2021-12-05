package day27_constructor_constructorCall;

public class TirRunner {

	public static void main(String[] args) {
		
		// bir tane tum ozellikleri degistiren bir constructor olustralim

		Tir tir1=new Tir(5000, "Axtor","Beyaz", 2020, false );
		System.out.println("Km : "+ tir1.km+"\nModel : "+tir1.model+"\nRenk :"+tir1.renk+"\nYil : "+tir1.yil+ "\nSatilik Mi : "+tir1.satilikMi);
	
		
		//ilk ucunu degistiren bir constructor olusturalim
		//"Km : "+ tir1.km+"\nModel : "+tir1.model+"\nRenk :"+tir1.renk
		
		Tir tir2=new Tir(12000, "kara", "Mor"); //Castadia
		System.out.println("Km : "+ tir2.km+"\nModel : "+tir2.model+"\nRenk :"+tir2.renk+"\nYil : "+tir1.yil+ "\nSatilik Mi : "+tir1.satilikMi);
		// Km : 12000	Model : kara	Renk :Mor	Yil : 2020(default)	Satilik Mi : false (default)
		
		Tir tir3=new Tir("Ne Olacak Bakalim"); 
		
		System.out.println("Km : "+ tir2.km+"\nModel : "+tir2.model+"\nRenk :"+tir2.renk+"\nYil : "+tir1.yil+ "\nSatilik Mi : "+tir1.satilikMi);
	
	}

}
