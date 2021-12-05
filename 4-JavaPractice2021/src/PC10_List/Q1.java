package PC10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {

	public static void main(String[] args) {
		//List create
		
		List<String> list1=new ArrayList(Arrays.asList("Ali","Veli","Fatma","Omer"));
		List<String>list2=new ArrayList<>();
		
		for(String w:list1) {
			if (!w.toLowerCase().contains("a")) {
				list2.add(w);
		
			} 
		}
		System.out.println("List 1 : "+ list1);
		System.out.println("List 2 : "+ list2);
		
	}

}
