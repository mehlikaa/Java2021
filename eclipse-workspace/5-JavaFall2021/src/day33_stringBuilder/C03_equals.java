package day33_stringBuilder;

public class C03_equals {

	public static void main(String[] args) {
	
		StringBuilder sb1=new StringBuilder("Java");	//false
		StringBuilder sb2=new StringBuilder("Java");	//false
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		System.out.println(sb1.compareTo(sb2));
		
		sb1.insert(0, "Jeva");
		System.out.println(sb1.compareTo(sb2));  // 4 degisen karakter  ne kadar geride 4
		
		sb1.insert(0, "java");
		System.out.println(sb1.compareTo(sb2));  //   32
		
		String str="Java";
		// System.out.println(sb1==str);   farklilar olmaz dedi
		
		System.out.println(sb1.equals(str));		//false
		
		// System.out.println(sb1.compareTo(str));   Kullanilamaz
									//The method compareTo(StringBuilder) in the type StringBuilder is not applicable for the arguments (String)
	
		// System.out.println(sb1=="Java");   string kabul edmem diyor
	
		System.out.println(sb1.equals("Java")); 	//false
		// System.out.println(sb1.compareTo("Java"));
		
		
		
		
		
		//==============
		StringBuilder sb1 = new StringBuilder("Java");
		StringBuilder sb2 = new StringBuilder("Java");
		
		System.out.println(sb1==sb2); // false
		System.out.println(sb1.equals(sb2)); // false
		// sb'da equals method'u String'deki mantikla calismaz, == mantigi ile calisir
		
		System.out.println(sb1.compareTo(sb2)); // 0
		// Ilk harflerden baslayarak bire bire sb'lari karsilastirir
		// eger tum karakterler ayni ise sonuc olarak 0 doner
		// farkli karakter bulursa ilk yazilan sb, ikinci yazilandan kac char onde onu doner
		//orjinal metin mi?
		
		// eger iki sb'in esit olup olmadigini anlamak istersek
		// if (sb1.compareTo(sb2)==0) ile bakabiliriz
		
		String str3 = "Java";
		
		// System.out.println(sb1==str);  == sb ile String'i karsilastiramaz
		 System.out.println(sb1.equals(str3)); // false
		// System.out.println(sb1.compareTo(str)); compare String icin kullanilamaz
		 
		
		//  System.out.println(sb1=="Java");
		 System.out.println(sb1.equals("Java")); // false
		// System.out.println(sb1.compareTo("Java"));
	}

}
