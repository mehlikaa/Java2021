package Day13_stringManipulations;

public class C05_replaceAll_spacesKaldirma {

	public static void main(String[] args) {
		// uzun bosluklari kaldirma \\s+
		
		String cumle="Bence     Java    hep      cok       zevkli";
		
		System.out.println(cumle+"\n");
		
		System.out.println(cumle.replaceAll("[a-e]","c")+"\n");
		
		cumle= cumle.replaceAll("\\s+", " ");
		
		cumle= cumle.replaceAll("\\b", " --");
		
		System.out.println(cumle+"\n");
		
		cumle=cumle.replaceAll("[ac]", " ");
		
		System.out.println(cumle+"\n");
		
		cumle=cumle.replaceAll("\\w", "*");
		
		System.out.println(cumle+"\n");
		// -----
		
		String yeni="Bugun bayram erken kalkin";
		
		System.out.println(yeni.replaceAll("", " "));
		
		System.out.println(yeni.replaceAll("\\b", "*"));
		
		// System.out.println(yeni.toUpperCase().replaceAll("[a-z]", "*"));
		System.out.println(yeni.toLowerCase().replaceAll("[a-z]", "*"));
		
		
		
		
	
		
		
// \\s spaceleri degistirir
// \\S space disindakileri
// \\w harf olanlari
// \\W harf olmayanlari	
// \\s+ uzun bosluklari 
// \\d digit rakamlari
// \\D digit olmayanlari
		
		
		
		

	}

}
