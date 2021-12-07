package HB12_Varargs;

public class Q01 {
	public static void main(String[] args) {
		//  verilen Stringleri birlestiren concat isimli bir method olusturunuz
		// input : "m", "e", "r", "v", "e";
		// output : merve

		
		concat("m","e","r","v","e");
		
	}

	private static void concat(String... isim) {
		
		String concat="";
		
		for(String i: isim) {
			concat+=i;
		}
		System.out.println(concat);
	}

}
