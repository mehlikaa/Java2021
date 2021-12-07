package TC45_interfaces_Tofas;

public class SahinRunner {

	public static void main(String[] args) {
		// main actim obje uretebilirim
		
		sahin s1=new sahin();
		s1.ayna();
		s1.ebat();
		s1.jant();
		s1.kapi();
		s1.kaporta();
		s1.koltuk();
		s1.motor();
		s1.sunroof();
		s1.yakit();
		// s1.music();  //final variablei almak kullanmak istiyorum.
					//obje ile gelmedi. 
		//ic donanimda tanimlama basina static yazsam. farketmedi
		
		System.out.println(IcDonanim.music); //ic donanimda create edilmis onun ismi ile
		System.out.println(sahin.music);		// implement ettigi icin sahinden de gelebilir.
		
		// s1.kumas="deri"; //final variable assignment yapilamaz
		
		System.out.println(IcDonanim.RENK);
		System.out.println(DisDonanim.RENK);
		System.out.println(Lastik.RENK);
		
		// System.out.println(s1.RENK);  //ambigous belirsiz hangisini getirmeliyim karar veremez
		

	}

}
