package HB14_encapsulation;

public class ArabaMain {

	public static void main(String[] args) {
		
		Araba honda=new Araba();	//p.siz constdan honda objesi olustu
		
		honda.setMotor(300);			// - deger alamamamli yanlis
		honda.setModel("Civic");		// civiccc ismi yanlis olmamali
		honda.setYil(20212); 			// yanlis girisleri kontrol edilmeli
		
		honda.getModel();
		
		System.out.println(honda.getYil());
		

		
		Araba volvo=new Araba("xc90", "beyaz",20,2020);	//p.siz constdan honda objesi olustu
		
		Araba ww=new Araba("Passat", "Kirmizi",1600,-2021);	//p.siz constdan honda objesi olustu
		
		System.out.println("Sectiginiz arac volvo: "+ "  Model : "+volvo.getModel()+"    Motor : "+volvo.getMotor()+"    Renk : "+volvo.getRenk()+"    Yil : "+volvo.getYil());
		System.out.println("Sectiginiz arac ww: "+ "    Model : "+ ww.getModel()+"  Motor : "+ww.getMotor()+"  Renk : "+ww.getRenk()+"    Yil : "+ww.getYil());

	}

}
