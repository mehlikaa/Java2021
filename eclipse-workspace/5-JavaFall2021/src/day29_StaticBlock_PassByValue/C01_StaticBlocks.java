package day29_StaticBlock_PassByValue;


 	public class C01_StaticBlocks {
	
	
	static {
		System.out.println("1. static blok, mainden onceki");
	}

	public static void main(String[] args) {

		System.out.println("Ben main metoddan geliyorumi");

	}

	static {
		System.out.println("2. static blok, mainden sonra");
	}
	// Normalde islem sirasi main metodla baslar. 
	// Mainden once yapmak istedigimiz islemler var ise, 
	// static blok kullanarak mainden once istedigimizi yapabiliriz.
	// eger birden fazla static blok varsa Java yukaridakini daha once calistirir
}
