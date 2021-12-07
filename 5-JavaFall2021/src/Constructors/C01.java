package Constructors;

public class C01 {
	
	public int ilanNo=0000;
	public String marka="---" ;
	public String model="---";
	public int yil=0000;
	public int fiyat=0000;
	
	//this
	C01(int ilanNo, String marka, String model, int yil, int fiyat) {
		this.ilanNo=ilanNo;
		this.marka=marka;
		this.model=model;
		this.yil=yil;
		this.fiyat=fiyat;
		// bu classtaki (mavi)ilanNo instance variableina parametre olarak gelen (kahve)ilanNodaki degeri ata
	    //	this ile parametre ile gelen degerleri bizim instance olan variablelara  atamis olduk.
		// this olmazsa localdeki ilanNoya gider usttekine bakmaz
	}
	public C01(int ilanNo, String marka, String model) {
		super();
		this.ilanNo = ilanNo;
		this.marka = marka;
		this.model = model;
	}
	C01(){
		
	}
	C01(int ilanNo, String marka, int fiyat){ //otomatik olustruabilmek icin herseferinde ayni islem yerine
		this.ilanNo=ilanNo;           // source /generate construct
		this.marka=marka;			// otomatik olustugu gorulur
		this.fiyat=fiyat;
		
	}
	
	
	public void maxHiz(int hiz) {   //bu methoda gerek var mi?
		System.out.println("Araba "+ hiz + " km ile hiz yapabilir.");	
	
	}
	 
	public void yakit(String yakitTuru) {
		System.out.println("Araba yakit olarak, "+ yakitTuru + " kullanir.");
	}
	
	
	
}
