package day37_inheritance;

public class Corolla extends Toyota {


		
		String renk;
		int fiyat;
		boolean elektrikliMi;
		
		int tekerSayisi=4;
		String uretimYeri="Turkiye";
		
		
		public static void main(String[] args) {
			
			           Corolla                 arb1             =              new        Corolla();
			//class ismi&Data turu    obje ismi   assignment  keyword    Constructor call
			           
			//Javada obje olusturdugumuz her class ismi ayni zamanda bir data turudur
			//bu ornegimiz icin Corolla hem class adi hem de olusturdugumuz arb1 objesinin data typedir.
		
			           System.out.println("arb1.calisiyorMu : "+arb1.calisiyorMu);     // extendden parenta bak, toyota da yook parenta git Araba da var
			           System.out.println("\narb1.tekerSayisi : "+arb1.tekerSayisi); // kendisinde var mi? varsa yazdirir yoksa parentalara sira ile gider			           
			           System.out.println("arb1.uretim Yeri :"+arb1.uretimYeri); 
			           
			           Toyota arb2=new Corolla();  //artik Corolla sinifini goremem data turun Toyota
			           												// Corolla cons kulaniliyor ama onemli degil data turu onemli
			          // tum toyotalar icin ortak ozellik icin Toyota DataTuru
			           
			           //Araba icin genel bilgi uretmek icin Arab Data Turu
			           //ama Corolla icin specifik bir data icin ozellikler icin ,
			           //butun arabalarla ilgili soylenecekler Araba da soylenebilir.
			           //Corolla icinde Arabalar icin genel bir ozellik soylenemez gecerkli olmaz
			           //isciler icin soylenecekler Ustabasindan soylenemez
			           
			           System.out.println("arb2.calisiyorMu : "+arb2.calisiyorMu);     
			           System.out.println("\narb2.tekerSayisi : "+arb2.tekerSayisi);   
			           System.out.println("arb1.calisiyorMu : ");    
			           
			           Araba arb3=new Corolla(); 
			           String str=new String("Filiz");
	}

}
