package day33_stringBuilder;

public class C05_reverse {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Java ne kadar kolay");
		
		//tersten yazdirma
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		
		//1. indexi k ile degistir
		sb.setCharAt(1, 'k');
		System.out.println(sb);
	}

}
