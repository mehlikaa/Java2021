package Day13_stringManipulations;

public class C03_Replace {

	public static void main(String[] args) {
		// replace ile bosluklari kaldiralim
	
		String str="Java ogrenmek cok zevkli ve cok eglenceli";
		
		System.out.println(str);
				
		System.out.println(str.replace(" ",""));
		
		System.out.println(str.replace("ogrenmek","kodunu ogrenmek"));
		
		System.out.println(str.replace("cok" , "coooook"));
		
		System.out.println(str.replace('a', 'x'));
		
		// char ile degisiklik replace kullanilabilir.
		// Ama replaceAll kkullanilamaz.

	}

}
