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
	}

}
