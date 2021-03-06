package day33_stringBuilder;

public class C05_subSquence {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Java ne kadar kolay");
		
		//tersten yazdirma
		System.out.println(sb);
		
		// substring tur string olur
		// string manipulasyonlari uygularsiniz. 
		// toString de oyle
		
		sb.substring(14);
		System.out.println(sb);  //stringe cevirdi ve islem atanmadi eskiyi yazdirdi.
		System.out.println(sb.substring(14));   //kolay       14ten sonrasini verdi
		System.out.println(sb.substring(10));  // kolay
		
		System.out.println(sb.subSequence(14, 19));	// kolay
		
		//subString bize string dondurudugu icin, immutable evet ve
		// yine . koyarak string kmutlari kullanilabilir.
		
		// subsequnce ve substring ayni sonucu verir ama
		// substring string classindan geldigi icin string metodlairni kullanabiliriz
		// subseqence de bu mumkun
		
		
		System.out.println(sb.substring(10).charAt(0));
		
		System.out.print("Stringe cevirdim : length  "+ sb.toString().length());
		// string metodlarini kullanabiliirim
		 
		//length ile capacity farkli olabilir.
		// capacityyi lengthe dusurur. kapasiteyi dusurmek hafizayi geresi zkullanan alnalari cikartir
		
		sb.trimToSize();
		
	}
}
