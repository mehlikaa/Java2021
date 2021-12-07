package day33_stringBuilder;

public class C04_insert {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Java ogrendik");
		
		// araya cok iyi ekleyelim
		
		sb.insert(4, "yi cok iyi");
		System.out.println(sb);
		
		// sonuna , yasasin! eklesek
		
//		sb.append(", yasasin!");
//		System.out.println(sb);
		
		sb.insert(6, " cok iyiyim", 0, 4); // sb de 5.den basla bu cumledeki 0-4 arasini al araya koy
		System.out.println(sb);
		
		sb.replace(7, 10, "pek");  //replace
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}

}
