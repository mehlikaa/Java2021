package Day10_Ternary_SwitchCase;

public class C11_SM_Concatenation {

	public static void main(String[] args) {
		
		// String olarak verilen bir degisken + ile baska bir degiskenle
		// isleme sokulursa Java bunlari yanyana ekler. Concatenation
		
		String isim= "Ali";
		String soyisim ="Can";
		
		System.out.println(isim + " "+soyisim);
		
		// ayni islemi + sembolu yerine concat() ile de yaptirabiliriz
		
		System.out.println(isim.concat(soyisim));              // AliCan
		System.out.println(isim.concat(" ").concat(soyisim));  //Ali Can
		
		String birlestir =isim.concat(soyisim);
		System.out.println(birlestir);
		
		System.out.println(isim.concat(" ").concat(soyisim).concat(" ").concat(isim));
		
	}
	
	
}
