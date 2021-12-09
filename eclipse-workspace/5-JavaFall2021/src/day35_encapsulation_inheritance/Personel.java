package day35_encapsulation_inheritance;

public class Personel {

	protected String isim;
	protected String soyisim;
	protected boolean calisiyorMu;
	protected String telNo;
	protected int yas;
	
	Personel(){
		System.out.println("Personelden gelen constructor");
	}
	
	// eger variablelara Access Modifier yazmasak default Access Modifier atar ve
	// sadece o package altindaki Child Classlar, personal classini  inheriit edebilir
	// baska packege lardaki child classlarin da Personel Inherit edebilmesi icin 
	// variable ve metodlarin access modifierlari Protected yazmliyiz.
	// public yapsak da inheerit edilebilir ama biz sadece child cllasslarin inherit
	// edilmesini istedigimiz icin , protected tercih ederiz.
	
	
	public static void main(String[] args) {
	
	
	}
}
