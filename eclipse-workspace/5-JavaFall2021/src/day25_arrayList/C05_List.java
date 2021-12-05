package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_List {

	public static void main(String[] args) {
		// verilen bir listede icinde belirli buir harf olan elemanlari
		// silen bir metod yaziniz.

		List<String> str=new ArrayList<>();
		
		str.add("Jeyhun");
		str.add("Yildiz");
		str.add("Mustafa");
		str.add("Tugba");
		str.add("Turgat");
		str.add("Ades");
		str.add("hdgtr");
		str.add("Tiuryd");
		str.add("Turgat");
		
		System.out.println(str);
		String silinecekHarf="a";
		
		killThemAll(str, silinecekHarf);
		str= killThemAll(str, silinecekHarf);	//strin son hali denebililr
		
		
	}

	private static List<String> killThemAll(List<String> str, String silinecekHarf) {
		// stringlerden oluan bir list donmeli; List<String>
		
		for(int i=0; i<str.size();i++) {
			if(str.get(i).contains(silinecekHarf)||str.get(i).contains(silinecekHarf.toUpperCase())) {
				
				str.remove(i);
				i--;
			}
		}
		System.out.println("List : "+ str);
		
		
		return str; //return type hersey olur.once null yazip sonra degistirebiliriz
	}

}
