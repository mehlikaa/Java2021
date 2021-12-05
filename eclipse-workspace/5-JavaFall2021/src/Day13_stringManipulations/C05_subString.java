package Day13_stringManipulations;

public class C05_subString {

	public static void main(String[] args) {
		//Java en son ne soylenirse onu baz alir
		
		
		// uzun bosluklari kaldirma \\s+
		
		String cumle="Bence Java hep cok zevkli";
		
		System.out.println(cumle+"\n");
		
		cumle=cumle.substring(0);
			
		System.out.println(cumle+"\n");
		
		cumle=cumle.substring(5);
		
		System.out.println(cumle+"\n");
		
		// 20'de hiclik verir. ve sonrasi 
		// index out of bounds
		//cumlenin sinirini asti hata verir
		cumle=cumle.substring(20);
		
		System.out.println(cumle+"\n");
		
		String str="Bence Javalarlandgiller hep cok cok cok cooooook zevkli";
		// (8,4) 8 den sonra 4. index gelemez hata verir. 
		// (8,12) 8.index dahil ama 12. dahil degil
		System.out.println(str.substring(2,3));
		// 2. indexten basla 3. cuyu alma
		
		System.out.println(str.substring(8,12));
}
}
