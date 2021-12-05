package TC45_interfaces_Tofas;

public interface IcDonanim {
	
	abstract void koltuk();  // abstract metod abstract keyword kullanilmis 
	public void ayna();	    //abstract metod but abstract keyword kullanilmamis
	
	static String music="underground";  //bold-italic==> finaldir
	// String kumas;  //final oldugu icin, declare edildikten sonra defaultu yok initialze edilmeli
	// degeri olmayan initialize edilmeyen bir veri final olamaz
	
	public static String kumas="kadife";        // public yada static olsa da olur olmasa da
	
	String RENK="ahsap"; 	//public static final
	
	
	
	
	
	//Interface de
	//Variablelar access modifier yazsaniz da yazmazsaniz  da Publictir
}	//variablelarin anahtar keywordleri Flanldir yazsaniz da yazmasaniz da
	// 				yazsaniz yazmasaniz da statictirler

