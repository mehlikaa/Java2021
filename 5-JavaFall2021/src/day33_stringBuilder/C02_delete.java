package day33_stringBuilder;

public class C02_delete {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Java candir can");
		System.out.println("Metnim   :   "+sb);
		
		sb.deleteCharAt(11);
		System.out.println("Delete 11.indexteki karakteri sildim : "+sb);
		
		sb.delete(11,13);
		System.out.println("Delete 11.'den 13'e indexteki karakteri sildim : "+sb);
		
		sb.delete(5,20);
		System.out.println("Delete 5.'den 20'e indexteki karakteri sildim : "+sb);
	}


}
